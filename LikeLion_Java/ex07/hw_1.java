package ex07;

public class hw_1 {
    public static void main(String[] args) {
        Integer a = 0;
        System.out.println(postIncrease(a));
        a = 0;
        System.out.println(a++);
        a = 0;
        System.out.println(++a);
        a = 0;
        System.out.println(preIncrease(a));
    }
    public static int preIncrease(Integer num){
        num += 1;
        return num;
    }
    public static int postIncrease(Integer num){
        int temp = num;
        num += 1;
        return temp;

    }
}
