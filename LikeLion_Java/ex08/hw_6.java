package ex08;

public class hw_6 {
    public static void main(String[] args) {
        String str = "치킨 피자 보쌈";
        String[] food = str.split(" ");
        for (String a : food) {
            System.out.println(a);
        }
    }
}

