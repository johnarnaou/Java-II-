public class MyUtils {

    public void QuickSort(Vessel k[], int end, String key){ //iperfortosi tis QuickSort gia strings
        Qsort(k, 0, end, key);
    }
    
    public void Qsort(Vessel k[], int start, int end, String key){ //iperfortosi tis Qsort gia strings
        int i = start;
        int j = end;
        
        if(end - start >= 1){
            String pivot = k[start].name; //edo orizeti i timi pivot gia tis sigkriseis
            
            while(j > i){
                while(k[i].name.compareTo(pivot) <= 0 && i <= end && j > i)
                    i++;
                while(k[j].name.compareTo(pivot) > 0 && j >= start && j >= i)
                    j--;
                if(j > i){
                    swap(k, i, j);
                }
            }
            swap(k, start, j); // antimetathesi ton stoixoion
            Qsort(k, start, j-1, key);
            Qsort(k, j + 1, end, key);
        } else {
            return;
        }
    }
    
    public void QuickSort(Vessel k[], int end, int key){ //iperfortosi gia integers
        Qsort(k, 0, end, key);
    }
    
    public void Qsort(Vessel k[], int start, int end, int key){ //iperfortosi gia integers
        int i = start;
        int j = end;
        
        if(end - start >= 1){
            int pivot = k[start].etos_kataskevis; //orismos tis timis pivot gia tis sigkriseis
            
            while(j > i){
                while(k[i].etos_kataskevis <= pivot && i <= end && j > i)
                    i++;
                while(k[j].etos_kataskevis > pivot && j >= start && j >= i)
                    j--;
                if(j > i){
                    swap(k, i, j);
                }
            }
            swap(k, start, j); // kalite i methodos gia tin atimetathesi ton stoixion
            Qsort(k, start, j-1, key);
            Qsort(k, j + 1, end, key);
        } else {
            return;
        }
    }
    
    public void QuickSort(Vessel k[], int end, double key){ // iperfortosi gia times double
        Qsort(k, 0, end, key);
    }
    
    public void Qsort(Vessel k[], int start, int end, double key){ // iperfortosi gia times double
        int i = start;
        int j = end;
        
        if(end - start >= 1){
            double pivot = k[start].ektopisma; //orismos tis timis pivot gia tis sigkriseis
            
            while(j > i){
                while(k[i].ektopisma <= pivot && i <= end && j > i)
                    i++;
                while(k[j].ektopisma > pivot && j >= start && j >= i)
                    j--;
                if(j > i){
                    swap(k, i, j);
                }
            }
            swap(k, start, j); // antimetathesi ton stoixeion
            Qsort(k, start, j-1, key);
            Qsort(k, j + 1, end, key);
        } else {
            return;
        }
    }
    
    public void swap (Vessel[] k, int x, int y) { // methodos antimetathesis ton antikeimenon ston pinaka
        Vessel temp = new Vessel(); 
        temp = k[x];
        k[x] = k[y];
        k[y] = temp;
    }

    public void mergeSort(Vessel[] array, int end, String overload) { //mergesort gia strings
        if (end + 1 > 1) {

            Vessel[] left = leftHalf(array, end); // dimiourgia tou protou misou pinaka xrisimopoiontas tin methodo leftHalf()
            Vessel[] right = rightHalf(array, end); // dimiourgia tou deuterou misou pinaka me tin rightHalf()

            mergeSort(left, left.length - 1, overload); // anadromiki taksinomisi
            mergeSort(right, right.length -1, overload ); // anadromiki taksinomi
            
            merge(array, left, right, end, overload); // sigxoneusi ton pinakon
        }
    }
    
    public void merge(Vessel[] result, Vessel[] left, Vessel[] right, int end, String overload) { // methodos sigxoneusis gia strings
        int i1 = 0;   // deiktis tou left array
        int i2 = 0;   // deiktis tou right array
        
        for (int i = 0; i < end+1; i++) {
            if (i2 >= right.length || (i1 < left.length && left[i1].name.compareTo(right[i2].name) <= 0)) {
                result[i] = left[i1];    // eisagogi apo ton pinaka left
                i1++;
            } else {
                result[i] = right[i2];   // eisagogi apo ton pinaka right
                i2++;
            }
        }
    }
    
        public void mergeSort(Vessel[] array, int end, int overload) { // mergesort gia integers
        if (end + 1 > 1) { //elegxos an o pinakas m exei pano apo 1 stoixio

            Vessel[] left = leftHalf(array, end); // dimirougia tou protou misou tou pinaka me tin leftHalf()
            Vessel[] right = rightHalf(array, end); // dimiourgia tou deuterou misou tou pinaka me tin rightHalf()

            mergeSort(left, left.length - 1, overload); //anadromiki taksinomisi
            mergeSort(right, right.length -1, overload ); //anadromiki taksinomisi
            
            merge(array, left, right, end, overload); // Sigxoneusi ton pinakon
        }
    }

    public void merge(Vessel[] result, Vessel[] left, Vessel[] right, int end, int overload) { // methodos sigxoneusis gia integers
        int i1 = 0;   // deiktis left array
        int i2 = 0;   // deiktis right array
        
        for (int i = 0; i < end+1; i++) {
            if (i2 >= right.length || (i1 < left.length && left[i1].etos_kataskevis <= right[i2].etos_kataskevis)) {
                result[i] = left[i1];    // eisagogi apo ton left
                i1++;
            } else {
                result[i] = right[i2];   // eisagogi apo ton right
                i2++;
            }
        }
    }
    
    public void mergeSort(Vessel[] array, int end, double overload) { // mergesort gia double
        if (end + 1 > 1) { // elegxos an o pinakas exei pano apo 1 stoixeio

            Vessel[] left = leftHalf(array, end); //dimiourgia tou protou misou tou pinaka me tin leftHalf()
            Vessel[] right = rightHalf(array, end); //dimiourgia tou deuterou misou tou pinaka me tin rightHalf()

            mergeSort(left, left.length - 1, overload); //anadromiki taksinomisi
            mergeSort(right, right.length -1, overload ); //anadromiki taksinomisi
            
            merge(array, left, right, end, overload); //sigxoneusi ton pinakon
        }
    }

    public void merge(Vessel[] result, Vessel[] left, Vessel[] right, int end, double overload) { //methodos sigxoneusis gia double
        int i1 = 0;   // deiktis left array
        int i2 = 0;   // deiktis right array
        
        for (int i = 0; i < end+1; i++) {
            if (i2 >= right.length || (i1 < left.length && left[i1].ektopisma <= right[i2].ektopisma)) {
                result[i] = left[i1];    // eisagogi apo ton left
                i1++;
            } else {
                result[i] = right[i2];   // eisagogi apo ton right
                i2++;
            }
        }
    }
    
    public Vessel[] leftHalf(Vessel[] array, int end) { //methodos pou epistrefei to proto miso tou pinana tipou Vessel
        int size1 = (end + 1) / 2; //evresi tou megethous tou pinaka left
        Vessel[] left = new Vessel[size1]; // dimiourgia tou pianaka left
        for (int i = 0; i < size1; i++) {  //gemisma tou pianaka left
            left[i] = array[i]; // eisagogi stoixion apo ton arxiko pinaka 
        }
        return left; //epistrofi tou protou misou
    }
    
    public Vessel[] rightHalf(Vessel[] array, int end) { //methodos pou epistrefei to deutero miso tou pinana tipou Vessel
        int size1 = (end+1) / 2; // megethos tou pinaka left (mas xreiazete parakato)
        int size2 = (end+1) - size1; // megethos tou piana right 
        Vessel[] right = new Vessel[size2]; // dimourgia tou pianaka right me megethos size2
        for (int i = 0; i < size2; i++) { // gemisma tou pinaka right
            right[i] = array[i + size1]; // eisagogi ton ipolipon stoixion tou arxikou pinaka
        }
        return right; //epistrofi tou right
    }
    

    public void InSort (int key,Vessel k[], int top) { // uperfortwsh gia taksinomhsh me bash to etos
        for (int i=1; i <= top; i++) {
              Vessel valueToInsert = k[i];  // timh pou eisagetai ston pinaka se auti-(i) tin epanalipsi
              int holePos = i;

              while ( (holePos > 0) && (valueToInsert.etos_kataskevis < k[holePos-1].etos_kataskevis) ) {	 
                 k[holePos] = k[holePos-1];  //metakinhsh tis megaluterhs timis pros ta panw
                     holePos = holePos-1;	 // metakinisi tis 8eshs-trupas pros ta katw
              }	 
              k[holePos] = valueToInsert;    // h 8esh trupa einai sti swsth 8esh, ara to valueToInsert topo8eteitai edw
         }        
     }

    public void InSort (double key,Vessel k[], int top) { // uperfortwsh gia taksinomhsh me bash to ektopisma
        for (int i=1; i <= top; i++) {
            Vessel valueToInsert = k[i];   // timh pou eisagetai ston pinaka se auti-(i) tin epanalipsi
            int holePos = i;
	 
            while ( (holePos > 0) && (valueToInsert.ektopisma < k[holePos-1].ektopisma) ) {	 
                k[holePos] = k[holePos-1]; //metakinhsh tis megaluterhs timis pros ta panw
		        holePos = holePos-1;	   // metakinisi tis 8eshs-trupas pros ta katw
            }	 
            k[holePos] = valueToInsert;   // h 8esh trupa einai sti swsth 8esh, ara to valueToInsert topo8eteitai edw
        }
    }

    public void InSort (String key,Vessel k[], int top) { //uperfortwsh gia taksinomhsh me bash to onoma
        for (int i=1; i <= top; i++) {
	        Vessel valueToInsert = k[i];    // timh pou eisagetai ston pinaka se auti-(i) tin epanalipsi
	        int holePos = i;
	 
	    while ( (holePos > 0) && ( valueToInsert.name.compareTo(k[holePos-1].name) < 0 ) ) {	 
	        k[holePos] = k[holePos-1];  //metakinhsh tis megaluterhs timis pros ta panw
 		    holePos = holePos-1;	    // metakinisi tis 8eshs-trupas pros ta katw
	    }	 
	    k[holePos] = valueToInsert;   // h 8esh trupa einai sti swsth 8esh, ara to valueToInsert topo8eteitai edw
        }        
    }


    public void SelSort (int key, Vessel[] k, int top) { //uperfortwsh ths SelSort gia int (etos)

        int i,j;
        int iMin;
        Vessel temp;

        for (j=0; j <= top-1; j++) {

               iMin = j; // upo8etoume oti to j stoixeio einai to elaxisto
               for ( i = j+1; i <=top; i++) {

                     if (k[i].etos_kataskevis < k[iMin].etos_kataskevis) { //an einai mikrotero tote 
                        iMin = i;                                         // krata ti 8esh tou neou elaxistou
                     }

               }
               if (iMin != j) {
                   temp = k[j];
                       k[j] = k[iMin]; //antimeta8esh tou neou elaxistou(8esh i) me to to palio (8esh j)
                       k[iMin] = temp;
               }
        }
    }

    public void SelSort (double key, Vessel[] k, int top) { //uperfortwsh ths SelSort gia double (ektopisma)

       int i,j;
       int iMin;
       Vessel temp;

       for (j=0; j <= top-1; j++) {

              iMin = j;
              for ( i = j+1; i <=top; i++) {

                    if (k[i].ektopisma < k[iMin].ektopisma) { //an einai mikrotero tote 
                       iMin = i;                              // krata ti 8esh tou neou elaxistou
                    }

              }
              if (iMin != j) {
                  temp = k[j];
                      k[j] = k[iMin];    //antimeta8esh tou neou elaxistou(8esh i) me to to palio (8esh j)
                      k[iMin] = temp;
              }
       }
    }

    public void SelSort (String key, Vessel[] k, int top) { //uperfortwsh ths SelSort gia String (onoma)

       int i,j;
       int iMin;
       Vessel temp;

       for (j=0; j <= top-1; j++) {

              iMin = j;
              for ( i = j+1; i <=top; i++) {

                    if ( k[i].name.compareTo(k[iMin].name) < 0 ) { //an einai mikrotero tote 
                       iMin = i;                                   // krata ti 8esh tou neou elaxistou
                    }

              }
              if (iMin != j) {
                  temp = k[j];
                      k[j] = k[iMin];    //antimeta8esh tou neou elaxistou(8esh i) me to to palio (8esh j)
                      k[iMin] = temp;
              }
       }
    }
    
    public void BubSort(String key, Vessel k[], int top){ //uperfortwsh tis BubSort gia strings (onoma)
        int i, j ;
        Vessel temp;
        for (i=0; i<=top; i++) {
            for(j = top ; j>i; j--) {
                if ((k[j-1].name).compareTo((k[j].name)) > 0 ) {
                   temp   = k[j-1]; //
                   k[j-1] = k[j];  //antimeta8esh twn stoixeiwn tou pinaka
                   k[j] = temp;   //
                }                                 
            }                                 
        }               
    }
    
    public void BubSort(int key, Vessel k[], int top){ // uperfortwsh tis BubSort gia int (etos)
        int i, j;
        Vessel temp;
        for (i=0; i<=top; i++) {
            for(j=top ; j>i; j--) {
                if ((k[j-1].etos_kataskevis) > (k[j].etos_kataskevis) ) {
                   temp = k[j-1];   //
                   k[j-1] = k[j];  //antimeta8esh twn stoixeiwn tou pinaka
                   k[j] = temp;   //
                }                                 
            }                                 
        }               
    }
   
    public void BubSort(double key, Vessel k[], int top){ //uperfortwsh tis BubSort gia double (ektopisma) 
        int i, j;
        Vessel temp;
        for (i=0; i<=top; i++) {
            for(j=top; j>i; j--) {
                if ( (k[j-1].ektopisma) > (k[j].ektopisma) ) {
                   temp   = k[j-1]; //
                   k[j-1] = k[j];  //antimeta8esh twn stoixeiwn tou pinaka
                   k[j] = temp;   //
                }                                 
            }                                 
        }               
    }

public void Max_Mhkos (Port[] limania) {
    
    double max = 0.0;
    int thesi_limena = 0, thesi_skafous = 0;
    
    for (int i = 0; i < limania.length; i ++) {
        
        if (limania[i] != null) {
            
            for (int y=0; y <= limania[i].top; y++) {
                
                if (limania[i].pin_skafon[y].mikos > max) {
                    
                    max = limania[i].pin_skafon[y].mikos;
                    thesi_limena = i;
                    thesi_skafous = y;                                           
                }                
            }                        
        }        
    }  
    
    System.out.println("Sto limani " + limania[thesi_limena].onoma_limena + "brisketai to skafos me to megalutero mhkos");
    
    if (limania[thesi_limena].pin_skafon[thesi_skafous] instanceof Cargo ) {
                    Cargo car = (Cargo) limania[thesi_limena].pin_skafon[thesi_skafous];                
                    System.out.println(car.toString());                                        
    }
                
   if (limania[thesi_limena].pin_skafon[thesi_skafous] instanceof Ferry ) {
                    Ferry fer = (Ferry)limania[thesi_limena].pin_skafon[thesi_skafous];                
                    System.out.println(fer.toString());                                        
    }

}
    

public void seqSearch(String key, Port k, int top){ 
        boolean found = false;
        
        for(int i=0; i<=top; i++){
            if(k.pin_skafon[i].name.equals(key) == true){
            	System.out.println("Vrethike sto limani: " + k.onoma_limena);
                
                if (k.pin_skafon[i] instanceof Cargo ) {
                    Cargo car = (Cargo) k.pin_skafon[i];                
                    System.out.println(car.toString());                                        
                }
                
                if (k.pin_skafon[i] instanceof Ferry ) {
                    Ferry fer = (Ferry) k.pin_skafon[i];                
                    System.out.println(fer.toString());                                        
                }
                
                found = true;
            }
        }
        
        if(found == false){
            System.out.println("Den vrethike to skafos me onoma " + key + "sto limani " + k.onoma_limena);
        }
        
    }
    
    public void seqSearch(int key, Port k , int top){
        boolean found = false;
        
        for(int i=0; i<=top; i++){
            if(k.pin_skafon[i].etos_kataskevis == key){
            	System.out.println("Vrethike sto limani: " + k.onoma_limena);
                
                if (k.pin_skafon[i] instanceof Cargo ) {
                    Cargo car = (Cargo) k.pin_skafon[i];                
                    System.out.println(car.toString());                                        
                }
                
                if (k.pin_skafon[i] instanceof Ferry ) {
                    Ferry fer = (Ferry) k.pin_skafon[i];                
                    System.out.println(fer.toString());                                        
                }
                
                found = true;
            }
        }
        
        if(found == false){
            System.out.println("Den vrethikan skafoi kataskevasmena to etos: " + key + "sto limani " + k.onoma_limena);
        }
        
    }
    
    public void seqSearch(double key, Port k, int top){
        boolean found = false;
        
        for(int i=0; i<=top; i++){
            if(k.pin_skafon[i].ektopisma == key){
            	System.out.println("Vrethike sto limani: " + k.onoma_limena);
                
                if (k.pin_skafon[i] instanceof Cargo ) {
                    Cargo car = (Cargo) k.pin_skafon[i];                
                    System.out.println(car.toString());                                        
                }
                
                if (k.pin_skafon[i] instanceof Ferry ) {
                    Ferry fer = (Ferry) k.pin_skafon[i];                
                    System.out.println(fer.toString());                                        
                }
                
                found = true;
            }
        }
        
        if(found == false){
            System.out.println("Den vrethikan skafoi me ektopisma: " + key + "sto limani " + k.onoma_limena);
        }
        
    }
    
    public void binSearch(int key, Port k, int low, int high){
        int position = -1, mid, arithmos = high;
        while(position == -1 && low <= high){
            mid = (low + high)/2;
            if(key < k.pin_skafon[mid].etos_kataskevis){
                high = mid - 1;
            } else if(key > k.pin_skafon[mid].etos_kataskevis){
                low = mid + 1;
            } else {
                position = mid;
            }
        }
        //efoson vrethike stixeio
        if(position != -1){
            // sarosi deksia kai aristera tou stoixeio gia tixon parapano apotelesmata
            int pos1 = position;
            do {
            	System.out.println("Vrethike sto limani: " + k.onoma_limena);
                System.out.println(k.pin_skafon[pos1].toString());
                pos1 = pos1 + 1;
            }while(pos1 < arithmos && k.pin_skafon[position].etos_kataskevis == k.pin_skafon[pos1].etos_kataskevis);
            pos1 = position - 1;
            while(pos1 > 0 && k.pin_skafon[position].etos_kataskevis == k.pin_skafon[pos1].etos_kataskevis){
            	System.out.println("Vrethike sto limani: " + k.onoma_limena);
                System.out.println(k.pin_skafon[pos1].toString());
                pos1 = pos1 - 1;
            }
        } else {
            System.out.println("Den vrethikan skafoi kataskevasmena to etos: " + key);
        }
    }
    
    public void binSearch(String key, Port k, int low, int high){
        int position = -1, mid, arithmos = high;
        while(position == -1 && low <= high){
            mid = (low + high)/2;
            if(key.compareTo(k.pin_skafon[mid].name) < 0){
                high = mid - 1;
            } else if(key.compareTo(k.pin_skafon[mid].name) > 0){
                low = mid + 1;
            } else {
                position = mid;
            }
        }
        
        if(position != -1){
            int pos1 = position;
            // sarosi deksia kai aristera tou stoixeio gia tixon parapano apotelesmata
            do{
            	System.out.println("Vrethike sto limani: " + k.onoma_limena);
                System.out.println(k.pin_skafon[pos1].toString());
                pos1 = pos1 + 1;
            }while(pos1 < arithmos && k.pin_skafon[position].name.equals(k.pin_skafon[pos1].name));
            pos1 = position - 1;
            while( pos1 > 0 && k.pin_skafon[position].name.equals(k.pin_skafon[pos1].name)){
            	System.out.println("Vrethike sto limani: " + k.onoma_limena);
                System.out.println(k.pin_skafon[pos1].toString());
                pos1 = pos1 - 1;
            }
        } else {
            System.out.println("Den vrethikan skafoi me onoma: " + key);
        }
        
    }
    
    public void binSearch(double key, Port k, int low, int high){
        int position = -1, mid, arithmos = high;
        while(position == -1 && low <= high){
            mid = (low + high)/2;
            if(key < k.pin_skafon[mid].ektopisma){
                high = mid - 1;
            } else if(key > k.pin_skafon[mid].ektopisma){
                low = mid +1;
            } else {
                position = mid;
            }
        }
        
        if(position != -1){
            int pos1 = position;
            // sarosi deksia kai aristera tou stoixeio gia tixon parapano apotelesmata
            do {
                System.out.println(k.pin_skafon[pos1].toString());
                System.out.println("Vrethike sto limani: " + k.onoma_limena);
                pos1 = pos1 + 1;
            }while(pos1 < arithmos && k.pin_skafon[position].ektopisma == k.pin_skafon[pos1].ektopisma);
            pos1 = position - 1;
            while(pos1 > 0 && k.pin_skafon[position].ektopisma == k.pin_skafon[pos1].ektopisma){
                System.out.println(k.pin_skafon[pos1].toString());
                System.out.println("Vrethike sto limani: " + k.onoma_limena);
                pos1 = pos1 - 1;
            }
        } else {
            System.out.println("Den vrethikan skafoi me ektopisma: " + key);
        }
        
    }
    
}