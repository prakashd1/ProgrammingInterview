package ip;

import java.util.*;

public class CourseSchedule {
    public static boolean canFinish(int numCourses, int[][] prerequisites) {
        if (numCourses <= 0)
            return false;

        Queue<Integer> list =new LinkedList<>();
        int []dep = new int[numCourses];
        for(int i=0;i<prerequisites.length;i++){
            dep[prerequisites[i][1]]++;
        }
        for(int i=0;i<numCourses;i++){
            if(dep[i]==0)
                list.add(i);
        }
        while(!list.isEmpty()){
            int x=list.remove();
            for (int i=0;i<prerequisites.length;i++){
                if(prerequisites[i][0]==x){
                    dep[prerequisites[i][1]]--;
                    if(dep[prerequisites[i][1]]==0)
                        list.add(prerequisites[i][1]);
                }

            }
        }
        for(int i=0;i<numCourses;i++){
            if(dep[i] ==1) return false;
        }


        return true;
    }

    public static void main(String[] args) {
        System.out.println(canFinish(2, new int[][]{{0,1} ,{1,0}}));
    }
}
