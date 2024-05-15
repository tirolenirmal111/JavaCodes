package com.calculator;
import java.util.*;
public class Calculator {
    static double num1,num2,result=0;
    int choice;


    public static void calculate() {
        while (true) {
            System.out.println("--------------------CALCULATOR--------------------");
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter num1=");
            double num1 = sc.nextDouble();
            System.out.println("Enter num2=");
            double num2 = sc.nextDouble();
            System.out.println("What operation do you want to perform :");
            System.out.println("---------------Choices---------------");
            System.out.println("1.Addition.");
            System.out.println("2.Substraction.");
            System.out.println("3.Multiplication.");
            System.out.println("4.Division.");
            System.out.println("5.Modulus.");
            System.out.println("6.Exit.");
            System.out.println("---------------------------------------");
            System.out.println("Please Enter ur choice :");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println(result = Addition.add(num1, num2));

                    break;
                case 2:
                    System.out.println(result = Substraction.subtract(num1, num2));
                    break;
                case 3:
                    System.out.println(result = Multiplication.multiply(num1, num2));
                    break;
                case 4:
                    System.out.println(result = Division.divide(num1, num2));
                    break;
                case 5:
                    System.out.println(result = Modulus.modulus(num1, num2));
                    break;
                case 6:
                    System.exit(0);


                    //if(choice==Y)
                    switch (choice) {
                        case 1:
                            System.out.println(Addition.add(result, num2));
                            break;
                        case 2:
                            System.out.println(Substraction.subtract(result, num2));
                            break;
                        case 3:
                            System.out.println(Multiplication.multiply(result, num2));
                            break;
                        case 4:
                            System.out.println(Division.divide(result, num2));
                            break;
                        case 5:
                            System.out.println(Modulus.modulus(result, num2));
                            break;
                        case 6:
                            System.exit(0);
                    }

            }

        }
    }
}
