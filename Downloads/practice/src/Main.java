public class Main {
    public static void main(String[] args) {
        int [][] arr = {{1,2,3},{4,5,6},{7,8,9}};
//        for(int [] row : arr){
//            swap(row);
//        }
        for (int i = 0; i < arr[0].length; i++) {
            if(i%2!=0){
                for (int j = arr.length-1; j >=0; j--) {
                    System.out.print(arr[j][i]);
                }
            }else {
                for (int j = 0; j < arr.length; j++) {
                    System.out.print(arr[j][i]);
                }
            }

            System.out.println();
        }


        System.out.println();

    }

    private static void swap(int[] arr) {
        int i=0;
        int j = arr.length-1;
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

}