public class AutomaticCar {

    private String model;
    private int year;
    private int speed;
    private int gear;
    private int odoMeter;



    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
        gearShift();
    }

    public int getGear() {
        return gear;
    }


    public void setGear(int gear) {
        this.gear = gear;
    }


    public void gearShift()
    {
        if (speed < 0)
        {
            System.out.println("speed cant be negative!");
        }

        if (speed == 0)
        {
            setGear(0);
        }

        if (speed > 0 && speed < 100)
        {
            setGear(1);
        }

        if (speed > 100 && speed < 200)
        {
            setGear(2);
        }

        if (speed > 200 && speed < 300)
        {
            setGear(3);
        }

        if (speed > 300 && speed < 400)
        {
            setGear(4);
        }

        if (speed > 400 && speed < 500)
        {
            setGear(5);
        }

    }


    public int getOdoMeter()
    {
        return odoMeter;
    }

    public void setOdoMeter(int odoMeter)
    {
        this.odoMeter = odoMeter;
    }


    public AutomaticCar(String model, int year)
    {
        setModel(model);
        setYear(year);
    }

    public void dashes(int odoMeter)
    {
        for (int i = 0; i <= (odoMeter/100); i++) {

            System.out.print("-");
        }
        System.out.print(": " + odoMeter + "km passed\n");

    }




    }


