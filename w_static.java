/*
 * whenever object created, class loads 
 * and static executed once
 */

class Mobile {
    String brand;
    int price;
    static String name;

    public Mobile() {
        brand = "samsung";
        price = 200;
        System.out.println("no arg constructor");
    }

    static {
        name = "smart";
        System.out.println("static block");
    }

    public void show() {
        System.out.println(brand + ":" +price + ":" +name);
    }

    public static void show1(Mobile m1) {
        System.out.println(m1.brand + ":" +m1.price + ":" +name);
    }
}

class Static {
    public static void main(String args[]) {
        Mobile m1  = new Mobile();
        m1.brand = "Appele";
        m1.price = 10;

        Mobile m2 = new Mobile();
        m2.brand = "Samsung";
        m2.price = 12;

        

        Mobile.name = "smart phone";
        Mobile.show1(m1);
    }
}