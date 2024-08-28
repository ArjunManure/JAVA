package problems;

import java.util.*;

public class frequencyArray {
    public static void solution(int[] array){
        int count = 0;
        ArrayList<Integer> tempArray = new ArrayList<>();
        for (int i =0;i<array.length;i++){
            if (tempArray.contains(array[i])){
                continue;
            }
            int number = array[i];
            for(int j = 0 ;j<array.length;j++){
                if(number == array[j]){
                    count++;
                }
            }
            System.out.println("The frequency of "+array[i]+" is : "+count);
            tempArray.add(number);
            count = 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of elements: ");
        int n = sc.nextInt();
        int[] array = new int[n];

        System.out.println("Enter the elements in array: ");
        for (int i =0;i<n;i++){
            int element = sc.nextInt();
            array[i] = element;
        }
        solution(array);
    }
}
