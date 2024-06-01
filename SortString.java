import java.util.Arrays;

public class SortString {
    public static void main(String[] args) {
        String str ="rituja";
        char ch[] = str.toCharArray();
        Arrays.sort(ch);
        String s = new String(ch);
        System.out.println(s);
        
    }
    
}
