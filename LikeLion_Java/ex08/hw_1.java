package ex08;

import java.util.Scanner;

public class hw_1 {
    public static void main(String[] args) {
        String str;

        Scanner sc = new Scanner(System.in);
        System.out.print("문자열을 입력하세요>>> ");
        str = sc.next();
        Large(str);
    }

    public static void Large(String str){
        System.out.println(str.toUpperCase());
    }
}
