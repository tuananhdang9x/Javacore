import build.Team;
import model.Player;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Team team = new Team();
        ArrayList<Player> allPlayer = team.getAllPlayer();

        int df = 4;
        int fw = 4;
        int mf = 2;
        ArrayList<Player> choiceTeam = team.buildTeam(df, mf, fw, allPlayer);
        team.show(choiceTeam);
    }
}