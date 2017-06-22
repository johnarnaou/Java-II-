public class Vessel {
    String name, owner;
    int etos_kataskevis;
    double max_speed, ektopisma, mikos, platos;
    UserInput input = new UserInput();
    
    public void setAttributes(){
        System.out.print("Eisagogi onomatos skafous: ");
        name = input.getString();
        System.out.print("Eisagogi onomatos idioktiti: ");
        owner = input.getString();
        do {
            do{
                System.out.print("Eisagogi mikous: ");
                mikos = input.getDouble();
            }while(mikos == -1);
        }while(mikos < 0 || mikos > 1000);
        do{
            System.out.print("Eisagogi platous: ");
            platos = input.getDouble();
        }while(platos == -1);
        do{
            System.out.print("Eisagogi megistis taxititas: ");
            max_speed = input.getDouble();
        }while(max_speed == -1);
        do{
            System.out.print("Eisagogi etos kataskevis: ");
            etos_kataskevis = input.getInt();
        }while(etos_kataskevis == -1);
        do {
            do{
                System.out.print("Eisagogi ektopismatos: ");
                ektopisma = input.getDouble();
            }while(ektopisma == -1);
        }while(ektopisma < 0 || ektopisma > 150000);
    }
    
    @Override public String toString() {
        
        return "------------------------" + '\n'+
                "Onoma: " + name + '\n'
                + "Idioktitis: " + owner + '\n'
                + "Mikos: " + mikos + '\n'
                + "Platos: " + platos + '\n'
                + "Max speed: " + max_speed + '\n'
                +"Etos kataskevis:" + etos_kataskevis + '\n'
                + "Ektopisma: " + ektopisma + '\n' +
                "------------------------";      
        
    }
    
}