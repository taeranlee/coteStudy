package ranii.week03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ_10799_TR {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input=br.readLine();
        int open=0;
        int result=0;
        for(int i=0;i<input.length();i++){
            char c=input.charAt(i);
            if(c =='('){
                open++;
            }else{
                open--;
                if(input.charAt(i-1)=='('){
                    result+=open;
                }else{
                    result++;
                }
            }
        }
        System.out.println(result);
    }
}
