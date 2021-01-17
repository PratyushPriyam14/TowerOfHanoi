import java.util.*;
import java.io.*;
public class TowerOfHanoi {
    public static void main(String[] args)throws Exception{
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int t1=s.nextInt();
        int t2=s.nextInt();
        int t3=s.nextInt();
        toh(n,t1,t2,t3);
    }
    public static void toh(int n,int t1id,int t2id,int t3id){
        if(n==0){
            return;
        }
        toh(n-1,t1id,t3id,t2id);  //THIS line will print the instruction to move n-1 disk from t1 to t3 using t2.
        System.out.println(n+"["+t1id+"-->"+t2id+"]");
        toh(n-1,t3id,t2id,t1id);// this line will print the instruction to move n-1 disk from t3 to t2.
    }
}
