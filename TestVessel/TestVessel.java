//@author IOANNIS ARNAOUTAKIS, GOUNARIDIS DIMITRIS

public class TestVessel {
    
    public static void main(String[] args) {
        String choice, stringKey = "";
        int arithmos = -1, intKey = -1, k;
        double doubKey = -1.0d;
        UserInput input = new UserInput();
        Port[] limania = new Port[3];
        MyUtils utility = new MyUtils();
        boolean finished = false;
        int[] positions = new int[2];
        
        do{
            mainMenu(); // MENU PROGRAMMATOS
            choice = input.getString(); //Eisagogi tis epilogis tou xristi
            
            switch(choice){
                case "1":
                    if(arithmos < 2){
                    	arithmos++;
                    	limania[arithmos] = new Port();
                    	limania[arithmos].setAttributes();
                    } else {
                    	System.out.println("Den xorane alla limania.");
                    }
                    break;
                case "2":
                	if (limania[0] != null) {
                                    
                        do{
	                        System.out.println("1. Ferry");
	                        System.out.println("2. Cargo");
	                        System.out.print("Epilekste tupo skafous:");
	                        choice = input.getString();
	                        switch(choice) {
	                            case "1":
	                                finished = true;
	                                break;
	                            case "2":
	                                finished = true;
	                                break;
	                            default:
	                            	System.out.println("Dokimaste ksana.");
	                            	break;
	                        }
                        }while(finished = false);
                        finished = false;
                        System.out.println("Epilekste limena gia ellimenismo:");
                        System.out.println("Ta diauesima lhmania einai:");
                        k = getPortIndex(limania);
                        if(choice.equals("1")){
                        	Ferry fer = new Ferry();
                        	if(limania[k].max_capacity - fer.ektopisma > 0)
                        		if(limania[k].top + 1 <= limania[k].max_vessels){
                        			limania[k].addVessel(fer);
                        		} else {
                        			System.out.println("Den xorane alla skafoi.");
                        	}else{
                        		System.out.println("Ksepernaei ta oria tou ektopismatos.");
                        	}
                        } else {
                            Cargo car = new Cargo();
                        	if(limania[k].max_capacity - car.ektopisma > 0){
                        		if(limania[k].top + 1 <= limania[k].max_vessels){
                        			limania[k].addVessel(car);
                        		} else {
                        			System.out.println("Den xorane alla skafoi.");
                        		}
                        	} else {
                        		System.out.println("Ksepernaei ta oria tou ektopismatos.");
                        	}
                            
                        }
                	}
                    break;
                case "3":
                    if (checkIfPortsExist(limania) == false) {
                        
                        do{
                        sectorSelection(); //menu dio
                        choice = input.getString(); //eisagogi epilogis tou xristi
                        System.out.println();

                        switch(choice){
                            case "1":
                                System.out.print("Onoma anazitisis: ");
                                stringKey = input.getString();
                                for(int i=0; i<limania.length; i++){
                                    
                                    if(limania[i]!= null) {
                                        if(limania[i].sortName == true){
                                		utility.binSearch(stringKey, limania[i], 0, limania[i].top);
                                	} else {
                                		utility.seqSearch(stringKey, limania[i], limania[i].top);
                                	}                                        
                                    }                               	
                                }
                                finished = true;
                                break;
                            case "2":
                                do{
                                    System.out.print("Eisagogi etous kataskevis gia anazitisi: ");
                                    intKey = input.getInt();
                                }while(intKey == -1);
                                for(int i=0; i<limania.length; i++){
                                    
                                    if(limania[i]!= null) {
                                        if(limania[i].sortEtos == true){
	                                    utility.binSearch(intKey, limania[i], 0, limania[i].top);
	                                } else {
	                                    utility.seqSearch(intKey, limania[i], limania[i].top);
	                                }                                        
                                    }	                                
                                }
                                finished = true;
                                break;
                            case "3":
                                do{
                                    System.out.print("Eisagogi ektopismatos gia anazitisi: ");
                                    doubKey = input.getDouble();
                                }while(doubKey == -1);
                                for(int i=0; i<limania.length; i++){
                                    
                                    if(limania[i]!= null) {
                                        if(limania[i].sortEktopisma == true){
	                                    utility.binSearch(doubKey, limania[i], 0, limania[i].top);
	                                } else {
	                                    utility.seqSearch(doubKey, limania[i], limania[i].top);
	                                }                                        
                                    }                                    	                                
                                }
                                finished = true;
                                break;
                            case "4":
                            	if(limania[0] != null){
                                    utility.Max_Mhkos(limania);
                            	} else {
                            		System.out.println("Dn iparxoun limania.");
                            	}
                                finished = true;
                                break;
                            case "5":
                                finished = true;
                                break;
                            default:
                                System.out.println("Dokimaste ksana (1-5)");
                                break;
                        }
                    }while(finished == false);
                                                
                    }
                    
                finished = false;
                break;
                
                case "4":
                    if (checkIfPortsExist(limania) == false) { 
                        
                        k = getPortIndex(limania);
                        if ( checkPortIfEmpty(limania[k]) == false) {                            
                            
                            do{
                        sectorToSort();
                        choice = input.getString();
                        switch(choice){
                            case "1":
                                sortingMethod();
                                choice = input.getString();
                                switch(choice){
                                    case "1":
                                        utility.BubSort(stringKey, limania[k].pin_skafon, limania[k].top);
                                        limania[k].sortName = true;
                                        limania[k].sortEtos = false;
                                        limania[k].sortEktopisma = false;
                                        finished = true;
                                        break;
                                    case "2":
                                        utility.InSort(stringKey, limania[k].pin_skafon, limania[k].top);
                                        limania[k].sortName = true;
                                        limania[k].sortEtos = false;
                                        limania[k].sortEktopisma = false;
                                        finished = true;
                                        break;
                                    case "3":
                                        utility.SelSort(stringKey, limania[k].pin_skafon, limania[k].top);
                                        limania[k].sortName = true;
                                        limania[k].sortEtos = false;
                                        limania[k].sortEktopisma = false;
                                        finished = true;
                                        break;
                                    case "4":
                                        utility.QuickSort(limania[k].pin_skafon, limania[k].top, limania[k].pin_skafon[0].name);
                                        limania[k].sortName = true;
                                        limania[k].sortEtos = false;
                                        limania[k].sortEktopisma = false;
                                        finished = true;
                                        break;
                                    case "5":
                                        utility.mergeSort(limania[k].pin_skafon, limania[k].top, stringKey);
                                        limania[k].sortName = true;
                                        limania[k].sortEtos = false;
                                        limania[k].sortEktopisma = false;
                                        finished = true;
                                        break;
                                    case "6":
                                        finished = true;
                                    default:
                                        System.out.println("Dokimaste ksana (1-6)");
                            }
                            break;
                            case "2":
                                sortingMethod();
                                choice = input.getString();
                                switch(choice){
                                    case "1":
                                        utility.BubSort(intKey, limania[k].pin_skafon, arithmos);
                                        limania[k].sortEtos = true;
                                        limania[k].sortName = false;
                                        limania[k].sortEktopisma = false;
                                        finished = true;
                                        break;
                                    case "2":
                                        utility.InSort(intKey, limania[k].pin_skafon, arithmos);
                                        limania[k].sortEtos = true;
                                        limania[k].sortName = false;
                                        limania[k].sortEktopisma = false;
                                        finished = true;
                                        break;
                                    case "3":
                                        utility.SelSort(intKey, limania[k].pin_skafon, arithmos);
                                        limania[k].sortEtos = true;
                                        limania[k].sortName = false;
                                        limania[k].sortEktopisma = false;
                                        finished = true;
                                        break;
                                    case "4":
                                        utility.QuickSort(limania[k].pin_skafon, arithmos, limania[k].pin_skafon[0].etos_kataskevis);
                                        limania[k].sortEtos = true;
                                        limania[k].sortName = false;
                                        limania[k].sortEktopisma = false;
                                        finished = true;
                                        break;
                                    case "5":
                                        utility.mergeSort(limania[k].pin_skafon, arithmos, intKey);
                                        limania[k].sortEtos = true;
                                        limania[k].sortName = false;
                                        limania[k].sortEktopisma = false;
                                        finished = true;
                                        break;
                                    case "6":
                                        finished = true;
                                    default:
                                        System.out.println("Dokimaste ksana (1-6)");
                            }
                            break;
                            case "3":
                                sortingMethod();
                                choice = input.getString();
                                switch(choice){
                                    case "1":
                                        utility.BubSort(doubKey, limania[k].pin_skafon, limania[k].top);
                                        limania[k].sortEktopisma = true;
                                        limania[k].sortName = false;
                                        limania[k].sortEtos = false;
                                        finished = true;
                                        break;
                                    case "2":
                                        utility.InSort(doubKey, limania[k].pin_skafon, limania[k].top);
                                        limania[k].sortEktopisma = true;
                                        limania[k].sortName = false;
                                        limania[k].sortEtos = false;
                                        finished = true;
                                        break;
                                    case "3":
                                        utility.SelSort(doubKey, limania[k].pin_skafon, limania[k].top);
                                        limania[k].sortEktopisma = true;
                                        limania[k].sortName = false;
                                        limania[k].sortEtos = false;
                                        finished = true;
                                        break;
                                    case "4":
                                        utility.QuickSort(limania[k].pin_skafon, limania[k].top, limania[k].pin_skafon[0].ektopisma);
                                        limania[k].sortEktopisma = true;
                                        limania[k].sortName = false;
                                        limania[k].sortEtos = false;
                                        finished = true;
                                        break;
                                    case "5":
                                        utility.mergeSort(limania[k].pin_skafon, limania[k].top, doubKey);
                                        limania[k].sortEktopisma = true;
                                        limania[k].sortName = false;
                                        limania[k].sortEtos = false;
                                        finished = true;
                                        break;
                                    case "6":
                                        finished = true;
                                    default:
                                        System.out.println("Dokimaste ksana (1-6)");
                            }
                            break;
                           case"4":
                               finished = true;
                               break;
                           default:
                               System.out.println("Dokimaste ksana (1-4)");
                        }
                    }while(finished == false);
                            
                        }
                        
                    }
                    
              	    finished = false;
                    break;
                    
                case "5":
                    if (checkIfPortsExist(limania) == false) {
                        System.out.println("Epilekste limani:");
                	k = getPortIndex(limania);
                	editMode();
                        choice = input.getString();
                   
                    switch(choice) {         
                        case "1":
                            System.out.println(limania[k].compCurrentLoad());
                            break;
                        case "2":
                            System.out.println(limania[k].compPassengerNo());
                            break;
                        case "3":
                            System.out.println(limania[k].compVehicleNo());
                            break;
                        case "4":
                            System.out.println(limania[k].compCurrentDisplacement());
                            break;
                        case "5":
                            break;                       
                    }
                        
                    }
                                                            
                    break;
                case "6":
                    if (checkIfPortsExist(limania) == false) { 
                        
                        System.out.println("Epilekste limani:");
                	k = getPortIndex(limania);
                    for (int i =0; i < limania[k].pin_skafon.length; i ++) {
                        
                        if (limania[k].pin_skafon[i] instanceof Cargo) {  
                            Cargo car = (Cargo) limania[k].pin_skafon[i];
                            System.out.println(car.toString());                           
                        }
                        
                        if (limania[k].pin_skafon[i] instanceof Ferry) {  
                            Ferry fer = (Ferry) limania[k].pin_skafon[i];
                            System.out.println(fer.toString());                           
                        }
                    }
                   }
                    
                    break;
                case "7":
                    finished = true;
                    break;
                default:
                    System.out.println("Dokimaste ksana (1-7)");
            } 
        }while(finished == false);
    }
    
    public static void mainMenu(){
            System.out.println("" + '\t' + '\t' + "LISTA EPILOGON");
            System.out.println("1." + '\t' + "Eisagogi stoixeion limena");
            System.out.println("2." + '\t' + "Ellimenismos skafous se sugkekimeno limena");
            System.out.println("3." + '\t' + "Anazitisi stoixeion skafous");
            System.out.println("4." + '\t' + "Taksinomisi skafon enos limena");
            System.out.println("5." + '\t' + "Epeksergasia limena");
            System.out.println("6." + '\t' + "Emfanisi stoixeion olon ton skafon enos limena");
            System.out.println("7." + '\t' + "Telos");
            System.out.println();
            System.out.print('\t' +"Doste Epilogi (1-7):");
    }
    
    public static void sectorSelection(){
            System.out.println("" + '\t' + '\t' + "Epilogi Pediou Anazitisis");
            System.out.println("1. Onoma skafous");
            System.out.println("2. Etos kataskevis");
            System.out.println("3. Ektopisma");
            System.out.println("4. Megisto mikos skafous");
            System.out.println("5. Epistrofi stin Arxiki Lista Epilogon");
            System.out.println();
            System.out.print('\t' +"Doste Epilogi (1-5):");
    }
    
    public static void sectorToSort(){
            System.out.println("" + '\t' + '\t' + "Epilogi Pediou Taksinomisis");
            System.out.println("1. Onoma skafous");
            System.out.println("2. Etos kataskevis");
            System.out.println("3. Ektopisma");
            System.out.println("4. Epistrofi stin Arxiki Lista Epilogon");
            System.out.println();
            System.out.print('\t' +"Doste Epilogi (1-4):");
    }
    
    public static void sortingMethod(){
        System.out.println("" + '\t' + '\t' + "Epilogi Methodou");
        System.out.println("1. BubbleSort");
        System.out.println("2. Taksinomisi me Eisagogi");
        System.out.println("3. Taksinomisi me Epilogi");
        System.out.println("4. Grigori Taksinomisi");
        System.out.println("5. Taksinomisi me Sigxoneusi");
        System.out.println("6. Epistrofi stin Epilogi Pediou Taksinomisis");
        System.out.println();
        System.out.print('\t' +"Doste Epilogi (1-6):");
    }
    
    public static void editMode(){
    	System.out.println('\t' + "Epilogi Epeksergasias");
    	System.out.println("1. Sinoliko ofelimo fortio skafon enos limena");
    	System.out.println("2. Sinoliko plithos epivaton enos limena");
    	System.out.println("3. Sinoliko plithos oximaton enos limena");
    	System.out.println("4. Sinoliko ektopisma skafon enos limena");
    	System.out.println("5. Epistrofi stin Arxiki Lista Epilogon");
    	System.out.println();
    	System.out.print('\t' + "Dose Epilogi (1-5):");
    }
    
    public static int getPortIndex(Port limania[]){
    	int k = -1;
        int c = 0; // c apo to counter
    	UserInput input = new UserInput();    	
        	for (int i = 0; i < limania.length; i++) {                           
        		if (limania[i] != null) {                                
        			System.out.println(" " + (i+1) + ". " + limania[i].onoma_limena); //(i+1) gia na emfanistei optika omorfa sto xrhsth h epilogh
                                c += 1; // plh8os keliwn pou dn einai null
        		}                            
        	}
        	                 
        do{
                System.out.print("Epilogi limaniou(1-" + c + ")");
        	k = input.getInt();
        	k = k-1;
        }while(k < 0 || k >= limania.length); // to k dn mporei na einai 3
    	return k;
    }
    
    public static boolean checkPortIfEmpty (Port limani) {
       
       boolean isEmpty = true;
        
       for (int i=0; i < limani.pin_skafon.length; i++) {
           if (limani.pin_skafon[i] != null) {               
               isEmpty = false;
           }
       }
       
       if (isEmpty == true) {
           System.out.println("To limani einai adeio");           
       }
       
       return isEmpty;
       
    }
    
    public static boolean checkIfPortsExist (Port[] limania) {
       
       boolean isEmpty = true;
        
       for (int i=0; i < limania.length; i++) {
           if (limania[i] != null) {
               isEmpty = false;
           }
       }
       
       if (isEmpty == true) {
           System.out.println("Dn uparxoun limania");           
       }
       
       return isEmpty;
       
    }
    
}