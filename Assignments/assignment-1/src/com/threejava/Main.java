package com.threejava;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String firstMessage = "Please enter the numerator and non zero denominator for the first fraction";
        System.out.println(firstMessage);
        Scanner theFirstQuestion = new Scanner(System.in);
        System.out.println("What is the numerator of the first fraction?");
        int numerator1 = theFirstQuestion.nextInt();
        System.out.println("What is the denominator of the first fraction？");
        int denominator1 = theFirstQuestion.nextInt();
        while (denominator1 == 0) {
            System.out.println("Denominator for the first fraction should be non zero integer, please try again");
            denominator1 = theFirstQuestion.nextInt();
        }
        String secondMessage = "Please enter the numerator and non zero denominator for the second fraction";
        System.out.println(secondMessage);
        System.out.println("What is the numerator of the second fraction?");
        int numerator2 = theFirstQuestion.nextInt();
        System.out.println("What is the denominator of the second fraction？");
        int denominator2 = theFirstQuestion.nextInt();
        while (denominator2 == 0) {
            System.out.println("Denominator for the second fraction should be non zero integer, please try again");
            denominator2 = theFirstQuestion.nextInt();
        }

        //double fractionSum = ((double) numerator1) / denominator1 + ((double) numerator2) / denominator2: calculate fraction sum
        //double productSum = ((double) numerator1) / denominator1 * ((double) numerator2) / denominator2: calculate fraction product
        double fractionSum = ((double)numerator1 / denominator1) + ((double)numerator2 / denominator2);
        System.out.println("The sum of "+ numerator1 + "/" + denominator1 + " and " + numerator2  + "/" +  denominator2 + " + is " + fractionSum);
        double fractionProduct = ((double)numerator1 / denominator1) * ((double)numerator2 / denominator2);
        System.out.println("The product of "+ numerator1 + "/" + denominator1 + " and " + numerator2  + "/" +  denominator2 + " + is " + fractionProduct);
        System.out.println("Exit the program");
    }
}
