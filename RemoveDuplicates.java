import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String str ="weeweewqwewret";
       System.out.println(removeDublicates(str));
    }
    public static String removeDublicates(String str){
        Set<Character> set = new HashSet<>();
        StringBuffer sb = new StringBuffer(); 
       
        for(int i=0;i<str.length();i++){
            Character c =str.charAt(i); // str.charAt(0) -> s
            if(!set.contains(c)){       // if 's' is not present in hashset
                set.add(c);             // add s  to  the set
                sb.append(c);           // s
            }

        }
        return sb.toString();

    }
}
