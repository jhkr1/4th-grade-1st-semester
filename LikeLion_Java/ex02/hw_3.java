package ex02;

public class hw_3 {
    public static void main(String[] args) {
        short s1= 1; short s2= 2; short s3 = (short) (s1+s2);
        System.out.println(s3);

    }

    //short는 2바이트 메모리
    //산술 연산 시에는 int타입으로 자동형변환.
    //따라서 다시 short 타입으로 형변환을 해야함.
}
