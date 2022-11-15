class Computer {
    private String modelNumber;  // modified model to modelNumber
    private String brandName;
    private String manufacturingDate;
    private int numberOfCores;

    public Computer() {
    }

    public Computer(String model, String brandName, String manufacturingDate, int numberOfCores) {
        this.modelNumber = model;   // modified model to modelNumber
        this.brandName = brandName;
        this.manufacturingDate = manufacturingDate;
        this.numberOfCores = numberOfCores;
    }

    // // modified getModel() to getModelNumber()
    public String getModelNumber() {
        return modelNumber;    // modified model to modelNumber
    }

    public void setModel(String model) {
        this.modelNumber = model;   // modified model to modelNumber
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getManufacturingDate() {
        return manufacturingDate;
    }

    public void setManufacturingDate(String manufacturingDate) {
        this.manufacturingDate = manufacturingDate;
    }

    public int getNumberOfCores() {
        return numberOfCores;
    }

    public void setNumberOfCores(int numberOfCores) {
        this.numberOfCores = numberOfCores;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "model='" + modelNumber + '\'' +               // modified model to modelNumber
                ", brandName='" + brandName + '\'' +
                ", manufacturingDate='" + manufacturingDate + '\'' +
                ", numberOfCores=" + numberOfCores +
                '}';
    }
}

class Desktop extends Computer{
    private double width;
    private double height;

    // Default constructor
    public Desktop() {
    }

    // All argument constructor
    public Desktop(String model, String brandName, String manufacturingDate, int numberOfCores, double width, double height) {
        super(model, brandName, manufacturingDate, numberOfCores);
        this.width = width;
        this.height = height;
    }

    // Getter for width
    public double getWidth() {
        return width;
    }

    // Setter for width
    public void setWidth(double width) {
        this.width = width;
    }

    // Getter for height
    public double getHeight() {
        return height;
    }

    // Setter for height
    public void setHeight(double height) {
        this.height = height;
    }

    // Overridden toString() method
    @Override
    public String toString() {
        return "Desktop{" + "width=" + width + ", height=" + height + '}';
    }
}

class Laptop extends Computer{
    private double weight;

    // Default constructor
    public Laptop() {
    }

    // All argument constructor
    public Laptop(String model, String brandName, String manufacturingDate, int numberOfCores, double weight) {
        super(model, brandName, manufacturingDate, numberOfCores);
        this.weight = weight;
    }

    // Getter for weight
    public double getWeight() {
        return weight;
    }

    // Setter for weight
    public void setWeight(double weight) {
        this.weight = weight;
    }

    // Overridden toString() method
    @Override
    public String toString() {
        return "Laptop{" + "weight=" + weight + '}';
    }
}

public class TestComputer {

    public static void main(String[] args) {
        Computer c1= new Computer ("Inspiron 1545", "DELL", "April 1, 2020", 2);//Object 1 
        System.out.println("Model Number : " + c1.getModelNumber());
        System.out.println("BrandName : " + c1.getBrandName());
        System.out.println("manufacturingDate : " + c1.getManufacturingDate());
        System.out.println("NumberOfCores: " + c1.getNumberOfCores());
        System.out.println(" ");
        //Object 2
        Computer c2= new Computer ("A2338", "Macbook", "March 31, 2020 ", 4);//Object 1 
        System.out.println("Model Number : " + c2.getModelNumber());
        System.out.println("BrandName : " + c2.getBrandName());
        System.out.println("manufacturingDate : " + c2.getManufacturingDate());
        System.out.println("NumberOfCores: " + c2.getNumberOfCores());
        System.out.println(" ");
        //Object 3 (my own object)
        Computer c3= new Computer ("1165G7", "HP", "October 15, 2014", 7);//Object 1 
        System.out.println("Model Number : " + c3.getModelNumber());
        System.out.println("BrandName : " + c3.getBrandName());
        System.out.println("manufacturingDate : " + c3.getManufacturingDate());
        System.out.println("NumberOfCores: " + c3.getNumberOfCores());
        System.out.println(" ");
        
        //Object for Desktop
        Desktop d1= new Desktop ();//Object 1 
        System.out.println("The width is : " + d1.getWidth());
        System.out.println("The height is : " + d1.getHeight());
        System.out.println(" ");
        //Object for Laptop
        Laptop l1= new Laptop ();//Object 1 
        System.out.println("The weight is : " + l1.getWeight());
        
        
    }
}

