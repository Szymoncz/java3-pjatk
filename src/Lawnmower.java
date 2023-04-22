// Autor: Szymon Czudowski
// Uzupełnij repozytorium o klasę Kosiarka, która: - dziedziczy z maszyny; - wprowadza prywatne atrybuty czyMelekser
// (typu boolean), czyNaped(j.w.) i liczbaOstrzy (typu int); - posiada, analogicznie jak klasa Kosiarka, jeden
// konstruktor i metodę wyswietl, która wyświetla komplet 7 atrybutów w zorganizowanej formie; - dodatkowo, klasa ma
// zawierać metody set dla wszystkich trzech nowowprowadzanych atrybutów.

// This is a class named Lawnmower which extends the Machine class
public class Lawnmower extends Machine {

    // Declare variables that are specific to Lawnmower class
    private boolean isBlender;
    private boolean isPropultion;
    private int blades;

    // Constructor that sets values for variables inherited from Machine and variables specific to Lawnmower
    public Lawnmower(String mark, String name, double engineCapacity, EngineType engineType, boolean isBlender,
                     boolean isDrive, int blades) {

        // Calls the constructor of the parent class and passes arguments for it to set values for inherited variables
        super(mark, name, engineCapacity, engineType);

        // Set values for variables specific to Lawnmower
        this.isBlender = isBlender;
        this.isPropultion = isDrive;

        // Check if the value for blades is negative, and if so throw an exception
        if (blades < 0) {
            throw new IllegalArgumentException("Only non negative number");
        } else {
            // If the value for blades is not negative, set it
            this.blades = blades;
        }
    }

    // Getter method for isBlender variable
    public boolean isBlender() {
        return isBlender;
    }

    // Setter method for isBlender variable
    public void setBlender(boolean blender) {
        this.isBlender = blender;
    }

    // Getter method for isPropultion variable
    public boolean isPropultion() {
        return isPropultion;
    }

    // Setter method for isPropultion variable
    public void setPropultion(boolean propultion) {
        this.isPropultion = propultion;
    }

    // Getter method for blades variable
    public int getBlades() {
        return blades;
    }

    // Setter method for blades variable
    public void setBlades(int blades) {
        // Check if the value for blades is negative, and if so throw an exception
        if (blades < 0) {
            throw new IllegalArgumentException("Only non negative number");
        } else {
            // If the value for blades is not negative, set it
            this.blades = blades;
        }
    }

    // Method that overrides the display method of the parent class to display information about Lawnmower
    @Override
    public void display() {
        // Declare local variables to hold strings that describe whether the lawnmower has a blender and drive
        String isBlender;
        String isDrive;

        // Check the value of isBlender variable and set its corresponding string
        if (this.isBlender) {
            isBlender = " = ";
        } else {
            isBlender = " don't have ";
        }

        // Check the value of isPropultion variable and set its corresponding string
        if (this.isPropultion) {
            isDrive = " = ";
        } else {
            isDrive = " don't have ";
        }

        // Display information about the lawnmower using variables set previously
        System.out.println(this.name + " lawnmower, produced " + this.mark + ". Engine "
                + this.engineType + " capacity: " + this.engineCapacity + this.name + isDrive +
                isBlender + "blender. It has " + this.blades + " blades.");
    }
}