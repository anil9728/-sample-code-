import java.util.HashMap;
import java.util.Map;


public class MajorityElement {
    //{2,3,4,5,2,3,3,3,3}
  //  {2,2} ,{3,5},{4,1},{5,1}
    public static void main(String[] args) {
        int a[]={2,3,4,5,2,3,3,3,3,3};
        System.out.println("Majority Element="+ majorityElement(a,10));
    }
    static int majorityElement(int a[],int size){
        Map<Integer,Integer> map  = new HashMap<Integer,Integer>();
        for(int i:a){
            Integer val = map.get(i);
            if(val==null){
                map.put(i,1);
            }
            else{
                map.put(i,val+1);
            }
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet());{
            if(entry.getValue()>size/2){
                return entry.getValue();
            }
        }
        return -1;
    }
    
}
