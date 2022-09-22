package chapters.chapter_05;

import java.util.Scanner;

public class Exercise_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of students: ");
        int a = input.nextInt();
        int max = 1;
        String maxStudent = "";
        for (int i = 0; i < a; i++){
            System.out.println("Enter students name and scores: ");
            String name = input.next();
            int score = input.nextInt();
            if(max < score){
                max = score;
                maxStudent = name;
            }

        }
        System.out.println("The student with the highest score is " + maxStudent);
        System.out.println("The highest score is " + max);
    }
}
