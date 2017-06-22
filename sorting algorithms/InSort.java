// pseudokwdikas edw: http://el.wikipedia.org/wiki/%CE%A4%CE%B1%CE%BE%CE%B9%CE%BD%CF%8C%CE%BC%CE%B7%CF%83%CE%B7_%CE%BC%CE%B5_%CE%B5%CE%B9%CF%83%CE%B1%CE%B3%CF%89%CE%B3%CE%AE

public void InSort (int key,Vessel k[], int top) {

   for (int i=1; i <= top; i++) {
     
	 Vessel valueToInsert = k[i];
	 int holePos = i;
	 
	 while ( (holePos > 0) && (valueToInsert.etos_kataskevis < k[holePos-1].etos_kataskevis) ) {	 
	    k[holePos] = k[holePos-1];
		holePos = holePos-1;	 
	 }	 
	 k[holePos] = valueToInsert;
    }        
}

public void InSort (double key,Vessel k[], int top) {

   for (int i=1; i <= top; i++) {
     
	 Vessel valueToInsert = k[i];
	 int holePos = i;
	 
	 while ( (holePos > 0) && (valueToInsert.ektopisma < k[holePos-1].ektopisma) ) {	 
	    k[holePos] = k[holePos-1];
		holePos = holePos-1;	 
	 }	 
	 k[holePos] = valueToInsert;
    }        
}

public void InSort (String key,Vessel k[], int top) {

   for (int i=1; i <= top; i++) {
     
	 Vessel valueToInsert = k[i];
	 int holePos = i;
	 
	 while ( (holePos > 0) && ( valueToInsert.name.compareTo(k[holePos-1].name) < 0 ) ) {	 
	    k[holePos] = k[holePos-1];
		holePos = holePos-1;	 
	 }	 
	 k[holePos] = valueToInsert;
    }        
}