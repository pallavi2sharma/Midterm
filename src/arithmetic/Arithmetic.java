/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmetic;


import java.util.Scanner;

/** This class calls the method to perform 
 * arithmetic operations based on user input
 * execute the code check the output
 * @author PallaviSharma
 * date 10/22
 */
public class Arithmetic 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the operands");
        double operand1=sc.nextDouble();
        double operand2=sc.nextDouble();
        ArithmeticBase r= new ArithmeticBase();
        double result = r.calculate(operand1,operand2,r.o(1));
        System.out.println("result :" +result); 
    
    }





}

