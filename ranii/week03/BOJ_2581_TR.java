package ranii.week03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BOJ_2581_TR {
    public static boolean prime[];
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        StringBuilder sb=new StringBuilder();

        //소수인거 찾기 
        prime = new boolean[M+1];
        getPrime();

        int sum=0;
        int min=Integer.MAX_VALUE;
        for(int i=N;i<=M;i++){
            if(prime[i]==false){//소수일때 
                sum += i;
                if(min == Integer.MAX_VALUE){
                    min=i;
                }
            }
        }
        if(sum==0){
            sb.append("-1");
        }else{
            sb.append(sum).append("\n");
            sb.append(min);
        }
        
       bw.write(sb.toString());
       br.close();
       bw.close();
    }

    public static void getPrime(){
        prime[0]=true;
        prime[1]=true;
        for(int i=2;i<=Math.sqrt(prime.length);i++){
            if(prime[i]==true)  continue;
            for(int j=i*i;j<prime.length;j=j+i){
                prime[j]=true;
            }
        }
    }
}
