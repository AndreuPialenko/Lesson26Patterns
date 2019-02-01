package Порождающие.Builder;

public class App {
    public static void main(String[] args) {
        Car car = Car.newBuilder()
                .withType("sedan")
                .withEngine("petrol")
                .build();

        System.out.println("car.toString()");
    }

    Car car2 = Car.newBuilder()
            .withType("hatchack")
            .withEngine("petrol")
            .withSeats(4)
            .withTransmission("auto")
            .build();
    sout(car2.toString());

}
