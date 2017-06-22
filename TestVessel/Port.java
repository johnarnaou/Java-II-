public class Port {
    
    String onoma_limena;
    double max_capacity;
    int max_vessels;
    boolean  sortEktopisma = false, sortName = false, sortEtos = false; // afou exoume polla limania 8eloume edw tis boolean gia tin taksinomhsh
    // kai oxi stin main - TestVessel.  Giati ka8e limani exei to diko tou pinaka pou kat'epektash 8elei tis dikes tou boolean metablhtes gia an einai sorted h oxi
       
    Vessel pin_skafon[];
    int top = -1;
       
    UserInput keyboard = new UserInput();
    
    public void setAttributes() {
        System.out.print("Eisagogi onomatos limena:");
        onoma_limena = keyboard.getString();
        
        do{
            System.out.print("Eisagogi megistis xoritikotitas:");
            max_capacity = keyboard.getDouble();
        }while(max_capacity == -1);
        
        do{
            System.out.print("Eisagogi megistou plithous skafon:");
            max_vessels = keyboard.getInt();
        }while(max_vessels == -1);
        
        pin_skafon = new Vessel[max_vessels];
    }
    
    public double compCurrentLoad() {
        double curLoad = 0.0;
        
        for (int i = 0; i < pin_skafon.length; i++) {
            
            if (pin_skafon[i] instanceof Cargo && pin_skafon[i] != null) {
                
                Cargo car = (Cargo) pin_skafon[i];
                
                curLoad += car.load;
                
            }            
        }
                
        return curLoad;
    }
    
    public int compPassengerNo() {
        int pasNum = 0;
        
        for (int i = 0; i < pin_skafon.length; i++) {
            
            if (pin_skafon[i] instanceof Ferry && pin_skafon[i] != null) {
                
                Ferry fer = (Ferry) pin_skafon[i];
                
                pasNum += fer.passengerNo;
                
            }            
        }
        
        return pasNum;
    }
    
    public int compVehicleNo() {
        int vehNum = 0;
                
        for (int i = 0; i < pin_skafon.length; i++) {
            
            if (pin_skafon[i] instanceof Ferry && pin_skafon[i] != null) {
                
                Ferry fer = (Ferry) pin_skafon[i];
                
                vehNum += fer.vehicleNo;
                
            }
        }
        
        return vehNum;
    }
    
    public double compCurrentDisplacement() {
        double curDis = 0.0;
        
        for (int i = 0; i < pin_skafon.length; i++) {
         
            if (pin_skafon[i] != null) {
                curDis += pin_skafon[i].ektopisma;
            }
  
        }
        
        return curDis;
    }
    
    public void addVessel(Vessel o) {
        
        for (int i=0; i < pin_skafon.length; i++) {
            if (pin_skafon[i] == null) {
                pin_skafon[i] = o;
                break;  // gia na min gemisei ola ta kelia tou pinaka kai dn douleuei h sun8hkh if           
            }
        }
        
        top += 1;
        
        sortEktopisma = false;
        sortEtos = false; // afou pros8e8hke neo skafos ston pinaka
        sortName = false; // opoia taksinomhsh uphrxe xalase pleon
        
    }
    
}