/*
 * 0b: base 2
 * 0x: base 16
 * 0o: octal
 */
class Literal{
    public static void main(String a[]){
        int num1 = 585;
        int num2 = 0b101;
        int num3 = 0x7E;
        int num4 = 10_000_000; //shows 0 easily
        double num5 = 12e10;
        boolean num6 = true;
        char c = 'a';
        c++;
        int binaryNum = 0b1010;
        int hexaNum = 0x7b;
        int ocatalNum = 066;


        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
        System.out.println(num5);
        System.out.println(num6);
        System.out.println(c);
        System.out.println(binaryNum);
        System.out.println(hexaNum);
        System.out.println(ocatalNum);
    }
}