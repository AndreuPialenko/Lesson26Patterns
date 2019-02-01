package Порождающие.Builder;



public class Car {
    private String type;
    private String engine;
    private int seats;
    private String transmission;

    public Car(Builder builder) {
        this.type = builder.type;
        this.engine = builder.engine;
        this.seats = builder.seats;
        this.transmission = builder.transmission;
    }

    public static Builder newBuilder(){
        return new Builder();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }



    private static final class Builder {
        private String type;
        private String engine;
        private int seats;
        private String transmission;

        public  Builder withType(String type){
            this.type = type;
            return this;
        }
        public Builder withEngine(String engine){
            this.engine = engine;
            return this;
        }

        public Builder withSeats(int seats){
            this.seats = seats;
            return this;
        }

        public Builder withTransmission(String transmission){
            this.transmission = transmission;
            return this;
        }

        public Car build(){
            return new Car(this);
        }

    }

    @Override
    public String toString() {
        return "Car{" +
                "type='" + type + '\'' +
                ", engine='" + engine + '\'' +
                ", seats=" + seats +
                ", transmission='" + transmission + '\'' +
                '}';
    }
}

