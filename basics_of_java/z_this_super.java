// every class in java extends object
class A extends Object {
    public A(){
        // calling Object class's constructor
        super(); // execution order 3 
        System.out.println("constructor A"); // execution order 4
    }

    public A(int a){
        super(); // execution order 7
        System.out.println("parameter constructor A"); // execution order 8
    }
}

class B extends A {
    public B(){
        super(); // execution order 2
        System.out.println("constructor B"); // execution order 5
    }

    public B(int b){
        // execution order 7
        super(b); //always there whether you write or not
        // this(); // executes the same class constructor
        System.out.println("parameter constructor B"); // execution order 10
    }
}


class ThisSuper {
    public static void main(String args[]){
        // B b = new B(); // execution order 1
        // B b1 = new B(5); // execution order 6
    }
}