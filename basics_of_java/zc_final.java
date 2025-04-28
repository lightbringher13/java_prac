class A {
    final public void show() {
        System.out.println("can not override the final method");
    }
}

class C {
    public static void show() {
        System.out.println("no class can inherit final class");
    }
}

class B extends A{

}

class Final {
    public static void main(String args[]){
        final double pi = 3.14;
        System.out.println(pi + "pi can not be changed");
    }
}