public class duckObject {
    public static void main(String[] args) {
        
        Duck duck1 = new Duck("Oncle Scrooge");
        Duck duck2 = new Duck("Huey", 20);
        duck1.setNewName("Dewey");

        duck1.getNewName();
        duck1.getAge();

        duck2.getNewName();
        duck2.getAge();
    }
}

class Duck {
    String name;
    int age;

    Duck(String name){
        setNewName(name);
    }

    Duck(String name, int age){
        setNewName(name);
        setAge(age);
    }

    public void setNewName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void getNewName() {
        System.out.println(this.name);
    }

    public void getAge() {
        System.out.println(this.age);
    }
}

