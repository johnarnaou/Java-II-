public class Cargo extends Vessel {
    
    double load;
    
    public Cargo() {
        
        super.setAttributes();
        
        do{
            System.out.print("Eisagogi fortiou: ");
            load = input.getDouble();
        }while(load == -1);
        
    }
    
    @Override public String toString() {
        
        return super.toString() + '\n'
                + "Ofelimo Fortio: " + load + '\n' +
                "------------------------";                       
        
    }
    
}
