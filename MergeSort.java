public class MergeSort {

    public static void conquer(int[] arr,int si,int mid,int ei){
        int[] mergedArray = new int[ei - si + 1];

        int indx1 = si;
        int indx2 = mid + 1;
        int x = 0;


        while(indx1 <= mid && indx2 <= ei){
            if (arr[indx1] <= arr[indx2]){
                mergedArray[x] = arr[indx1];
                indx1++;
            }
            else {
                mergedArray[x] = arr[indx2];
                indx2++;
            }
            x++;
        }

        while (indx1<=mid){
            mergedArray[x] = arr[indx1];
            indx1++;
            x++;
        }
        while (indx2<=ei){
            mergedArray[x] = arr[indx2];
            indx2++;
            x++;
        }

        for (int i =0; i<mergedArray.length; i++){
            arr[si+i] = mergedArray[i];
        }


    }
    public static void divide(int[] arr, int si,int ei){
        if (si >= ei){
            return;
        }

        int mid = si+(ei-si)/2;

        divide(arr,si,mid);
        divide(arr,mid+1,ei);
        conquer(arr,si,mid,ei);
    }
    public static void main(String[] args) {
        int[] arr = {9,3,5,3,5,75,3,2,4,6};
        divide(arr,0,arr.length-1);

        for (int i : arr){
            System.out.println(i);
        }
    }
}
