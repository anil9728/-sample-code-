import java.util.Arrays;

public class SumElements {
    public static void main(String[] args) {
        int arr[]= {34,45,56,677,78,89,90};
        // int sum=Arrays.stream(arr).sum();
        // System.out.println(sum);
        // int sum1 = IntStream.of(arr).sum();
        // System.out.println(sum1);
        int sum2 = Arrays.stream(arr).reduce((x,y)->x+y).getAsInt();
        System.out.println(sum2);

    }
    
}
