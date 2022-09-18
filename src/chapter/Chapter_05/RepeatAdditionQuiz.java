package chapter.Chapter_05;

import java.util.Scanner;

public class RepeatAdditionQuiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = (int)(Math.random()*10);
        int b = (int)(Math.random()*10);
        System.out.println("What is " + a + " + " + b + "?");
        int answer = input.nextInt();
        int count = 1;
        while((answer != a+b) && count < 3){
            System.out.println("Wrong answer. Try again. What is " + a + " + " + b + "?");
            answer= input.nextInt();
            count++;
        }
        if (answer==a+b){
            System.out.println("You got it!");
        } else {
            System.out.println("You back to kindergarten!");
        }
    }
}
