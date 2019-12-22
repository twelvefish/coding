package basic.a001;
import java.util.Scanner;                           // 使用者輸入套件
public class a001{
     public static void main(String []args){
        String input;
        Scanner scaner = new Scanner(System.in);    // new Scanner 的 實例 instance
        while(scaner.hasNext()){                    // 判斷後續還有無輸入值
            input = scaner.nextLine();           	// 讀取整行內容
            System.out.println(method(input));    	// 印出字串
            input = "";                             // 清空字串，清空上一回測資
        }
     }
     
     public static String method(String text) {
		return "hello, "+ text;	 
     }
}