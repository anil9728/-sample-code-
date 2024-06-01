import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
public class Stringsplit {
    public static void main(String[] args) {
        String s ="anil-pawar";
        String str[] = s.split( "-");
        printString(str,"String Split method");
        List<String> strings=Pattern.compile("-").splitAsStream(s).collect(Collectors.toList());
        for(String string:strings){
            System.out.println("splitting string by using Pattern Class");
            System.out.println(string);

        }

    }
    public static void printString(String str[],String approach){
        System.out.println("splitting string by using "+approach);
        for(String string:str){
            System.out.println(string);

            
        }
    }
    
    
}
