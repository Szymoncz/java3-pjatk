// Autor: Szymon Czudowski
// Z klasy Pojazd dziedziczą Samochod (dodatkowe atrybuty segment i VIN) oraz Jednoslad (dodatkowy atrybut typ).
// Obie wspomniane klasy wykorzystują autorskie enumeracje i zostają wyposażone w konstruktory oraz metody wyswietl,
// nadpisujące metody o tej samej nazwie w klasach nadrzędnych. Konstruktory mają wywoływać konstruktory klasy
// nadrzędnej i wpisywać się w logikę autonumerowania i wyświetlania informacji o numeracji. W szczególności, klasy
// te powinny mieć konstruktory pobierające odpowiednio 8 i 7 atrybutów - a jednoślad dodatkowo konstruktor, który
// nie pobiera wszystkich atrybutów (z uwagi na specyficzną logikę opisu rowerów i hulajnóg tradycyjnych). Metoda
// wyświetlająca klasy Jednoślad ma pomijać wartości niewprowadzone.

public class Car extends Vehicle {
    // Enumeration type Segment represents a car segment
    public enum Segment {
        A, B, C, D, E, F, S, H, J, M
    }

    // Private fields of Car class - segment and VIN number
    private Segment segment;
    private String vin;

    // Constructor for Car class with parameters - brand, name, engine capacity, engine type, power,
// torque, segment and VIN number
    public Car(String mark, String name, double engineCapacity, EngineType engineType, double power,
               double torque, Segment segment, String vin) {
        super(mark, name, engineCapacity, engineType, power, torque);
        this.vin = vin;
        this.segment = segment;
    }

    // Return car segment
    public Segment getSegment() {
        return segment;
    }

    // Set car segment
    public void setSegment(Segment segment) {
        this.segment = segment;
    }

    // getVin - vin number
    public String getVin() {
        return vin;
    }

    // setVin - set the vin number
    public void setVin(String vin) {
        this.vin = vin;
    }

    // Overridden display() method shows information about the car, including segment and VIN number
    @Override
    public void display() {
        System.out.println("Vehicle " + this.vehicleNumber + " out of " + maximumVehicles);
        System.out.println("This is " + this.name + " produced by " + this.mark + ". It's engine type is " +
                this.engineType + " and has " + this.engineCapacity + " capacity. The torque of this vehicle is " +
                this.torque + " and the power is " + this.power + " horsepower. The segment of this car is " +
                this.segment + " and it's vin number is " + this.vin);
    }
}
