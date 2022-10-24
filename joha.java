import java.util.*;

public class joha {
    public static void main(String[] args) {
        try (Scanner scnr = new Scanner(System.in)) {

            final double maxgrade = 100;
            String inputError = "Input Should Not Be Greater Than 100";

            System.out.println("Please enter your full name. Thank You");
            String name = scnr.nextLine();
            System.out.println("Welcome to your grade portal, " + name);
            System.out.println("Please wait a moment your grades will be available shortly");
            System.out.println(" ");

            System.out.println(" ");
            System.out.print("Please enter English Class Work grade : ");
            double hweng = scnr.nextDouble();
            while (hweng > maxgrade) {
                System.out.println(inputError);
                System.out.println("Please re-enter grade");
                double x = scnr.nextDouble();
                hweng = x;
            }

            System.out.print("Please enter English Class Participation grade : ");
            double classparteng = scnr.nextDouble();
            while (classparteng > maxgrade) {
                System.out.println(inputError);
                System.out.println("Please re-enter grade");
                double x = scnr.nextDouble();
                classparteng = x;
            }
            System.out.println("English : Class Work grade = " + hweng + ", Class Participation = " + classparteng);
            System.out.println(" ");

            System.out.println(" ");
            System.out.print("Please enter Math Class Work grade : ");
            double hwmath = scnr.nextDouble();
            while (hwmath > maxgrade) {
                System.out.println(inputError);
                System.out.println("Please re-enter grade");
                double x = scnr.nextDouble();
                hwmath = x;
            }
            System.out.print("Please enter Math Class Participation grade : ");
            double classpartmath = scnr.nextDouble();
            while (classpartmath > maxgrade) {
                System.out.println(inputError);
                System.out.println("Please re-enter grade");
                double x = scnr.nextDouble();
                classpartmath = x;
            }
            System.out.println("Math : Class Work grade = " + hwmath + ", Class Participation = " + classpartmath);
            System.out.println(" ");

            System.out.println(" ");
            System.out.print("Please enter Science Class Work grade : ");
            double hwsci = scnr.nextDouble();
            while (hwsci > maxgrade) {
                System.out.println(inputError);
                System.out.println("Please re-enter grade");
                double x = scnr.nextDouble();
                hwsci = x;
            }
            System.out.print("Please enter Science Class Participation grade : ");
            double classpartsci = scnr.nextDouble();
            while (classpartsci > maxgrade) {
                System.out.println(inputError);
                System.out.println("Please re-enter grade");
                double x = scnr.nextDouble();
                classpartsci = x;
            }
            System.out.println("Science : Class Work grade = " + hwsci + ", Class Participation = " + classpartsci);
            System.out.println(" ");

            double engGrade = (((hweng / maxgrade) * 100) + ((classparteng / maxgrade) * 100)) / 2;
            double mathGrade = (((hwmath / maxgrade) * 100) + ((classpartmath / maxgrade) * 100)) / 2;
            double scienceGrade = (((hwsci / maxgrade) * 100) + ((classpartsci / maxgrade) * 100)) / 2;

            System.out.println("English Grade = " + engGrade);
            System.out.println(" ");
            System.out.println("Math Grade = " + mathGrade);
            System.out.println(" ");
            System.out.println("Science Grade = " + scienceGrade);
            System.out.println(" ");

            double grade = (mathGrade + engGrade + scienceGrade) / 3;

            char a = 'A';
            char b = 'B';
            char c = 'C';
            char d = 'D';

            if (grade >= 90) {
                System.out.print("Spectacular Job " + name + ", you earned a ");
                System.out.printf("%.2f", grade);
                System.out.println(". Your grade is an " + a);
            } else if (grade >= 80) {
                System.out.print("Great Job " + name + ", you earned a ");
                System.out.printf("%.2f", grade);
                System.out.println(". Your grade is a " + b);
            } else if (grade >= 70) {
                System.out.print("Good Job " + name + ", you earned a ");
                System.out.printf("%.2f", grade);
                System.out.println(". Your grade is a " + c);
            } else if (grade >= 60) {
                System.out.println("Yo ass failed with a ");
                System.out.printf("%.2f", grade);
                System.out.println(" boi." + " You got a " + d + " lil nigga");
            } else {
                System.out.println("You belong in McDonalds stoopid ");
            }

        }
    }
}