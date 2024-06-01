public class StringRecursion {
    public  static void main(String[] args){
        String s ="anil";
       System.out.println( recursiveString(s));
    }
    private static String recursiveString(String s){
        if(s==null || s.length()<=1){
            return s;
        }
        return recursiveString(s.substring(1))+s.charAt(0); //sandy = andy+s={s=0index} and andy = 1 index = substring
    }
    
}
