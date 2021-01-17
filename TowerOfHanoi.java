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
        toh(n-1,t1id,t3id,t2id);
        System.out.println(n+"["+t1id+"-->"+t2id+"]");
        toh(n-1,t3id,t2id,t1id);
    }
}
