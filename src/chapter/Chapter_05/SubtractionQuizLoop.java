package chapter.Chapter_05;

import java.util.Scanner;

public class SubtractionQuizLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int correctCount = 0;
        int count = 0;
        String output = "";

        while(count<5){
            int a = (int)((Math.random()*10));
            int b = (int)((Math.random()*10));
            if(a<b){
                int temp=b;
                b = a;
                a=temp;
            }
            System.out.println("What is " + a + " - " + b + "?");
            int answer = input.nextInt();
            if(answer == a-b){
                System.out.println("You are correct!");
                correctCount++;
            }else {
                System.out.println(a + " - " + b  + " should be " + (a-b));
            }
            count++;
            output += "\n" + a + "-" + b + "=" + answer + ((a-b==answer) ? " correct" : " wrong");
        }
        System.out.println("Correct count is " + correctCount);
        System.out.println(output);

    }
}
