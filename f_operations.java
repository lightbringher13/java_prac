class operators {
    public static void main(String args[]){
        int num1 = 14;
        int num2 = 7;
        /*
         * +,-,*,/,%
         */
        num1++;
        num2--;
        System.out.println(num1 + num2);
        // pre - increment increment result and then assign result
        int result = ++num1;
        System.out.println(result);
        
        // post- increment 
        // assign result and increment result
        result = result++;

        System.out.println(result);
    }
}