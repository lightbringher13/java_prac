class ForLoop {
    public static void main(String args[]){
        for (int i = 1;i<=5;i++){
            System.out.println("day" + i);
            for (int j = 1;j<=9;j++){
                System.out.println("hour" + (j+8));
            }
        }
    }
}