package us.michaelkaris.assignment2;

public class Sale {
    private String name;
    private String country;
    private double price;
    private double tax;
    private double shippingCost;

    public Sale(String name, String country, double price, double tax) {
        this.name = name;
        this.country = country;
        this.price = price;
        this.tax = tax;
        shippingCost = 0;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public double getPrice() {
        return price;
    }

    public double getTax() {
        return tax;
    }

    public double getShippingCost() {
        return shippingCost;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public void setShippingCost(double shippingCost) {
        this.shippingCost = shippingCost;
    }

    @Override
    public String toString() {
        return "Sale{" +
                "name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", price=" + price +
                ", tax=" + tax +
                ", shipping cost " + shippingCost +
                '}';
    }
}
