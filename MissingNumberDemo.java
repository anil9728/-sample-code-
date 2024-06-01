import java.util.HashSet;

public class MissingNumberDemo {

//{2,4,1,5,7,8,0}
//3 and 6
    public static void main(String[] args) {
        Integer a[]={2,4,1,5,7,8,0};
        missingNumber(a);
    }
    public static void missingNumber(Integer a[]){
        HashSet<Integer> set = new HashSet<Integer>();
        for(int num : a){
            set.add(num);
        }
        int n = a.length+1;
        for(int i=0;i<n;i++){
            if(!set.contains(i)){
                System.out.println(i);
            }
        }


    }
    
}
