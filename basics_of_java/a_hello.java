/*
 * Java code(.java) -> Javac(complier) -> byte code(.class) ->
 * JVM finds the "public static void main(String a[])"
 * JVM makes java platform independent
 * javac Hello.java == file.java -> compile the file name
 * java Hello == class name -> implement the code
 * JRE(Java Runtime Environment > JVM(Java Virtual Machine) + lib)
 * JDK > JRE > JVM
 * Write Once Run Anywhere
 */


class Hello{
    public static void main(String a[]){
        System.out.print("hello, world");
    }
}