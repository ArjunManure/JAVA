import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {


        //while loop
        int i = 1;
        while(i<=10){
            System.out.println(2*i);
            i++;
        }


        //do-while loop
        System.out.println("Using do-while loop");
        int j =0;
        do{
            System.out.println(2*j);
            j++;
        }while(j<=10);


        //for loop
        System.out.println("for loop");
        for(int k=1;k<=10;k++){
            System.out.println(2*k);
        }


        //print odd number using for loop
        System.out.println("printing first n odd no.");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        for (int b =0;b<a;b++){
            if(b%2 ==0){
                continue;
            }
            else{
                System.out.println(b);
            }
        }



    }



}
