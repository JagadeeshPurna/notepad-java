//3.Write a Java Program Multification of given Two numbers by using Dynamic Method [Float Values] 

import java.util.Scanner;
class Mul2Dynamic{
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);
float a = scanner.nextFloat();
float b = scanner.nextFloat();

float c = a*b;
System.out.println("Multiplication of 2 numbers :"+ (a*b));
}
}