/*
 * Fiona Xie
 * 5/30/2020
 * Program that rolls 2 dice a predetermined amount by user then outputs the amount of times a certain roll was rolled as well as the percentage out of the times rolled
 */
package a3_dice;

import java.util.Scanner;

public class A3_Dice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int roll[] = new int [13]; //array for the number of times each roll is rolled
        double percent[]=new double [13]; // array for storing the percentage of each roll
        int d1=0,d2=0,sum=0,input=0,total=0; 
        int max=6;
        int min=1;
        
        Scanner x = new Scanner(System.in);
        System.out.print("Amount of times to roll the dice: ");
        input=x.nextInt(); // stores how many times to roll the dice
        
        //for loop to roll X number of times by the user
        for (int i=0; i<input;i++){
            d1 = (int) ((Math.random()*((max-min)+1))+min); //random generator number for dice 1
            d2 = (int) ((Math.random()*((max-min)+1))+min); //random generate number for dice 2
            
            sum = d1+d2; // adds up dice
            roll[sum]++; // stores sum in array for number of times rolled
        }
        
        System.out.println("Roll              Amount           Percentage");
        
        // for loop that calculates the percentage while printing out number, roll amount and %
        for (int i=2;i<13;i++){
            percent[i]= ((roll[i]/(double)input)*100);
            System.out.format(" %2d %19d %19.1f",i,roll[i],percent[i]);
            System.out.print("% \n"); //adds % and starts new line
        }
        
        
        
    }
    
}
