package ex08;

import java.util.Scanner;

public class hw_3 {
    public static void main(String[] args) {
        int i;
        String str;
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열을 입력하세요>>> ");
        str = sc.next();

        System.out.println(transformString(str));
    }
//    public  static  void Ascii(){
//
//    }
  public static String transformString(String input) {
       StringBuilder result = new StringBuilder();
       for (char c : input.toCharArray()) {
           if (c >= 'a' && c < 'z') {
               result.append((char)(c + 1));
           } else if (c == 'z') {
               result.append('a');
           } else if (c >= 'A' && c < 'Z') {
               result.append((char)(c + 1));
          } else if (c == 'Z') {
              result.append('A');
           } else {
               result.append(c);
           }
       }
        return result.toString();
    }
}
