public class EvenWordDemo {
    public static void main(String[] args) {
        String str= "hello anil rushi suresh ketan rituja";
        for(String s : str.split(" ")){
        if(s.length()%2==0){
                System.out.println(s);
            }
        }
    }

    
}
