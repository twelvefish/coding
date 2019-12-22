package basic.a003;

import java.util.Scanner;

/**
 * a003
 */
public class a003 {

    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        int month, day, sum;
        while (scaner.hasNext()) {
            month = scaner.nextInt();
            day = scaner.nextInt();
            sum = (month * 2 + day) % 3;
            switch (sum) {
            case 0:
                System.out.println("普通");
                break;
            case 1:
                System.out.println("吉");
                break;
            case 2:
                System.out.println("大吉");
                break;

            default:
                break;
            }
        }
    }
}