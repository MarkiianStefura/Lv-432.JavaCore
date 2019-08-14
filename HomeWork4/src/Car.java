public class Car {

    private int yearOfProduction;
    private double engineCapacity;

    private String type;


    public Car(int yearOfProduction, double engineCapacity, String type) {
        this.yearOfProduction = yearOfProduction;
        this.engineCapacity = engineCapacity;
        this.type = type;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Car{" +
                "yearOfProduction=" + yearOfProduction +
                ", engineCapacity=" + engineCapacity +
                ", type='" + type + '\'' +
                '}';
    }
}
