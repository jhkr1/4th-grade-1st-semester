package ex03;

public class hw_4 {
    public static void main(String[] args) {
        int []arr = {1, 2, 3, 4, 5};

        System.out.println(sum(arr));


    }
    public static int sum(int arr[]){
        int i;
        int sum = 0;

        for(i=0;i<arr.length;i++){
            sum += arr[i];
        }
        return sum;
    }
}
