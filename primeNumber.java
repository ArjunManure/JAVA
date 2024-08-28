package problems;

import java.util.ArrayList;
import java.util.Scanner;

public class primeNumber {
    public static void solution(int num){
        int count  =0;
        String str ="";
        int prime = 0;
        ArrayList<Integer> tempArray  = new ArrayList<>();
        System.out.print("The prime numbers are: ");
        for (int i = 2;i<=num;i++){
            int number = i;
            for (int j=1;j<=i;j++){
                if(number%j == 0){
                    count++;
                }
            }
            if (count == 2){
                str = str + number+ ", ";
                prime++;
            }
            count = 0;
        }

        System.out.println("There are "+ prime +"prime numbers less than 10, they are "+ str);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int num = sc.nextInt();
        solution(num);
    }
}
