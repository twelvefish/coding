package basic;

import java.util.Scanner;
public class a001{

     public static void main(String []args){
        
        String text;
        Scanner scaner = new Scanner(System.in);
        while(scaner.hasNext()){
            text = scaner.nextLine();
            System.out.println("hello, "+ text);
            text = "";
        }
     }
}