package match;

import com.team.Team;

import java.util.List;

public class MatchLogic {
    public static void match(Team team1, Team team2, List<Team> allTeams) {
        /**
         * Method to generate a random winner for each match
         * if the match end in a tie, The teams will play extra time.
         * if the extra time end in a tie, The teams will play penalties shoot-out.
         *
         *
         * @param team1
         * @param team2
         * @param allTeams
         */
        System.out.println("Match : " + team1.getTeamName() + " VS " + team2.getTeamName());

        int scoreTeam1 = (int) (Math.random() * ((5 - 1) + 1));

        int scoreTeam2 = (int) (Math.random() * ((5 - 1) + 1));

        if (scoreTeam1 > scoreTeam2) {
            System.out.println(scoreTeam1 + " - " + scoreTeam2);
            System.out.println("The winner is " + team1.getTeamName());
            allTeams.remove(team2);
        } else if (scoreTeam2 > scoreTeam1) {
            System.out.println(scoreTeam1 + " - " + scoreTeam2);
            System.out.println("The winner is " + team2.getTeamName());
            allTeams.remove(team1);
        } else {
            System.out.println(scoreTeam1 + " - " + scoreTeam2);
            System.out.println("Extra Time  : ");
            int exScoreTeam1 = (int) (Math.random() * ((3 - 1) + 1));
            int exScoreTeam2 = (int) (Math.random() * ((3 - 1) + 1));
            if (exScoreTeam1 > exScoreTeam2) {
                System.out.println((scoreTeam1 + exScoreTeam1) + " - " + (scoreTeam2 + exScoreTeam2));
                System.out.println("The winner is " + team1.getTeamName());
                allTeams.remove(team2);
            } else if (exScoreTeam2 > exScoreTeam1) {
                System.out.println((scoreTeam1 + exScoreTeam1) + " - " + (scoreTeam2 + exScoreTeam2));
                System.out.println("The winner is " + team2.getTeamName());
                allTeams.remove(team1);
            } else {
                //System.out.println("The extra time end with  " + (scoreTeam1 + exScoreTeam1) + " - " + (scoreTeam2 + exScoreTeam2));
                int penaltyScoreTeam1 = (int) (Math.random() * ((5 - 1) + 1));
                int penaltyScoreTeam2 = (int) (Math.random() * ((5 - 1) + 1));
                do {
                    penaltyScoreTeam2 = (int) (Math.random() * ((5 - 1) + 1));
                } while (penaltyScoreTeam1 == penaltyScoreTeam2);
                if (penaltyScoreTeam1 > penaltyScoreTeam2) {
                    System.out.println((scoreTeam1 + exScoreTeam1) + " - " + (scoreTeam2 + exScoreTeam2));
                    System.out.println("Penalty reuslt :");
                    System.out.println(penaltyScoreTeam1 + " - " + penaltyScoreTeam2);
                    System.out.println("The winner is " + team1.getTeamName());
                    allTeams.remove(team2);
                } else if (penaltyScoreTeam2 > penaltyScoreTeam1) {
                    System.out.println((scoreTeam1 + exScoreTeam1) + " - " + (scoreTeam2 + exScoreTeam2));
                    System.out.println("Penalty reuslt :");
                    System.out.println(penaltyScoreTeam1 + " - " + penaltyScoreTeam2);
                    System.out.println("The winner is " + team2.getTeamName());
                    allTeams.remove(team1);

                }

            }


        }
        System.out.println("-----------------------------");

    }
}
