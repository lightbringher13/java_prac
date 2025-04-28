class logicalOperators {
    public static void main(String args[]) {
        int x = 8;
        int y = 2;
        int a = 123;
        int b = 23;
        // short circuit: &,|,! -> &&,|| 
        //does not check the remaining condition
        boolean res = (x < y) && (a>b);
        System.out.println(!res);
    }

}