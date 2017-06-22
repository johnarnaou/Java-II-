public class Ferry extends Vessel {
    
    int passengerNo;
    int vehicleNo;
    
    public Ferry() {
        super.setAttributes();
        
        do{
            System.out.print("Eisagogi ari8mou epibatwn: ");
            passengerNo = input.getInt();
        }while(passengerNo == -1);
        
        do{
            System.out.print("Eisagogi ari8mou oxhmatwn: ");
            vehicleNo = input.getInt();
        }while(vehicleNo == -1);
        
    }
    
        @Override public String toString() {
        
        return super.toString() + '\n'
                + "Ari8mos Epibatwn: " + passengerNo + '\n'
                + "Ari8mos Oxhmatwn: " + vehicleNo + '\n' +
                "------------------------";                       
        
    }
 
}
