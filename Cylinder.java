/****************************************************************************
 *
 * Created on : 20 Dec. 2017
 * Created for : ICS3UR
 * Daily Assignment - Unit 4-05
 * This program calculates area of cylinder
 *
 ****************************************************************************/
import java.util.Scanner;
import java.lang.Math;

public class Cylinder
{
     static double CONSTANT = 2 * Math.PI;
     
     public static double cylinderVolume(double height, double radius)
     {          
           double volume = height * CONSTANT * (java.lang.Math.pow(radius, 2));
    
           return volume;
       }
  
     public static void main(String[] args)
     { 
          try 
          {               
               double height, radius;
               Scanner input = new Scanner(System.in);  
               System.out.println("Enter height of cylinder: ");
               height = input.nextDouble();
               System.out.println("Enter radius of cylinder: ");
               radius = input.nextDouble();      
      
               double volume = cylinderVolume(height, radius);
               System.out.println("The volume of cylinder is: " + volume + " units^3");              
           } 
           catch(Exception nfe) 
           {
                System.err.println("Invalid input!");
           }            
      }
}
