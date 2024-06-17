package practice;

import java.util.Scanner;

class demo{
    public static void main(String[] args) {
        
        // user enter number and using that number we pront a multliplication table 

        System.out.println("Multliplication table");
        System.out.println("enter number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
    
        System.out.println("Table of " + n + " number : ");

        for (int i = 1; i <= 10; i++) {
            System.out.println(n +" x "+ i + " = " + n*i );
        }
    }
}