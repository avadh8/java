package YT.day2;

import java.util.Scanner;


public class percentage {
    
    public static void main(String[] args) {
        
        Scanner sc =  new Scanner(System.in);
        
        System.out.println("Student percentage calculator !! ");
        
        System.out.print("Enter your name :");
        String name = sc.next();

        System.out.println("Enter marks : ");

        //method 1

        // System.out.print("English : ");
        // float eng = sc.nextInt();

        // System.out.print("Social Science : ");
        // float ss = sc.nextInt();

        // System.out.print("Science : ");
        // float sci = sc.nextInt();

        // System.out.print("maths : ");
        // float mth = sc.nextInt();

        // System.out.print("Art : ");
        // float art = sc.nextInt();
        // float prc = (eng + ss + sci + mth + art )/5;

        // System.out.print( name +" your percentage is "+ prc + " %");


        //method 2
        float percentage = 0;
        int[] marks = new int[5];
        String[] subject = {"eng", "sci", "maths", "art", "hindi"};

        for (int i = 0; i < subject.length; i++) {

            System.out.print("Enter marks for "+ subject[i] + " : ");
            marks[i] = sc.nextInt();

            int totalMarks = 0;

            for (int mark : marks) {
                totalMarks += mark;
            }

            percentage = (totalMarks/5);
            
        }

        System.out.println(name + " your percentage is " +percentage+ "%");
       

    }
    
}
