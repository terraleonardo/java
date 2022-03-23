public class Car {
    
    String name;
    int gear;
    double speed;
    boolean on;

    Car(String name) {
        this.name = name;
        this.gear = 0;
        this.speed = 0.0;
        this.on = false;
    }

    void upGear() {
        if(this.gear <= 5) {
            this.gear += 1;
        }
        else this.gear = 5;
    }

    void downGear() {
        if(this.gear >= 0) {
            this.gear -= 1;
        }
        else this.gear = 0;
    }

    boolean isOn() {
        return this.on;
    }

    void turnOn() {
        if(this.on == true || this.gear != 0) {
            System.out.println("The car is already on or the gear isn't neutral. Decrease the gear to neutral and try again");
        }
        else {
            this.on = true;
            System.out.println("The car is on!");
        }
    }

    void turnOff() {
        if(this.on == true) this.on = false;
        else System.out.println("The car is already off!");
    }

    void breakCar(double spd) {
        if(this.speed > 0) {
            this.speed -= spd;
        }
        else {
            this.speed = 0;
            System.out.println("The car is already stopped!");
        }
    }

    void accelerate(double spd) {
        if(this.on != true || this.gear == 0) {
            System.out.println("The car has to be on and with gear engaged to accelerate\nCurrent status: on: "+this.on+" gear: "+this.gear);
        }
        else this.speed += spd;
    }
}
