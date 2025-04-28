class A {
    public void show() {
        System.out.println("show in A");
    }
}

class B extends A {
    public void show() {
        System.out.println("show in B");
    }
}

class MethodOverriding {
    public static void main(String args[]){
        B b = new B();
        b.show();

    }
}