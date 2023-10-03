package Sprint1.Bilregister;

public class Car {

    private String  regPlate;
    private String brand;
    private String model;
    private Person owner;

    public Car (String regPlate, String brand, String model, Person owner){
        this.regPlate = regPlate;
        this.brand = brand;
        this.model = model;
        this.owner = owner;



    }



    public void Person (Carowner newOwner){
        owner = newOwner;


    }



    public String getRegPlate() {
        return regPlate;
    }

    public void setRegPlate(String regPlate) {
        this.regPlate = regPlate;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Carowner owner) {
        this.owner = owner;
    }

    public  Person changeOwner (Person powner, Person newOwner){
        owner = newOwner;
        return newOwner;
    }

    @Override
    public String toString() {
        return "Car{" +
                "regPlate='" + regPlate + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", owner=" + owner +
                '}';
    }
}
