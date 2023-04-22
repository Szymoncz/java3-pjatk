// Autor: Szymon Czudowski
// Zaimplementuj abstrakcyjną klasę Maszyna z chronionymi atrybutami marka, nazwa, pojemnoscSilnika i rodzajSilnika.
// Ten ostatni ma być enumeracją.

public abstract class Machine {
    // protected fields for storing machine properties
    protected String mark;
    protected String name;
    protected double engineCapacity;
    protected EngineType engineType;
    // enum for engine types
    protected enum EngineType {
        diesel, gasoline, gas, hybrid, steam, electric
    }
    // abstract method for displaying machine information
    public abstract void display();
    // Constructor with arguments for machine properties
    public Machine(String mark, String name, double engineCapacity, EngineType engineType) {
        this.mark = mark;
        this.name = name;
        this.engineCapacity = engineCapacity;
        this.engineType = engineType;
    }
    // Constructor with only mark and name properties
    public Machine(String mark, String name) {
        this.mark = mark;
        this.name = name;
    }
}
