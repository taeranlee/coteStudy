package ranii.week03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BOJ_22864_TR {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb=new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int A = Integer.parseInt(st.nextToken());//피로도   
        int B = Integer.parseInt(st.nextToken());//일처리
        int C = Integer.parseInt(st.nextToken());//-피로
        int M = Integer.parseInt(st.nextToken());//max 피로 

        int work=0;
        int stress=0;
        for(int i=1;i<=24;i++){//24번 반복하기 
            //1시간씩 증가할때마다 stress와 work 증가 
            if(stress + A<=M){ //스트레스가 max 피로보다 작거나 같으면 
                stress += A; //스트레스 올리고
                work += B; //일도 올려 
                System.out.println(stress+" "+work);
            }else{ //만약 스트레스가 max 피로보다 크면 
                stress -=C; //스트레스 줄여 
                if(stress<0) stress=0; //만약 스트레스가 음수면 0
                System.out.println(stress+" "+work);
            }
            
        }
        sb.append(work);
        bw.write(sb.toString());
        br.close();
        bw.close();

    }//main
}//class
