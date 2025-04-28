class Calc {
    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }

    
}

//single level inheritance
class AdvCalc extends Calc {
    public int mul(int a, int b) {
        return a * b;
    }

    public int div(int a, int b) {
        return a / b;
    }
}

//multilevel inheritance
class VeryAdvCalc extends AdvCalc {
    public double power(int a, int b) {
        return Math.pow(a, b);
    }
}

//java does not support multiple inheritance
class Inheritance {
    public static void main(String args[]){
        VeryAdvCalc cal = new VeryAdvCalc();
        int r1 = cal.add(3,5);
        int r2 = cal.sub(3,3);
        int r3 = cal.mul(3,4);
        int r4 = cal.div(3,4);
        double r5 = cal.power(3,5);
        System.out.println(r1 + " " + r2 + " " + r3 + " " + r4+ " " +r5);
    }
}