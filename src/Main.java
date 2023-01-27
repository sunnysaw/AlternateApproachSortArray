/*
Question : For given array sort in ascending order by swapping method.
 */

public class Main {
    public static void SortArray(int[] arr){
        int n = arr.length;
        int temp , left = 0 , right = n -1;
        while (left < right){
            if (arr[left] == 1 && arr[right] == 0){
                temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
            if (arr[left] == 0){
                left++;
            }
            if (arr[right] == 1){
                right--;
            }
        }
        System.out.println("NOW PRINTING THE FINAL RESULT :");
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i]);
        }
    }
    public static void main(String[] args) {
        int[] arr = {0,0,0,1,0,1,1,1};
        SortArray(arr);
    }
}
