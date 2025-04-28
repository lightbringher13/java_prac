class WhileLoop {
    public static void main(String args[]){
        int i = 0;
        while(i < 4){
            System.out.println(i);
            i++;
            int j = 1;
            while(j <= 2){
                System.out.println("hello");
                j++;
            }
        }
        System.out.println(i);
    }
}