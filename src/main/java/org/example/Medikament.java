package org.example;

import java.util.Objects;

//Schritt 1: Erstellt eine Klasse '' mit den Methoden 'getName', 'getPrice' und 'getAvailability'.
public class Medikament {
    private String name;
    private double price;

    private boolean available;

    public Medikament() {
    }

    public Medikament(String name, double price, boolean available) {
        this.name = name;
        this.price = price;
        this.available = available;
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

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Medikament that = (Medikament) o;
        return Double.compare(price, that.price) == 0 && available == that.available && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, available);
    }

    @Override
    public String toString() {
        return "Medikament{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", available=" + available +
                '}';
    }
}
