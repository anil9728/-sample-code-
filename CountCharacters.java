public class CountCharacters {
    static void count(String str){
        // create an char array of given string
        char[] ch = str.toCharArray();
        for(int i=0;i<ch.length;i++){
             // declare an string with empty initialization
             String s = "";
             // when the charecter is not space
             while(i<ch.length && ch[i]!=' '){
                //concat with the declare String
                s = s+ch[i];
                i++;

             }
             if(s.length()>0){
                System.out.println( s + "->" +s.length());

             }

        }
       
    }
    public static void main(String[] args) {
        String str = "Hello World";
        count(str);

        
        
    }
    
}
