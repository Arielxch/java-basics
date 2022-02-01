import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class Registration {
    public static void main(String[] args) {
        String name = args[0];
        int age = Integer.parseInt(args[1]);
        int firstExam = Integer.parseInt(args[2]);
        int secondExam = Integer.parseInt(args[3]);



        // user's age between 18 and 60 are eligible for registration
        // users older than 60 or younger than 18 are not eligible for registration

        if (age >= 18 && age <= 60) {
            System.out.println("Hi " + name + " , you are eligible to register.");
        }

        if (age < 18 || age > 60){
            System.out.println("Sorry, you are not eligible for the registration.");
            int diff;
            if(age < 18){
                diff = 18 - age;
                System.out.println("The minimum accepted age is 18, you have " + diff + " years less than the minimum accepted age.");
            } else {
                diff = age - 60;
                System.out.println("The maximum accepted age is 60, you have " + diff + " years more than the maximum accepted age.");
            }
            System.exit(0);
        }

        // compare user's two entrance exam grade

        if (firstExam > secondExam){
            System.out.println("Your highest score is " + firstExam);
        } else if (secondExam > firstExam){
            System.out.println("Your highest score is " + secondExam);
        } else {
            System.out.println("You received " + firstExam + " in both of your entrance exams");
        }

        // number of courses registered
       Scanner courseNumber = new Scanner(System.in);
        System.out.println("How many courses did you registered the first semester?");
        int firstSemesterCourse = courseNumber.nextInt();
        System.out.println("How many courses did you registered the second semester?");
        int secondSemesterCourse = courseNumber.nextInt();
        int totalCourse = firstSemesterCourse + secondSemesterCourse;
        System.out.println("You have registered " + totalCourse + " course last academic year.");
        int credits = totalCourse * 4;
        System.out.println("You have achieved " + credits + " credits already!");

        // tuition fees

        Scanner tuitionFees = new Scanner (System.in);
        System.out.println("How many science courses do you plan to take this semester?");
        int scienceCourse = tuitionFees.nextInt();
        System.out.println("How many art course do you plan to take this semester?");
        int artCourse = tuitionFees.nextInt();
        int scienceTuition = scienceCourse * 125;
        int arrTuition = artCourse * 156;
        int totalTuition = scienceTuition + arrTuition;
        System.out.println("Your will pay $" + totalTuition + " this semester." );






    }
}
