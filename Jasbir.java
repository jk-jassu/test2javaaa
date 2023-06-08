interface Vehicle {
    void updateGear(int gear);
    void accelerate(int speed);
    void pushBrake(int brake);
    void currentSpeed();
    void displayState();
}

class Car implements Vehicle {
    private int gear;
    private int speed;
    private int brake;

    public void updateGear(int gear) {
        this.gear = gear;
    }

    public void accelerate(int speed) {
        this.speed = speed;
    }

    public void pushBrake(int brake) {
        this.brake = brake;
    }

    public void currentSpeed() {
        speed -= brake;
    }

    public void displayState() {
        System.out.println("Car present state:");
        System.out.println("brake: " + brake + "\tgear: " + gear + "\tspeed: " + speed);
    }
}

class Truck implements Vehicle {
    private int gear;
    private int speed;
    private int brake;

    public void updateGear(int gear) {
        this.gear = gear;
    }

    public void accelerate(int speed) {
        this.speed = speed;
    }

    public void pushBrake(int brake) {
        this.brake = brake;
    }

    public void currentSpeed() {
        speed -= brake;
    }

    public void displayState() {
        System.out.println("Truck present state:");
        System.out.println("brake: " + brake + "\tgear: " + gear + "\tspeed: " + speed);
    }
}

public class Jasbir {
    public static void main(String[] args) {
        Vehicle c1 = new Car();
        Vehicle t1 = new Truck();

        c1.updateGear(1);
        c1.accelerate(3);
        c1.pushBrake(2);
        c1.currentSpeed();
        c1.displayState();

        t1.updateGear(1);
        t1.accelerate(4);
        t1.pushBrake(3);
        t1.currentSpeed();
        t1.displayState();
    }
}
