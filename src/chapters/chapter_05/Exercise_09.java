package chapters.chapter_05;

import java.util.Scanner;

public class Exercise_09 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of students: ");
        int s = input.nextInt();
        int max = 1;
        int second = 0;
        String maxStudent = "";
        String secStudent = "";
        for (int a = 0; a < s ; a++) {
            System.out.println("Enter name and score of student (" + (a + 1) + "):");
            String name = input.next();
            int b = input.nextInt();
            if(max < b) {
                second = max;
                secStudent = maxStudent;
                max = b;
                maxStudent = name;
            } else if (second < b) {
                second = b;
                secStudent = name;
            }
        }
        System.out.println("The student with the highest score is " + maxStudent);
        System.out.println("The highest score is " + max);
        System.out.println("The student with the second highest score is " + secStudent);
        System.out.println("The second highest score is  " + second);

    }

}


