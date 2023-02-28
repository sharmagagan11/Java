import java.util.*;
import java.util.Scanner;

public class Basic_Calculator {
    static Scanner scn = new Scanner(System.in);

    public static void main(String args[]){
            char ch;
            do 
            {
                ch=scn.next().charAt(0);
                if(ch =='+' ||ch == '-' || ch == '*' || ch == '/'|| ch == '%'){
                   operation(ch);
                 }
                else{
                if(ch != 'x'&& ch != 'X')
                    System.out.println("Please Insert the Valid Charactar ");
                
                }
                while(ch != 'x' && ch !='X');
            }
            public static void operation(char ch) {
                int a = scn.nextInt();
                int b = scn.nextInt();
                int res = 0;
                switch (ch) {
                    case '+': {
                        res = a + b;
                        break;
                    }
        
                    case '-': {
                        res = a - b;
                        break;
                    }
        
                    case '*': {
                        res = a * b;
                        break;
                    }
        
                    case '/': {
                        res = a / b;
                        break;
                    }
        
                    case '%': {
                        res = a % b;
                        break;
                    }
        
                }
                System.out.println(res);
            

   

        }
    }
}