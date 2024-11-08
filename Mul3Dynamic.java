//7.Write a Java Program Multification of given Three numbers by using Dynamic Method [Float Values] 
 

import java.util.Scanner;
class Mul3Dynamic{
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);
float a = scanner.nextFloat();
float b = scanner.nextFloat();
float c = scanner.nextFloat();
float d = a*b*c;
System.out.println("Multiplication of 3 numbers :"+ d);
}
}