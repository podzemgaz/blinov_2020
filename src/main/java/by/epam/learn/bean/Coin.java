//#9 Java Bean
package by.epam.learn.bean;

public class Coin {
    private double diameter;
    private double weight;

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        if (diameter > 0) {
            this.diameter = diameter;
        } else {
            System.out.println("Negative diameter!");
        }
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if (weight > 0) {
            this.weight = weight;
        } else {
            System.out.println("Negative weight!");
        }
    }
}
