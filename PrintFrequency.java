import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class PrintFrequency {
    public static void main(String[] args) {
        String  s ="Banana";
        HashMap<Character,Integer>  map = new HashMap<>();
        for(int i= 0;i<s.length();i++){
            char c  = s.charAt(i);
            Integer  value = map.get(c);
            if(value!=null){
                map.put(c,new Integer(value+1));
            }
            else{
                map.put(c,1);
            }
        }
        Set<Entry<Character,Integer>> set = map.entrySet();
        List<Entry<Character,Integer>> list = new ArrayList<Entry<Character,Integer>>(set);
        Collection.sort(list,new Comparator<Map.Entry<Character,Integer>>(){

            //overide
            int compare(Entry<Character,Integer>o1, Entry<Character,Integer> o2){
                return o2.getvalue().compareTo(o1.getvalue());
            }
        });
        for(Entry<Character,Integer>entry:list){
            System.out.println("the frequency occurency of" entry.getKey()+" "+entry.getValue());
        }

    }
    
}
