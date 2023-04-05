package ex06;

public class hw_4 {
    public static void main(String[] args) {
        int i = 0;
        while (true){
            i++;
            if(i % 3 == 0 && i % 4 ==0)
                System.out.println(i);
            if(i == 100){
                break;
            }
        }
    }
}
