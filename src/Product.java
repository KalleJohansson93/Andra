package Lektion2Övn3;

public class Product {
    int productID;
    String name;
    double pris;
    int moms;
    double weight;
    int stockAvailable;

    public Product(int productID, String name, double pris, int moms, double weight, int stock) {
        this.productID = productID;
        this.name = name;
        this.pris = pris;
        this.moms = moms;
        this.weight = weight;
        this.stockAvailable = stock;
    }

    public String print(){
        return "Prodcut ID: " + productID +
                "\nName: " + name +
                "\nPris: " + pris +
                "\nMoms: " + moms +
                "\nWeight: " + weight +
                "\nStock available: " + stockAvailable;
    }

    public static void main(String[] args) {
        Product p = new Product(123, "Chocolate", 20.5,12,200,50);
        System.out.println(p.print());
    }
}
