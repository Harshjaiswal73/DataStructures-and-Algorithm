// how to store array in memory

package Arrays;

public class Memory {

    public static void swap(int[]arr, int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) throws Exception{
        int[] arr;

        arr= new int[5];
        arr[0] = 33;
        arr[1] = 47;
        arr[2] = 60;
        arr[3] = 75;
        arr[4] = 98;

        // int[]two =arr;
        // two[2] =500;

        // for(int i=0;i<two.length;i++){
        //     System.out.println(two[i]);
        // }

        swap(arr, 0, 4);

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
