package basic.a002;

import java.util.Scanner;

/**
 * a002
 */
public class a002 {

    public static void main(String[] args) {
        int num1,num2;
        Scanner scaner = new Scanner(System.in);
        while(scaner.hasNext()){
            num1 = scaner.nextInt();
            num2 = scaner.nextInt();
            System.out.println(num1 + num2);
        }
    }
}