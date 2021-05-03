package src;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Team {
    ArrayList<Player> ListAllPlayers;
    ArrayList<Player> ListTeam;

    public List<Player> getAllPlayers() {
        ArrayList<Player> ListAllPlayer = new ArrayList<Player>();
        ListAllPlayers.add(new Player(1, "Marc-André ter Stegen", Position.GK));
        ListAllPlayers.add(new Player(2, "Sergiño Dest", Position.DF));
        ListAllPlayers.add(new Player(3, "Gerard Piqué", Position.DF));
        ListAllPlayers.add(new Player(4, "Ronald Araújo", Position.DF));
        ListAllPlayers.add(new Player(5, "Sergio Busquets ", Position.MF));
        ListAllPlayers.add(new Player(6, "Antoine Griezmann", Position.FW));
        ListAllPlayers.add(new Player(7, "Miralem Pjanić", Position.MF));
        ListAllPlayers.add(new Player(8, "Martin Braithwaite", Position.FW));
        ListAllPlayers.add(new Player(9, "Lionel Messi ", Position.FW));
        ListAllPlayers.add(new Player(10, "Ousmane Dembélé ", Position.FW));
        ListAllPlayers.add(new Player(11, "Riqui Puig ", Position.MF));
        ListAllPlayers.add(new Player(12, "Neto ", Position.GK));
        ListAllPlayers.add(new Player(13, "Clément Lenglet ", Position.DF));
        ListAllPlayers.add(new Player(14, "Pedri ", Position.MF));
        ListAllPlayers.add(new Player(15, "Francisco Trincão", Position.FW));
        ListAllPlayers.add(new Player(16, "Jordi Alba", Position.DF));
        ListAllPlayers.add(new Player(17, "Matheus Fernandes", Position.MF));
        ListAllPlayers.add(new Player(18, "Sergi Roberto", Position.DF));
        ListAllPlayers.add(new Player(19, "Frenkie de Jong ", Position.MF));
        ListAllPlayers.add(new Player(20, "Ansu Fati", Position.FW));
        ListAllPlayers.add(new Player(21, "Samuel Umtiti", Position.DF));
        ListAllPlayers.add(new Player(22, "Junior Firpo", Position.DF));

        return ListAllPlayers;
    }

    public List<Player> buildTeam() {
        ArrayList<Player> selectedTeam = new ArrayList<Player>();
        Random general = new Random();
        int goalkeeperSize = 0;
        int defenderSize = 0;
        int midfieldSize = 0;
        int fowardSize = 0;
        System.out.println("List player: ");
        while (goalkeeperSize < 1) {
            int rdGoalKeeper = general.nextInt();
            if (ListAllPlayers.get(rdGoalKeeper).getPosition().equals(Position.GK)) {
                selectedTeam.add(ListAllPlayers.get(rdGoalKeeper));
                goalkeeperSize++;
            }
        }
        while (defenderSize < 4) {
            int rdDefender = general.nextInt(22);
            if (ListAllPlayers.get(rdDefender).getPosition().equals(Position.DF)
                    && !selectedTeam.contains(ListAllPlayers.get(rdDefender))) {
                selectedTeam.add(ListAllPlayers.get(rdDefender));
                defenderSize++;
            }
            while (midfieldSize < 4) {
                int rdMidfield = general.nextInt(22);
                if (ListAllPlayers.get(rdMidfield).getPosition().equals(Position.MF)
                        && !selectedTeam.contains(ListAllPlayers.get(rdMidfield))) {
                    selectedTeam.add(ListAllPlayers.get(rdMidfield));
                    midfieldSize++;
                }
                while (fowardSize < 2) {
                    int rdFoward = general.nextInt(22);
                    if (ListAllPlayers.get(rdFoward).getPosition().equals(Position.FW)
                            && !selectedTeam.contains(ListAllPlayers.get(rdFoward))) {
                        selectedTeam.add(ListAllPlayers.get(rdFoward));
                        fowardSize++;
                    }
                }
            }
        }
        return buildTeam();
    }

    public void showAll() {
        for (Player player : ListAllPlayers) {
            System.out.println(player.toString());
        }
    }
    public void showBuild() {
        for (Player player : buildTeam()) {
            System.out.println(player.toString());
        }
    }

    public void getArrayList() {
    }

	public void buidTeam(int i, int j, int k) {
	}
}

