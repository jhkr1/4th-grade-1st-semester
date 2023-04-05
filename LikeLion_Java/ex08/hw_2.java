package ex08;

import java.util.Scanner;

public class hw_2 {
    public static void main(String[] args) {
        String str;

        Scanner sc = new Scanner(System.in);
        System.out.print("문자열을 입력하세요>>> ");
        str = sc.next();
        Small(str);
    }
    public static void Small(String str){
        System.out.println(str.toLowerCase());
    }
}

