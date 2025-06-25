package ranii.week02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_14425_TR {
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());

        int N=Integer.parseInt(st.nextToken());
        int M=Integer.parseInt(st.nextToken());

        int count =0;
        String[] strings=new String[N];
        for(int i=0;i<N;i++){
            strings[i]=br.readLine();
        }
        //M번 반복하면서 strings 배열에 있는 문자열들과 같은지 확인
        //같으면 count +1하기 

        for(int i=0;i<M;i++){
            String sr=br.readLine();
            for(String string:strings){
                if(string.equals(sr)){
                    count++;
                }
            }
        }

        System.out.println(count);

    }
}
