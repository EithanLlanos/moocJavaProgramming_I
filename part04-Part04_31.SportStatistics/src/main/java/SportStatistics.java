
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<team> teams = new ArrayList<>();
        ArrayList<String> teamsStr = new ArrayList<>();
        System.out.println("File:");
        try(Scanner scanFil = new Scanner(Paths.get(scan.nextLine()))){
            while(scanFil.hasNextLine()){
                String[] list = scanFil.nextLine().split(",");
                if(!teamsStr.contains(list[0])){
                    teams.add(new team(list[0]));
                    teamsStr.add(list[0]);
                }
                if(!teamsStr.contains(list[1])){
                    teams.add(new team(list[1]));
                    teamsStr.add(list[1]);
                }
                boolean winner1=true;
                if(Integer.valueOf(list[2]) < Integer.valueOf(list[3])){
                    winner1=!winner1;
                }
                for(team e: teams){
                    if(e.getName().equals(list[0])){
                        if(winner1)e.setWins(e.getWins()+1);
                        else e.setLosses(e.getLosses()+1);
                    }
                    if(e.getName().equals(list[1])){
                        if(winner1)e.setLosses(e.getLosses()+1);
                        else e.setWins(e.getWins()+1);
                    }
                    
                }
            }
            
        } catch(Exception e){
            System.out.println("Error: "+e);
        }
        System.out.println("Team: ");
        String selectedT = scan.nextLine();
        
        boolean sw = false;
        for(team e: teams){
            if(e.getName().equals(selectedT)){
                sw = !sw;
                System.out.println("Games: " + (e.getWins()+e.getLosses()));
                System.out.println("Wins: " + e.getWins());
                System.out.println("Losses: " + e.getLosses());
            }        
        }
        if(!sw) {
            System.out.println("Games: 0");
            System.out.println("Wins: 0");
            System.out.println("Losses: 0");
        }
    }

}
