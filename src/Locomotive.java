// Autor: Szymon Czudowski
// Zaimplementuj klasę Lokomotywa dziedziczącą po maszynie. Klasa ta ma dodawać dwa prywatne atrybuty
// charakterystyczne dla lokomotyw i nieuwzględnione wcześniej w maszynie. Klasa ta ma mieć konstruktor, przyjmujący
// komplet 6 parametrów oraz metodę wyswietl, wyrzucającą w zamyśle na ekran wyczerpujący opis danej lokomotywy.
// Declaring private variables
public class Locomotive extends Machine {

    private TypeOfCarrige typeOfCarrige;
    private int yearOfProduction;

    // Creating enum TypeOfCarrige
    public enum TypeOfCarrige {
        passenger, cargo, universal
    }
    // Constructor of class Locomotive
    public Locomotive(String mark, String name, double engineCapacity, EngineType engineType, TypeOfCarrige typeOfCarrige, int yearOfProduction) {
        // Calling the constructor of the super class and passing parameters to it
        super(mark, name, engineCapacity, engineType);
        // Setting the value of typeOfCarrige
        this.typeOfCarrige = typeOfCarrige;

        // Checking if the year of production is valid, if not throwing an IllegalArgumentException
        if (yearOfProduction < 1802 || yearOfProduction > 2023) {
            throw new IllegalArgumentException("First locomotive was created in 1802, and the newest one in 2023.");
        } else {
            // Setting the value of yearOfProduction
            this.yearOfProduction = yearOfProduction;
        }
    }

    // Getter method for typeOfCarrige
    public TypeOfCarrige getTypeOfCarrige() {
        return typeOfCarrige;
    }

    // Setter method for typeOfCarrige
    public void setTypeOfCarrige(TypeOfCarrige typeOfCarrige) {
        this.typeOfCarrige = typeOfCarrige;
    }

    // Getter method for yearOfProduction
    public int getYearOfProduction() {
        return yearOfProduction;
    }

    // Setter method for yearOfProduction
    public void setYearOfProduction(int yearOfProduction) {
        // Checking if the year of production is valid, if not throwing an IllegalArgumentException
        if (yearOfProduction < 1802 || yearOfProduction > 2023) {
            throw new IllegalArgumentException("Locomotive production start in 1802");
        } else {
            // Setting the value of yearOfProduction
            this.yearOfProduction = yearOfProduction;
        }
    }
    // Method to display information about the Locomotive

    @Override
    public void display() {
        System.out.println(this.name + " locomotive. Produced" + this.mark +
                this.yearOfProduction + ". Usage " + this.typeOfCarrige + " train. Engine type" + this.engineType + " and capacity " + this.engineCapacity + " capacity." );
    }
}