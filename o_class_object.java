class Calculator {
    public int a = 0;
    public int add(int n1,int n2) {
        return n1 + n2;
    }
}
class Demo {
    public static void main(String args[] ){
        int num1 = 23;
        int num2 = 23;
        Calculator cal = new Calculator();
        System.out.println(cal.add(num1,num2));

    }
}