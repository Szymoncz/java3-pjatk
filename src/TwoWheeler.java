// Autor: Szymon Czudowski
// Z klasy Pojazd dziedziczą Samochod (dodatkowe atrybuty segment i VIN) oraz Jednoslad (dodatkowy atrybut typ).
// Obie wspomniane klasy wykorzystują autorskie enumeracje i zostają wyposażone w konstruktory oraz metody wyswietl,
// nadpisujące metody o tej samej nazwie w klasach nadrzędnych. Konstruktory mają wywoływać konstruktory klasy
// nadrzędnej i wpisywać się w logikę autonumerowania i wyświetlania informacji o numeracji. W szczególności, klasy
// te powinny mieć konstruktory pobierające odpowiednio 8 i 7 atrybutów - a jednoślad dodatkowo konstruktor, który
// nie pobiera wszystkich atrybutów (z uwagi na specyficzną logikę opisu rowerów i hulajnóg tradycyjnych). Metoda
// wyświetlająca klasy Jednoślad ma pomijać wartości niewprowadzone.
public class TwoWheeler extends Vehicle {
    private String type;

    public TwoWheeler(String mark, String name, double engineCapacity, EngineType engineType, double power,
                      double torque, String type) {
        super(mark, name, engineCapacity, engineType, power, torque);
        this.type = type;
    }

    public TwoWheeler(String mark, String name, String type) {
        super(mark, name);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void display() {
        System.out.println("Vehicle " + this.vehicleNumber + " out of " + maximumVehicles);
        if (engineType == null) {
            System.out.println("This is a " + this.type + " named " + this.name + " produced by " + this.mark + ".");
        } else {
            System.out.println(this.name + " produced " + this.mark + " is a " + this.type +
                    ". Engine " + this.engineType + " capacity " + this.engineCapacity +
                   " torque " + this.torque + " power " + this.power);
        }
    }
}