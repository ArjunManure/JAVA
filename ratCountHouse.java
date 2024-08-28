package problems;

import java.util.Scanner;

public class ratCountHouse {
    public static int solution(int[] array,int rats,int units){
        if(array.length == 0){
            return -1;
        }
        int count = 0;
        int totalFood = rats*units;
        int foodConsumed = 0;
        int i =0;
        while(foodConsumed<totalFood){
            foodConsumed = foodConsumed + array[i];
            i++;
            count++;
            if(count>array.length-1){
                return 0;
            }
        }

        return count;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no.of house: ");
        int house = sc.nextInt();
        int [] array = new int[house];
        System.out.println("Enter the no. of rats: ");
        int rats = sc.nextInt();
        System.out.println("Enter the no. of units: ");
        int units = sc.nextInt();
        System.out.println("Enter the food: ");
        for (int i =0;i<house;i++){
            int food = sc.nextInt();
            array[i] =food;
        }

        int result = solution(array,rats,units);
        System.out.println(result);
    }

}
