class ifElse{
    public static void main(String args[]){
        int x = 8;
        int y = 10;
        int z = 12;

        if (x>y && x > z) {
            System.out.println(x);
        }
        else if (y > z) {
            System.out.println(y);
        }
        else
        System.out.println(z);

    }
}