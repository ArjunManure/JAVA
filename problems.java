import java.util.Scanner;

public class problems {

    public static void main(String[] args) {

/*        //problem 1
        String name = "MY NAME IS ARJUN";
        name = name.toLowerCase();
        System.out.println(name);

        //problem 2
        name = name.replace(" ","_");
        System.out.println(name);

        //problem 3
        String letter = "Hi! <|name|>, How are you ";
        letter = letter.replace("<|name|>","arjun");
        System.out.println(letter);

        //problem 4
        String letter2 = "This contains  double and   triple spaces";
        System.out.println(letter2.indexOf("  "));
        System.out.println(letter2.indexOf("   "));

        //problem 5
        String letter3 = "Dear Arjun, \n\tyou are great.\n\tThanks a lot! ";
        System.out.println(letter3);
*/
/*
        // adding two matrices of size 2 x 3

        int[][] array1 = new  int[3][2];
        int[][] array2 = new  int[3][2];
        int[][] arraySum = new int[3][2];

        System.out.println("CREATING 1ST Matrix");
        for (int i =0;i <3;i++){
            for (int j =0;j<2;j++){
                System.out.println("Enter the number: ");
                Scanner sc = new Scanner(System.in);
                array1[i][j] = sc.nextInt();
            }
        }
        System.out.println("CREATING 2ND Matrix");
        for (int i =0;i <3;i++){
            for (int j =0;j<2;j++){
                System.out.println("Enter the number: ");
                Scanner sc = new Scanner(System.in);
                array2[i][j] = sc.nextInt();
            }
        }

        System.out.println("Printing the resultant matrix:");

        for (int i =0;i <3;i++){
            for (int j =0;j<2;j++){
                arraySum[i][j] = array1[i][j] + array2[i][j];
            }
        }

        for (int i =0;i <3;i++){
            for (int j =0;j<2;j++){
                System.out.println(arraySum[i][j]);
            }
        }
*/
/*
       //REVERSING AN ARRAY

        int[] array = new int[4];

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the elements: ");
        for (int i =0;i<4;i++){
            array[i] = sc.nextInt();
        }
        System.out.println("-----REVERSED ARRAY------");
        for (int a =3;a>=0;a--){
            System.out.print(array[a]+" ");
        }

        */

/*
        // FINDING MINIMUM AND MAXIMUM

        Scanner sc = new Scanner(System.in);
        int[] array = new int[7];

        System.out.println("Enter the numbers: ");
        for (int i =0 ;i<7;i++){
            array[i] = sc.nextInt();
        }

        int min = array[0];
        int max = array[0];
        for (int j =1 ;j<array.length;j++){

            if (array[j]>max){
                max = array[j];

            }

            else if(array[j]<min){
                min = array[j];
            }
        }

        System.out.println("The minimum no is : " + min);
        System.out.println("The maximum no is : " + max);

        */

        /*

        // CHECK IF THE ARRAY IS SORTED OR NOT

        Scanner sc = new Scanner(System.in);
        int[] array = new int[7];

        System.out.println("Enter the numbers: ");
        for (int i =0 ;i<7;i++){
            array[i] = sc.nextInt();
        }

        int count =1 ;
        int num = array[0];
        for (int i =1 ; i<7;i++){
            if (num<array[i]){

                num = array[i];
                count = count + 1;
            }
            else{
                System.out.println("Array is not sorted");
                break;
            }

        }
        if (count == 7) {
            System.out.println("Array is sorted");
        }

         */
    }

}






