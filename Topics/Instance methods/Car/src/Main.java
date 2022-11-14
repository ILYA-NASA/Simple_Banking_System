
class Car {

    int yearModel;
    String make;
    int speed;
    final int magicNumber = 5;

    void accelerate() {
        speed += magicNumber;
    }

    void brake() {
        if (speed >= magicNumber) {
            speed -= magicNumber;
        } else {
            speed = 0;
        }
    }
}