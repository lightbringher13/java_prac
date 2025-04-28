/*
 * int(256) > byte(127)
 * int a, byte b
 * a > b bigger range works
 * b = a(x)
 * a = b(O) implicit conversion 
 * 
 * explicit conversion = casting -> (byte) a
 * out of range 257 % 256(int) range
 * type promotion: bigger than byte promote to int
 * 
 * boolean and char does not work
 */

class TypeConversion{
    public static void main(String a[]){
        
        // explicit conversion = casting -> (byte) a
        float f = 5.6f;
        int x = (int) f;
        System.out.println(x);

        // b = a(x), a = b(O) implicit conversion
        byte by = 127;
        int b = by;
        System.out.println(b);

        // out of range 257 % 256(int) range
        int y = 257;
        byte c = (byte) y;
        System.out.println(c);
        
        // type promotion: bigger than byte promote to int
        byte d = 10;
        byte e = 30;
        int result = d * e;
        System.out.println(result);
        

    }
}