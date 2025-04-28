class A {
    public void show(){
        System.out.println("show in A");
    }
}

class B extends A {
    public void show(){
        System.out.println("show in B");
    }
}

// it depends on on the object
class DynamicMethodDispatch{
    public static void main(String args[]){
        A obj = new A();
        obj.show();

        obj = new B();
        obj.show();

    }
}