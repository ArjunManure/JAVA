public class QuickSort {

    public static int partition(int[] arr,int low,int high){
        int pivot = arr[high];
        int i = -1;
        for (int j=low;j<high;j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = pivot;
        arr[high] = temp;
        return i+1;
    }

    public static void quickSort(int[] arr, int low, int high){
        if(low<high){
            int pivot = partition(arr,low,high);

            quickSort(arr,low,pivot-1);
            quickSort(arr,pivot+1,high);
        }

    }
    public static void main(String[] args) {
        int[] arr = {5,3,4,8,6,7};
        System.out.print("Input array : " );
        for (int i : arr){
            System.out.print(i+ " ");
        }
        System.out.println();
        quickSort(arr,0,arr.length-1);
        System.out.print("Sorted array: " );
        for (int i : arr){
            System.out.print(i+" ");
        }
    }
}
