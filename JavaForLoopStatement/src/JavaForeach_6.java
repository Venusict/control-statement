public class JavaForeach_6 {
    public static void main(String[] args) {
        //Declaring an array
        String bikes[]={"SH","AirBlade", "Exciter", "Winner"};
        //Printing array using for-each loop
        for(String bike:bikes){
            System.out.println(bike);
        }
        for (int car = 0; car < bikes.length; car++){
            System.out.println(bikes[car]);
        }
    }
}
