package ranii.week03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class BOJ_1966_TR {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(br.readLine());
        StringBuilder sb=new StringBuilder();

        for(int i=0;i<T;i++){//test 몇번하는지 
            StringTokenizer st=new StringTokenizer(br.readLine());
            TreeMap<Integer,Integer> map=new TreeMap<>();
            Queue<int[]> q = new LinkedList<>();
            int N=Integer.parseInt(st.nextToken()); //문서 갯수 
            int M=Integer.parseInt(st.nextToken()); //문서의 위치 

            st=new StringTokenizer(br.readLine()); //읽는 줄이 다르기 때문에 한번 더 생성해줌 
            for(int j=0;j<N;j++){
                int p= Integer.parseInt(st.nextToken());
                q.offer(new int[]{j,p});
                
                map.put(p,map.getOrDefault(p, 0)+1);
            }
            
            int count =0;//몇번째로 빠져나오는지 확인 
            while(!q.isEmpty()){
                int[] front=q.poll();//첫번째 문서 확인
                int idx=front[0];
                int pri=front[1];

                int curMax=map.lastKey(); //가장 높은 우선순위 

                if(pri<curMax){ //현재 우선순위가 가장 높은 우선순위보다 작을때 
                    q.add(front); //다시 넣어 
                }else{//우선순위=max일때 
                    count ++; //빠져나오는거 세 
                    if(map.get(pri)==1){//만약에 그 우선순위가 중복되지 않을때는 
                        map.remove(pri); //그냥 바로 빼내고 
                    }else{ //만약 우선순위가 중복되면 
                        map.put(pri,map.get(pri)-1);
                    }

                    if(idx==M){
                        sb.append(count).append("\n");
                        break;
                    }
                }
            }
        }

        System.out.println(sb);
    }//main
}//class
