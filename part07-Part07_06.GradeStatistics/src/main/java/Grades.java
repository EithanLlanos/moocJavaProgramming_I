
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Eithan
 */
public class Grades {
    private final ArrayList<Integer> list;
    public Grades(){
        list = new ArrayList<>();
    }
    
    public void add(int grade){
        if(grade<0 || grade>100) return;
        list.add(grade);
    }
    public String toString(){
        String txt="";
        
        float avg = 0;
        float avgPass = 0;
        float prcnt = 0;
        int[] stats = {0,0,0,0,0,0};
       for (Integer integer : list) {
           if (integer<50) stats[0]++;
           else{
               avgPass+=integer;
               prcnt++;
               if(integer<60) stats[1]++;
               else if(integer<70) stats[2]++;
               else if(integer<80) stats[3]++;
               else if(integer<90) stats[4]++;
               else if(integer<=100) stats[5]++;
           }
            avg+=integer;
        }
       avg/=list.size();
       avgPass/=prcnt;
       prcnt = (prcnt/list.size())*100;
        txt+="Point average (all): "+avg+"\n";
        txt+="Point average (passing): "+avgPass+"\n";
        txt+="Pass percentage: "+prcnt+"\n";
        txt+="Grade distribution:";
        for (int i = stats.length-1; i >= 0 ; i--) {
            txt+="\n"+i+": ";
            for (int y = 0; y <stats[i]; y++) {
                txt+="*";
            }
        } 
        return txt;
    }

}
