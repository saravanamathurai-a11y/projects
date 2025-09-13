interface Vehicle {
    void changeGear(int x);
    void speedUp(int x);
    void applyBreak(int x);

}    
class Bicycle implements Vehicle {
    int speed;
    int gear;

    @Override
    public void changeGear(int Gear) {
        gear = Gear;
    }

    @Override

    public void speedUp(int increment) {
        speed = speed + increment;
    }

    @Override

    public void applyBreak(int decrement) {
        speed = speed - decrement;
    }

    public void show() {
        System.out.println("speed: "+ speed + "gear: " + gear);
    }
} 

class Car implements Vehicle {
    int speed;
    int gear;

    @Override
    public void changeGear(int Gear) {
        gear = Gear;
    }

    @Override

    public void speedUp(int increment) {
        speed = speed + increment;
    }

    @Override

    public void applyBreak(int decrement) {
        speed = speed - decrement;
    }

    public void show() {
        System.out.println("speed: "+ speed + "gear: " + gear);
    }
}

class Main10000 {
    public static void main(String[] args) {
        Bicycle b = new Bicycle();
        b.changeGear(2);
        b.speedUp(7);
        b.applyBreak(5);

        b.show();

        Car c = new Car();
        c.changeGear(20);
        c.speedUp(70);
        c.applyBreak(50);

        c.show();

    }
}