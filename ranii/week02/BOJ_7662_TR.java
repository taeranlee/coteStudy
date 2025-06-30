package ranii.week02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class BOJ_7662_TR {
    public static void main(String[] args) throws Exception{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb= new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for(int i=0;i<T;i++){ // 테스트 
            int k= Integer.parseInt(br.readLine());
            TreeMap<Integer,Integer> map=new TreeMap<>();
            for(int j=0;j<k;j++){ //몆번 연산할건지 
                StringTokenizer st= new StringTokenizer(br.readLine());
                String s=st.nextToken();
                int num=Integer.parseInt(st.nextToken());
                if(s.equals("I")){
                    map.put(num, map.getOrDefault(num, 0)+1);
                }else if(s.equals("D")&&!map.isEmpty()){
                    int key= (num==1)? map.lastKey() : map.firstKey();
                    if(map.get(key)==1){
                        map.remove(key);
                    }else{
                        map.put(key,map.get(key)-1);
                    }
                }
            }
            
            if(map.isEmpty()){
                sb.append("EMPTY\n");
            }else{
                sb.append(map.lastKey()).append(" ").append(map.firstKey()).append("\n");
            }
        }//for
      System.out.println(sb);

    }//main
}//class
