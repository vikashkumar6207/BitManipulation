package Bitmanupulation;

import java.util.Scanner;

public class Left_and_Right_Sift {

    //Get Bit
   /* public static void main(String[] args) {
        int n = 5;
        int pos = 2;
        int bitMask = 1<<pos;
        if((bitMask & n) == 0){
            System.out.println("Bit is zero");
        }else{
            System.out.println("bit is non zero");
        }
    }
    */
    //Set bit;
   /*  public static void main(String[] args) {
        int n = 5;
        int pos = 1;
        int BitMask = 1 << pos;
         int newNumber = BitMask | n;
            System.out.println(newNumber);
        
    }*/

    // Clear Bit
   /*  public static void main(String[] args) {
        int n = 5;//0101
        int pos = 2;//10
        int BitMask = 1 << pos;//0001 => 0100
        int notBitMask = ~(BitMask); // 1011
        int newNumber = notBitMask & n; //1011 & 0101
        System.out.println(newNumber);// result 0001
    }
    */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int oper = sc.nextInt();
        //oper = 1: set oper = 0 : clear
        int n = 5; // 0101
        int pos = 1;
        
        int bitMask = 1<< pos;
        if(oper == 1){
            int newNumber = bitMask | n;
            System.out.println(newNumber);
        }else{
            int newBitMask = ~(bitMask);
            int newNumber = newBitMask & n;
            System.out.println(newNumber);
        }
    }
}
