import java.util.Arrays;

public abstract class AnagramDemo {
    public static void main(String[] args) {
         String str1 = "Anil";
         String str2 = "avaj";
         System.out.println("both string are anagrmas"+anagramCheck(str1,str2));
    }
    public static boolean anagramCheck(String str1,String str2){
        char[] charArrayFromString1 = str1.toCharArray();
        char[] charArrayFromString2 = str2.toCharArray();
        Arrays.sort(charArrayFromString1);
        Arrays.sort(charArrayFromString2);
        return Arrays.equals(charArrayFromString1,charArrayFromString2);


    }
    
}
