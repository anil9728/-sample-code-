import java.util.Scanner;
public class Sortnames {
    public static void main(String[] args) {
       int n;
       String temp;
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the number of names you want to sort");
       n= sc.nextInt();
       String names[] = new String[n];
       Scanner sc1 = new Scanner(System.in);
       System.out.println("Enter all the names of names you want to sort");
       for(int i=0;i<n;i++){
        names[i]=sc1.nextLine();
       }
       for(int i=0;i<n;i++){

            for(int j=i+1;j<n;j++){
                if(names[i].compareTo(names[j])>0){
                    temp=names[i];
                    names[i]=names[j];
                    names[j]= temp;


                }

            }

        }
        for(String name : names){
            System.out.println("Sorted array="+ name);

        }    
        
    
       

    }
    
}
