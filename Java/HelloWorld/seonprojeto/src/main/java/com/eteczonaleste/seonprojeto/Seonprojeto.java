package com.eteczonaleste.seonprojeto;

import java.util.*;
import java.lang.Math;
public class Seonprojeto {
class Program {
    private static Scanner input = new Scanner (System.in);
}


    public static void main(String[] args) {
        double Num1;
        double Num2;
        double NumFinal;
        
        System.out.println("Input the first number:");
        Num1 = input.nextDouble();
        System.out.println("Input the second one:");
        Num2 = input.nextDouble();
        NumFinal = (Num1 + Num2);
        System.out.println("O número total é: " + NumFinal);
        
    }
}
