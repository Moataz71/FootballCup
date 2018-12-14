import com.team.Amateur;
import com.team.Professional;
import com.team.Team;
import match.MatchLogic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /**
         * first of all I define 8 Teams.
         * I added the teams to allTeams array list.
         * if the total numbers of team is odd, it will be knockout match.
         * you can test knockout match by remove comment allTeams.add(am5)
         *
         *
         * @param team1
         * @param team2
         * @param allTeams
         */

        Professional pro1 = new Professional();
        pro1.setTeamName("Juventeus");
        pro1.setId(1);
        pro1.setType("Profesional");
        pro1.setSponsor("Sky");
        pro1.setBudget(100000);

        Professional pro2 = new Professional();
        pro2.setTeamName("AC Milan");
        pro2.setId(2);
        pro2.setType("Profesional");
        pro2.setSponsor("Nike");
        pro2.setBudget(200000);

        Professional pro3 = new Professional();
        pro3.setTeamName("Roma");
        pro3.setId(3);
        pro3.setType("Profesional");
        pro3.setSponsor("Adidas");
        pro3.setBudget(300000);

        Professional pro4 = new Professional();
        pro4.setTeamName("Inter");
        pro4.setId(4);
        pro4.setType("Profesional");
        pro4.setSponsor("Sony");
        pro4.setBudget(100000);

        Amateur am1 = new Amateur();
        am1.setTeamName("Real Madrid");
        am1.setId(5);
        am1.setType("Amateur");
        am1.setMascotte("Bear");
        am1.setHomeBar("Kawk");

        Amateur am2 = new Amateur();
        am2.setTeamName("Barcelona");
        am2.setId(6);
        am2.setType("Amateur");
        am2.setMascotte("Caty");
        am2.setHomeBar("No1");

        Amateur am3 = new Amateur();
        am3.setTeamName("Sevilia");
        am3.setId(7);
        am3.setType("Amateur");
        am3.setMascotte("Twety");
        am3.setHomeBar("Escape");

        Amateur am4 = new Amateur();
        am4.setTeamName("Valencia");
        am4.setId(8);
        am4.setType("Amateur");
        am4.setMascotte("Fox");
        am4.setHomeBar("Black boys");

        Amateur am5 = new Amateur();
        am5.setTeamName("Ajax");
        am5.setId(9);
        am5.setType("Amateur");
        am5.setMascotte("Ziggo");
        am5.setHomeBar("Melkweg");

        List<Team> allTeams = new ArrayList<>();

        allTeams.add(pro1);
        allTeams.add(pro2);
        allTeams.add(pro3);
        allTeams.add(pro4);
        allTeams.add(am1);
        allTeams.add(am2);
        allTeams.add(am3);
        allTeams.add(am4);
        //allTeams.add(am5);

        Collections.shuffle(allTeams);

        if (allTeams.size() % 2 != 0) {

            System.out.println("The knockout match");
            MatchLogic.match(allTeams.get(0), allTeams.get(1), allTeams);
        }

        System.out.println("******************* Round 1 *********************");

        final int x = allTeams.size() / 2;

        for (int i = 0, j = 1; i < x; i++, j++) {
            MatchLogic.match(allTeams.get(i), allTeams.get(j), allTeams);
        }

        System.out.println("****************** Semi Final *******************");

        final int y = allTeams.size() / 2;

        for (int i = 0, j = 1; i < y; i++, j++) {
            MatchLogic.match(allTeams.get(i), allTeams.get(j), allTeams);
        }

        System.out.println("******************* The Final *********************");
        MatchLogic.match(allTeams.get(0), allTeams.get(1), allTeams);
        System.out.println("The Winner of the tournament is " + allTeams.get(0).getTeamName());
        if (allTeams.get(0).getType().equals("Amateur")) {
            System.out.println("The mascotte of the team is " + allTeams.get(0).getMascotte());
        }
        if (allTeams.get(0).getType().equals("Profesional")) {
            System.out.println("The sponsor of the team is " + allTeams.get(0).getSponsor());
        }


    }


}

