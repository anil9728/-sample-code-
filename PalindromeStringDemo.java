import java.util.Scanner;
public class PalindromeStringDemo {
    public static void main(String[] args) {
        System.out.println("enter the input string");
        String reverse ="";
        Scanner sc = new Scanner(System.in);
        String original = sc.nextLine();
       
        for(int i =original.length()-1;i>=0;i--){
            reverse = reverse+original.charAt(i);
        }
        if(original.equals(reverse)){
            System.out.println("given string is palindrome");
        }
        else{
            System.out.println("given string is not palindrome");
        }


        
    }
    
}
