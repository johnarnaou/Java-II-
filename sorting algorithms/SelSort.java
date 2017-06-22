public void SelSort (int key, Vessel[] k, int top) {

   int i,j;
   int iMin;
   Vessel temp;
   
   for (j=0; j <= top-1; j++) {
     
	  iMin = j;
	  for ( i = j+1; i <=top; i++) {
	    
		if (k[i].etos_kataskevis < k[iMin].etos_kataskevis) {
		   iMin = i;
		}
		 
	  }
	  if (iMin != j) {
	      temp = k[j];
		  k[j] = k[iMin];
		  k[iMin] = temp;
	  }
   }
}

public void SelSort (double key, Vessel[] k, int top) {

   int i,j;
   int iMin;
   Vessel temp;
   
   for (j=0; j <= top-1; j++) {
     
	  iMin = j;
	  for ( i = j+1; i <=top; i++) {
	    
		if (k[i].ektopisma < k[iMin].ektopisma) {
		   iMin = i;
		}
		 
	  }
	  if (iMin != j) {
	      temp = k[j];
		  k[j] = k[iMin];
		  k[iMin] = temp;
	  }
   }
}

public void SelSort (String key, Vessel[] k, int top) {

   int i,j;
   int iMin;
   Vessel temp;
   
   for (j=0; j <= top-1; j++) {
     
	  iMin = j;
	  for ( i = j+1; i <=top; i++) {
	    
		if ( k[i].name.compareTo(k[iMin].name) < 0 ) {
		   iMin = i;
		}
		 
	  }
	  if (iMin != j) {
	      temp = k[j];
		  k[j] = k[iMin];
		  k[iMin] = temp;
	  }
   }
}