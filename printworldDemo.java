import java.util.Map;
import java.util.TreeMap;

public class printworldDemo {
    public static void main(String[] args) {
        String str = "Learn with krishna sandeep";
        PrintWordDemo p = new PrintWordDemo();
        p.getWordVowelCount(str);
        p.frequency(str);

        
    }
    private void getWordVowelCount(String str){
        int WordCount  =0 ;int vowelCount = 0; int UpperCaseCount=0;
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            switch(c){
                case '';
                case '-';
                WordCount++;
            }
            switch(c){
                case 'A';
                case 'E';
                case 'I';
                case 'O';
                case 'U';
                case 'a';
                case 'e';
                case 'i';
                case 'o';
                case 'u';
                case 'u';
            

                VowelCount++;
                
            }
            if(c>=65 && c<=90){
                UpperCaseCount++;
            }


        }

    }
    private void Frequency(String str){
        TreeMap<ChARECTER,Integer> map  = new TreeMap<>();
        for(int i =0;i<str.length();i++){
            Integer c = map.get(str.charAt(i));
            if( map.get(str.charAt(i))==null){
                map.put(str.charAt(i),1);
            }
            else{
                map.put(str.charAt(i),c++);

            }


        }
        for(Map.Entry entry:map.entrySet()){
            
        }


    }
}
