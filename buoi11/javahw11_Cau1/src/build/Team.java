package build;

import java.util.ArrayList;
import model.Player;
import model.Position;
import java.util.Random;

public class Team {

    public ArrayList<Player> getAllPlayer() {
        ArrayList<Player> players = new ArrayList<>();
        players.add(new Player(1, "Bui Tien Dung", Position.GK));
        players.add(new Player(12, "Nguyen Cong Phuong", Position.FW));
        players.add(new Player(15, "Nguyen Quang Hai", Position.MF));
        players.add(new Player(11, "Nguyen Van Toan", Position.FW));
        players.add(new Player(8, "Que Ngoc Hai", Position.DF));
        players.add(new Player(14, "Ha Duc Trinh", Position.FW));
        players.add(new Player(7, "Nguyen Tien Linh", Position.FW));
        players.add(new Player(10, "Pham Minh Hoang", Position.MF));
        players.add(new Player(9, "Doan Van Hau", Position.DF));
        players.add(new Player(23, "Nguyen Tuan Anh", Position.MF));
        players.add(new Player(21, "Luong Xuan Truong", Position.MF));
        players.add(new Player(14, "Ha Duc Trinh A", Position.FW));
        players.add(new Player(7, "Nguyen Tien Linh A", Position.FW));
        players.add(new Player(10, "Pham Minh Hoang A", Position.MF));
        players.add(new Player(9, "Doan Van Hau A", Position.DF));
        players.add(new Player(23, "Nguyen Tuan Anh A", Position.DF));
        players.add(new Player(21, "Luong Xuan Truong A", Position.MF));
        return players;
    }

    public void show(ArrayList<Player> players) {
        for (Player p : players) {
            System.out.println(p);
        }
    }

    public ArrayList<Player> buildTeam(int df, int mf, int fw, ArrayList<Player> allPlayer) {
        ArrayList<Player> choiceTeam = new ArrayList<>();
        int teamNumber = allPlayer.size();

        // Chọn thủ môn
        Random random = new Random();
        int gkNumber = 0;
        int dfNumber = 0;
        int mfNumber = 0;
        int fwNumber = 0;

        while (gkNumber < 1) {
            int gkRandom = random.nextInt(teamNumber);
            if (allPlayer.get(gkRandom).getPosition() == Position.GK) {
                Player choicePlayer = allPlayer.get(gkRandom);
                choiceTeam.add(choicePlayer);
                gkNumber++;
            }
        }

        // Chọn hậu vệ
        while (dfNumber < df) {
            int dfRandom = random.nextInt(teamNumber);
            if (allPlayer.get(dfRandom).getPosition() == Position.DF) {
                if (!choiceTeam.contains(allPlayer.get(dfRandom))) {
                    choiceTeam.add(allPlayer.get(dfRandom));
                    dfNumber++;
                }
            }
        }

        while (mfNumber < mf) {
            int mfRandom = random.nextInt(teamNumber);
            if (allPlayer.get(mfRandom).getPosition() == Position.MF) {
                if (!choiceTeam.contains(allPlayer.get(mfRandom))) {
                    choiceTeam.add(allPlayer.get(mfRandom));
                    mfNumber++;
                }
            }
        }

        while (fwNumber < fw) {
            int fwRandom = random.nextInt(teamNumber);
            if (allPlayer.get(fwRandom).getPosition() == Position.FW) {
                if (!choiceTeam.contains(allPlayer.get(fwRandom))) {
                    choiceTeam.add(allPlayer.get(fwRandom));
                    fwNumber++;
                }
            }
        }

        return choiceTeam;

    }

}
