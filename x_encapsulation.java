class Human {
    //instance variable must be private
    // only within the same class
    private int age;
    private String name;

    public Human() {
        System.out.println("default constructor");
    }

    public Human(int age,String name) {
        this.age = age;
        this.name = name;
        System.out.println("parameter constructor");
    }
    
    //encapsulation
    public int getAge() {
        return this.age;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println(this.name);
    }

    public void setAge(int age) {
        this.age = age;
        System.out.println(this.age);
    }
}

class Encapsulation {
    public static void main(String args[]){
        Human h1 = new Human();
        Human h2 = new Human(30,"riss");

        // new Human(); anonymous object create object no reference

        h1.getAge();
        h2.getAge();

        h1.getName();
        h2.getName();

        h1.setAge(200);
        h1.setName("risssss");

        h2.setAge(3000);
        h2.setName("memememe");

        h1.getAge();
        h2.getAge();

        h1.getName();
        h2.getName();

    }
}