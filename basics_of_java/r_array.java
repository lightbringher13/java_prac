class Array {
    public static void main(String args[]){
        int nums[][] = new int[3][4];
        
        for (int i = 0;i<3;i++){
            for (int j = 0;j<4;j++){
                nums[i][j] = (int) (Math.random() * 100);
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
        
        // int n[] : nums -> list in 2D list
        // int m : n -> value in list
        for (int n[] : nums) {
            for (int m : n) {
                System.out.print(m + " ");
            }
            System.out.println();
        }
        
        // jagged array
        int jagged_arr[][] = new int[3][];
        jagged_arr[0] = new int[3];
        jagged_arr[1] = new int[4];
        jagged_arr[2] = new int[2];

        for (int i = 0; i < jagged_arr.length;i++){
            for (int j = 0; j < jagged_arr[i].length;j++){
                jagged_arr[i][j] = (int) (Math.random() * 100);
            }
        }

        for (int n[] : jagged_arr) {
            for (int m : n){
                System.out.print(m + " ");
            }
            System.out.println();
        }
    
    }
}