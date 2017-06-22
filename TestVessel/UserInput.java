import java.util.Scanner;

public class UserInput {
        
        public int getInt(){
            Scanner input = new Scanner(System.in);
            try{
                    int x;
                    x = input.nextInt();
                    return x;
            }
            catch (Exception e ){
                    System.out.println("Error - Expected int value!");
                    return -1;
            }
    }

        public double getDouble(){
            Scanner input = new Scanner(System.in);
            try{
                    double x;
                    x = input.nextDouble();
                    return x;
            }
            catch(Exception e){
                    System.out.println("Error - Expected double value!");
                    return -1;
            }
    }

        public float getFloat(){
            Scanner input = new Scanner(System.in);
            try{
                    float x;
                    x = input.nextFloat();
                    return x;
            }
            catch (Exception e){
                    System.out.println("Error - Expected float value!");
                    return -1;
            }
    }

        public String getString(){
            Scanner input = new Scanner(System.in);
            String x;
            x = input.nextLine();
            return x;
    }
}