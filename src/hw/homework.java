package hw;

import java.util.Arrays;

public class homework {
    public static void task1(){
        System.out.println("Task 1: ");

        int [] arr1 = new int[]{1, 2, 3};
        double [] arr2 = {1.57, 7.654, 9.986};
        short [] arr3 = new short[]{9, 8, 7, 6, 5, 4, 3, 2, 1};

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));

        System.out.println(" ");
    }
    public static void task2(){
        System.out.println("Task 2: ");

        int [] arr1 = new int[]{1, 2, 3};
        double [] arr2 = {1.57, 7.654, 9.986};
        short [] arr3 = new short[]{9, 8, 7, 6, 5, 4, 3, 2, 1};

        for(int i = 0; i < arr1.length; i++){
            System.out.printf("%d", arr1[i]);
            if(i < arr1.length-1){
                System.out.print(", ");
            }
        }
        System.out.println(" ");

        for(int i = 0; i < arr2.length; i++){
            System.out.printf("%.3f", arr2[i]);
            if(i < arr2.length-1){
                System.out.print(", ");
            }
        }
        System.out.println(" ");

        for(int i = 0; i < arr3.length; i++){
            System.out.printf("%d", arr3[i]);
            if(i < arr3.length-1){
                System.out.print(", ");
            }
        }
        System.out.println(" ");
        System.out.println(" ");
    }
    public static void task3(){
        System.out.println("Task 3: ");

        int [] arr1 = new int[]{1, 2, 3};
        double [] arr2 = {1.57, 7.654, 9.986};
        short [] arr3 = new short[]{9, 8, 7, 6, 5, 4, 3, 2, 1};

        for(int i = arr1.length-1; i >= 0; i--){
            System.out.printf("%d", arr1[i]);
            if(i != 0){
                System.out.print(", ");
            }
        }
        System.out.println(" ");

        for(int i = arr2.length-1; i >= 0; i--){
            System.out.printf("%.3f", arr2[i]);
            if(i != 0){
                System.out.print(", ");
            }
        }
        System.out.println(" ");

        for(int i = arr3.length-1; i >= 0; i--){
            System.out.printf("%d", arr3[i]);
            if(i != 0){
                System.out.print(", ");
            }
        }
        System.out.println(" ");

        System.out.println(" ");
    }
    public static void task4(){
        System.out.println("Task 4: ");

        int [] arr = new int[]{1, 2, 3};
        for(int i = 0; i < arr.length; i++){
            if (arr[i] % 2 != 0){
                arr[i] += 1;
            }
        }
        System.out.println(Arrays.toString(arr));

        System.out.println(" ");
    }
}
