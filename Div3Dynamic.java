//8.Write a Java Program Division of given Three numbers by using Dynamic Method [Float Values]  

import java.util.Scanner;
class Div3Dynamic{
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);
float a = scanner.nextFloat();
float b = scanner.nextFloat();
float c = scanner.nextFloat();
float d = a/b/c;
System.out.println("Division of 3 numbers :"+ d);
}
}