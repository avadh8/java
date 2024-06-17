package YT.day2;

import java.util.Scanner;

public class switchCase {


    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Number :");
        int num1 = sc.nextInt();

        System.out.print("Enter Number :");
        int num2 = sc.nextInt();

        System.out.println("choose an operation :");
        System.out.println("1. addition:");
        System.out.println("2. substaction:");
        System.out.println("3. division:");
        System.out.println("4. multiplication:");

        int choice = sc.nextInt();

        switch (choice) {
            case 1 -> System.out.println("result : " + (num1 + num2));
            case 2 -> System.out.println("result : " + (num1 - num2));
            case 3 -> System.out.println("result : " + (num1 * num2));
            case 4 -> System.out.println("result : " + (num1 / num2));     
        }

        
    }
    
}
