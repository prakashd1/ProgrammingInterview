package ip.advent2022;

import java.io.File;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Day1 {


    public static void main(String[] args) throws Exception{

        int max=-1, curr=0;
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        File file = new File("resources/day1.txt");
        Scanner sc = new Scanner(file);
        while (sc.hasNextLine()){
            String line = sc.nextLine();
            if(line.trim().isEmpty()){
                pq.offer(curr);
                if(pq.size()>3){
                    pq.poll();
                }
                curr=0;
            }else{
                curr+=Integer.parseInt(line);
            }
        }
        pq.offer(curr);
        if(pq.size()>3){
            pq.poll();
        }
        int sum = pq.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum);


    }
}
