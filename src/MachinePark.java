// autor: Szymon Czudowski
// W metodzie głównej klasy ParkMaszynowy zadeklarować po 2 obiekty każdej klasy, w stosunku do której jest to możliwe.
// Wszystkie obiekty trafiają do pojedynczej kolekcji i są wyświetlane pętlą for each. Jakiej modyfikacji należy
// dokonać w klasie Maszyna, aby było to możliwe? Wykorzystaj dodolną metodę set obiektu klasy Kosiarka i wyświetl
// ten obiekt ponownie.

import java.util.ArrayList;
import java.util.List;

public class MachinePark {

    public static void main(String[] args) {
        // Creating an ArrayList to hold machines
        List<Machine> machines = new ArrayList<>();
        // Creating instances of different types of machines
        Locomotive locomotive1 = new Locomotive("Lokomotywa1", "Przykładowy1", 330.0,
                Machine.EngineType.steam, Locomotive.TypeOfCarrige.cargo, 2008);
        Locomotive locomotive2 = new Locomotive("Lokomotywa2", "Przykładowa2", 122.0,
                Machine.EngineType.electric, Locomotive.TypeOfCarrige.passenger, 2019);
        Lawnmower lawnmower1 = new Lawnmower("Lawmower1", "XXXXXXXX", 2.0,
                Machine.EngineType.electric, false, true, 4);
        Lawnmower lawnmower2 = new Lawnmower("Polski produkt", "Best", 2.0,
                Machine.EngineType.gasoline, true, false, 2);
        Vehicle vehicle1 = new Vehicle("Skoda", "Perfect", 3.5,
                Machine.EngineType.gasoline, 150, 5);
        Vehicle vehicle2 = new Vehicle("Mercedes", "G klasa", 5.0, Machine.EngineType.diesel,
                180, 2.5);
        Car car1 = new Car("Ford", "Mondeo", 3.0, Machine.EngineType.gasoline,
                150, 3, Car.Segment.A, "W98457V4875V");
        Car car2 = new Car("Toyota", "Corolla", 2.0, Machine.EngineType.diesel,
                90, 2.5, Car.Segment.B, "WHV97TLOBLO8W4");
        TwoWheeler twoWheeler1 = new TwoWheeler("Terain", "Dark one", "scooter");
        TwoWheeler twoWheeler2 = new TwoWheeler("City", "Extra one", 0.5,
                Machine.EngineType.electric, 10, 3, "bicycle");
        // Adding machines to the ArrayList
        machines.add(locomotive1);
        machines.add(locomotive2);
        machines.add(lawnmower1);
        machines.add(lawnmower2);
        machines.add(vehicle1);
        machines.add(vehicle2);
        machines.add(car1);
        machines.add(car2);
        machines.add(twoWheeler1);
        machines.add(twoWheeler2);
        // Looping through the machines and calling the display method for each of them

        for (Machine machine : machines) {
            machine.display();
        }
        // Changing the blades of the lawnmower and displaying the updated information

        lawnmower1.setBlades(20);
        lawnmower1.display();

    }
}