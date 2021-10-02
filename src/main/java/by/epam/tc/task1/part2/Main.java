package by.epam.tc.task1.part2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double a, b, h;

        a = EnterDouble("Enter the left border of the numeric segment: ");

        do{
            b = EnterDouble("Enter the right border of the numeric segment: ");
        } while (!IsRightBorderValid(a, b));

        do{
            h = EnterDouble("Enter the step of the numeric segment: ");
        } while (!IsStepValid(h));

        System.out.println("F(x) = " + Calculate(a,b,h));
    }

    public static double Calculate(double leftBorder, double rightBorder, double step){
        if (leftBorder>rightBorder || step<=0){
            return -1;
        }
        double res = 0;
        for(double x = leftBorder; x<=rightBorder; x+=step)
        {
            res+= Math.sin(x)*Math.sin(x) - Math.cos(2*x);
        }
        return res;
    }

    public static double EnterDouble(String msg){
        Scanner scanner = new Scanner(System.in);
        System.out.print(msg);
        while (!scanner.hasNextDouble())
        {
            scanner.nextLine();
            System.out.print("It's not a number! Try again: ");
        }
        return scanner.nextDouble();
    }

    public static boolean IsRightBorderValid(double leftBorder, double rightBorder){
        if(leftBorder < rightBorder){
            return true;
        }
        else{
            System.out.print("Right border cannot be less than the left one! Try again: ");
            return false;
        }
    }

    public static boolean IsStepValid(double step){
        if(step>0){
            return true;
        }
        else {
            System.out.print("The step cannot be <= 0! Try again: ");
            return false;
        }
    }
}
