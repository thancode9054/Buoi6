package Bai3;

public class Vehicle {
    private String name;
    private double price;
    private int cylinderCapacity;
    public char[] getName;

    public Vehicle() {

    }

    public Vehicle(String name, double price, int cylinderCapacity) {
        this.name = name;
        this.price = price;
        this.cylinderCapacity = cylinderCapacity;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCylinderCapacity() {
        return cylinderCapacity;
    }

    public void setCylinderCapacity(int cylinderCapacity) {
        this.cylinderCapacity = cylinderCapacity;
    }

    public double taxCollection() {
        double tax ;
        if (cylinderCapacity < 100) {
            tax = price * 0.01;
        } else if (cylinderCapacity >= 100 && cylinderCapacity <= 200) {
            tax = price * 0.03;
        } else {
            tax = price * 0.05;
        }
        return tax;
    }
}
