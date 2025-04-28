class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
    public double add(double a, int b){
        return a + b;
    }
    public int add(int a, int b, int c){
        return a+b+c;
    }
}
class MethodsOverloading{
    public static void main(String args[]){
        Calculator cal = new Calculator();
        int r = cal.add(2,4);
        int r1 = cal.add(3,4,3);
        System.out.println(r + r1);
    }
}