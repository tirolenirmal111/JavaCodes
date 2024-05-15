package com.calculator;

public class Division {
    static double result;
        static double divide(double num1,double num2){
            if(num2==0){
                System.out.println("num2 should not be equal to zero");
            }
            result= num1/num2;
            return result;
        }
    }

