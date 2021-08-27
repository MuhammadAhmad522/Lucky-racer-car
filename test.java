import java.util.Random;
public class test {
    public static void main(String[] args) {

        Random random = new Random();

        AutomaticCar car1 = new AutomaticCar("BMW", 2010);
        AutomaticCar car2 = new AutomaticCar("Tesla", 2011);
        AutomaticCar car3 = new AutomaticCar("Honda", 2012);
        AutomaticCar car4 = new AutomaticCar("Porsche", 2013);
        AutomaticCar car5 = new AutomaticCar("Corolla", 2014);

        //car 1
        for (int i = 0; i < 10; i++) {

            car1.setSpeed(random.nextInt(500));
            car1.setOdoMeter(car1.getOdoMeter()+car1.getSpeed());

        }
        System.out.print("Distance covered by car 1 is: ");
        car1.dashes(car1.getOdoMeter());


        //car 2
        for (int i = 0; i < 10; i++) {

            car2.setSpeed(random.nextInt(500));
            car2.setOdoMeter(car2.getOdoMeter()+car2.getSpeed());

        }
        System.out.print("Distance covered by car 2 is: ");
        car2.dashes(car2.getOdoMeter());


        //car 3
        for (int i = 0; i < 10; i++) {

            car3.setSpeed(random.nextInt(500));
            car3.setOdoMeter(car3.getOdoMeter()+car3.getSpeed());

        }
        System.out.print("Distance covered by car 3 is: ");
        car4.dashes(car3.getOdoMeter());


        //car4
        for (int i = 0; i < 10; i++) {

            car4.setSpeed(random.nextInt(500));
            car4.setOdoMeter(car4.getOdoMeter()+car4.getSpeed());

        }
        System.out.print("Distance covered by car 4 is: ");
        car4.dashes(car4.getOdoMeter());


        //car5
        for (int i = 0; i < 10; i++) {

            car5.setSpeed(random.nextInt(500));
            car5.setOdoMeter(car5.getOdoMeter()+car5.getSpeed());

        }
        System.out.print("Distance covered by car 5 is: ");
        car5.dashes(car5.getOdoMeter());

        if(car1.getOdoMeter() > car2.getOdoMeter() && car1.getOdoMeter() > car3.getOdoMeter() && car1.getOdoMeter() > car4.getOdoMeter() && car1.getOdoMeter() > car5.getOdoMeter())
        {
            System.out.println("Car 1 '" + car1.getModel() + "' has won the race");
        }

        if(car2.getOdoMeter() > car1.getOdoMeter() && car2.getOdoMeter() > car3.getOdoMeter() && car2.getOdoMeter() > car4.getOdoMeter() && car2.getOdoMeter() > car5.getOdoMeter())
        {
            System.out.println("Car 2 '" + car2.getModel() + "' has won the race");
        }

        if(car3.getOdoMeter() > car2.getOdoMeter() && car3.getOdoMeter() > car1.getOdoMeter() && car3.getOdoMeter() > car4.getOdoMeter() && car3.getOdoMeter() > car5.getOdoMeter())
        {
            System.out.println("Car 3 '" + car3.getModel() + "' has won the race");
        }

        if(car4.getOdoMeter() > car2.getOdoMeter() && car4.getOdoMeter() > car3.getOdoMeter() && car4.getOdoMeter() > car4.getOdoMeter() && car4.getOdoMeter() > car5.getOdoMeter())
        {
            System.out.println("Car 4 '" + car4.getModel() + "' has won the race");
        }

        if(car5.getOdoMeter() > car2.getOdoMeter() && car5.getOdoMeter() > car3.getOdoMeter() && car5.getOdoMeter() > car4.getOdoMeter() && car5.getOdoMeter() > car1.getOdoMeter())
        {
            System.out.println("Car 5 '" + car5.getModel() + "' has won the race");
        }






    }
}
