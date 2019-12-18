import java.util.Scanner;

/**
 * a004
 */
public class a004 {

    public static void main(String[] args) {
        int year = 0;
        Scanner scaner = new Scanner(System.in);
        while(scaner.hasNextInt()){
            year = scaner.nextInt();
            if(year % 400 == 0 || year % 4 == 0 && year % 100 != 0){
                System.out.println("閏年");
            }else{
                System.out.println("平年");
            }
        }
    }
}