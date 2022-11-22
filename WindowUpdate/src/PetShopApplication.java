public class PetShopApplication {
    public static void main(String[] args) {
        
        // instantiation of Cat class
        Cat cat1 = new Cat("cat-1", "John", 10, 5);
        System.out.println("Cat 1 Details: ");
        System.out.println("Cat Name: "+cat1.getName());
        System.out.println("Owner Name: "+cat1.getOwnerName());
        System.out.println("Number of Teeth: "+cat1.getNumberOfTeeth());
        System.out.println("Length of Tail: "+cat1.getLengthOfTail());

        System.out.println();

        Cat cat2 = new Cat("cat-2", "Smith", 12, 4);
        System.out.println("Cat 2 Details: ");
        System.out.println("Cat Name: "+cat2.getName());
        System.out.println("Owner Name: "+cat2.getOwnerName());
        System.out.println("Number of Teeth: "+cat2.getNumberOfTeeth());
        System.out.println("Length of Tail: "+cat2.getLengthOfTail());

        System.out.println();

        // instantiation of Budgie class
        System.out.println("Budgie 1 Details: ");
        Budgie budgie1 = new Budgie("budgie-1", "William", "Black");
        System.out.println("Budgie Name: "+budgie1.getName());
        System.out.println("Owner Name: "+budgie1.getOwnerName());
        System.out.println("Colour Of Feathers: "+budgie1.getColourOfFeathers());

        System.out.println();

        Budgie budgie2 = new Budgie("budgie-2", "Hack", "Brown");
        System.out.println("Budgie 2 Details: ");
        System.out.println("Budgie Name: "+budgie2.getName());
        System.out.println("Owner Name: "+budgie2.getOwnerName());
        System.out.println("Colour Of Feathers: "+budgie2.getColourOfFeathers());
    }
}

// Pet Class
class Pet{
    String name;
    String ownerName;

    Pet(String name, String ownerName){
        this.name = name;
        this.ownerName = ownerName;
    }

    String getName(){
        return name;
    }

    String getOwnerName(){
        return ownerName;
    }
}

// Cat class extends Pet
class Cat extends Pet{
    int numberOfTeeth;
    int lengthOfTail;

    Cat(String name, String ownerName, int numberOfTeeth, int lengthOfTail){
        super(name, ownerName);
        this.numberOfTeeth = numberOfTeeth;
        this.lengthOfTail = lengthOfTail;
    }

    int getNumberOfTeeth(){
        return numberOfTeeth;
    }

    int getLengthOfTail(){
        return lengthOfTail;
    }
}

// Budgie class extends Pet
class Budgie extends Pet{
    String colourOfFeathers;

    Budgie(String name, String ownerName, String colourOfFeathers){
        super(name, ownerName);
        this.colourOfFeathers = colourOfFeathers;
    }

    String getColourOfFeathers(){
        return colourOfFeathers;
    }
}

