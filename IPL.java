import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IPL {
    private List<Team> teams;
    private List<Match> matches;

    public IPL() {
        teams = new ArrayList<>();
        matches = new ArrayList<>();
    }

    public void addTeam(Team team) {
        teams.add(team);
    }

    public void addMatch(Match match) {
        matches.add(match);
    }

    public List<Team> getTeams() {
        return teams;
    }

    public void startTournament() {
        System.out.println("IPL Tournament is starting!");

        // Track wins for each team
        Map<Team, Integer> teamWins = new HashMap<>();

        for (Match match : matches) {
            match.startMatch();
            Team winner = match.getWinner();
            teamWins.put(winner, teamWins.getOrDefault(winner, 0) + 1);
        }

        // Determine the tournament winner
        Team tournamentWinner = null;
        int maxWins = 0;
        for (Map.Entry<Team, Integer> entry : teamWins.entrySet()) {
            if (entry.getValue() > maxWins) {
                maxWins = entry.getValue();
                tournamentWinner = entry.getKey();
            }
        }

        System.out.println("Tournament Winner: " + (tournamentWinner != null ? tournamentWinner.getTeamName() : "No Winner"));
    }

    public void displayTournamentDetails() {
        System.out.println("Teams in the Tournament:");
        for (Team team : teams) {
            team.displayTeamInfo();
        }
    }

    public static void main(String[] args) {
        // Create players
        Player player1 = new Batsman("Virat Kohli", 32, 12000, 59.3);
        Player player2 = new Batsman("Rohit Sharma", 34, 9000, 48.7);
        Player player3 = new Batsman("Shikhar Dhawan", 35, 7500, 45.2);
        Player player4 = new Batsman("KL Rahul", 29, 5000, 52.1);
        Player player5 = new Batsman("Shubman Gill", 22, 3000, 41.8);
        Player player6 = new Batsman("Rishabh Pant", 24, 3500, 46.3);

        Player player7 = new Bowler("Jasprit Bumrah", 28, 200, 23.4);
        Player player8 = new Bowler("Ravichandran Ashwin", 33, 300, 25.1);
        Player player9 = new Bowler("Mohammed Shami", 30, 180, 26.5);
        Player player10 = new Bowler("Yuzvendra Chahal", 31, 250, 24.0);
        Player player11 = new Bowler("Bhuvneshwar Kumar", 31, 230, 23.9);

        Player player12 = new Batsman("Ajinkya Rahane", 33, 5000, 39.4);
        Player player13 = new Batsman("Sanju Samson", 26, 4000, 42.6);
        Player player14 = new Batsman("Suryakumar Yadav", 30, 4500, 49.7);
        Player player15 = new Batsman("Prithvi Shaw", 22, 3200, 44.2);
        Player player16 = new Batsman("Mayank Agarwal", 29, 3900, 47.5);
        Player player17 = new Batsman("Manish Pandey", 31, 4800, 39.9);

        Player player18 = new Bowler("Ravindra Jadeja", 32, 280, 25.7);
        Player player19 = new Bowler("Shardul Thakur", 29, 150, 28.3);
        Player player20 = new Bowler("Navdeep Saini", 28, 120, 30.5);
        Player player21 = new Bowler("Varun Chakravarthy", 30, 180, 22.1);
        Player player22 = new Bowler("Deepak Chahar", 28, 160, 26.4);

        Player player23 = new Batsman("Dinesh Karthik", 35, 5800, 40.8);
        Player player24 = new Batsman("Nitish Rana", 27, 3200, 43.3);
        Player player25 = new Batsman("Ishan Kishan", 23, 3100, 46.0);
        Player player26 = new Batsman("Hardik Pandya", 27, 3400, 49.1);
        Player player27 = new Batsman("Venkatesh Iyer", 26, 2800, 45.7);
        Player player28 = new Batsman("Devdutt Padikkal", 21, 2500, 41.3);

        Player player29 = new Bowler("Harshal Patel", 31, 200, 24.7);
        Player player30 = new Bowler("Axar Patel", 28, 170, 25.9);
        Player player31 = new Bowler("Rahul Chahar", 22, 130, 28.1);
        Player player32 = new Bowler("Krunal Pandya", 30, 150, 27.2);
        Player player33 = new Bowler("Washington Sundar", 22, 110, 29.4);

        Player player34 = new Batsman("Rahul Tripathi", 30, 3700, 42.4);
        Player player35 = new Batsman("Wriddhiman Saha", 36, 4000, 40.5);
        Player player36 = new Batsman("Sarfaraz Khan", 24, 2600, 44.8);
        Player player37 = new Batsman("Mandeep Singh", 29, 3100, 42.1);
        Player player38 = new Batsman("Shivam Dube", 28, 2900, 46.6);
        Player player39 = new Batsman("Karun Nair", 29, 3500, 39.7);

        Player player40 = new Bowler("Mohammed Siraj", 27, 210, 24.9);
        Player player41 = new Bowler("Khaleel Ahmed", 27, 140, 27.5);
        Player player42 = new Bowler("Prasidh Krishna", 25, 130, 29.0);
        Player player43 = new Bowler("Jaydev Unadkat", 30, 190, 25.3);
        Player player44 = new Bowler("Anrich Nortje", 27, 220, 23.4);

        Player player45 = new Batsman("Hanuma Vihari", 27, 2800, 41.9);
        Player player46 = new Batsman("Sam Curran", 23, 2500, 49.0);
        Player player47 = new Batsman("Tom Banton", 22, 2100, 45.3);
        Player player48 = new Batsman("Shubman Gill", 22, 3300, 44.5);
        Player player49 = new Batsman("Devdutt Padikkal", 22, 3400, 47.6);

        Player player50 = new Bowler("Chris Morris", 33, 270, 24.8);
        Player player51 = new Bowler("Lungi Ngidi", 25, 160, 26.7);
        Player player52 = new Bowler("Lockie Ferguson", 29, 200, 25.5);
        Player player53 = new Bowler("Kagiso Rabada", 26, 250, 22.9);
        Player player54 = new Bowler("Mustafizur Rahman", 26, 210, 24.1);

        // Create teams and add players
        Team team1 = new Team("Royal Challengers Bangalore");
        team1.addPlayer(player1);  // Batsman
        team1.addPlayer(player2);  // Batsman
        team1.addPlayer(player3);  // Batsman
        team1.addPlayer(player4);  // Batsman
        team1.addPlayer(player5);  // Batsman
        team1.addPlayer(player6);  // Batsman
        team1.addPlayer(player7);  // Bowler
        team1.addPlayer(player8);  // Bowler
        team1.addPlayer(player9);  // Bowler
        team1.addPlayer(player10); // Bowler
        team1.addPlayer(player11); // Bowler

        Team team2 = new Team("Mumbai Indians");
        team2.addPlayer(player12); // Batsman
        team2.addPlayer(player13); // Batsman
        team2.addPlayer(player14); // Batsman
        team2.addPlayer(player15); // Batsman
        team2.addPlayer(player16); // Batsman
        team2.addPlayer(player17); // Batsman
        team2.addPlayer(player18); // Bowler
        team2.addPlayer(player19); // Bowler
        team2.addPlayer(player20); // Bowler
        team2.addPlayer(player21); // Bowler
        team2.addPlayer(player22); // Bowler

        Team team3 = new Team("Chennai Super Kings");
        team3.addPlayer(player23); // Batsman
        team3.addPlayer(player24); // Batsman
        team3.addPlayer(player25); // Batsman
        team3.addPlayer(player26); // Batsman
        team3.addPlayer(player27); // Batsman
        team3.addPlayer(player28); // Batsman
        team3.addPlayer(player29); // Bowler
        team3.addPlayer(player30); // Bowler
        team3.addPlayer(player31); // Bowler
        team3.addPlayer(player32); // Bowler
        team3.addPlayer(player33); // Bowler

        Team team4 = new Team("Delhi Capitals");
        team4.addPlayer(player34); // Batsman
        team4.addPlayer(player35); // Batsman
        team4.addPlayer(player36); // Batsman
        team4.addPlayer(player37); // Batsman
        team4.addPlayer(player38); // Batsman
        team4.addPlayer(player39); // Batsman
        team4.addPlayer(player40); // Bowler
        team4.addPlayer(player41); // Bowler
        team4.addPlayer(player42); // Bowler
        team4.addPlayer(player43); // Bowler
        team4.addPlayer(player44); // Bowler

        Team team5 = new Team("Kolkata Knight Riders");
        team5.addPlayer(player45); // Batsman
        team5.addPlayer(player46); // Batsman
        team5.addPlayer(player47); // Batsman
        team5.addPlayer(player48); // Batsman
        team5.addPlayer(player49); // Batsman
        team5.addPlayer(player50); // Bowler
        team5.addPlayer(player51); // Bowler
        team5.addPlayer(player52); // Bowler
        team5.addPlayer(player53); // Bowler
        team5.addPlayer(player54); // Bowler

        // Create IPL tournament
        IPL iplTournament = new IPL();
        iplTournament.addTeam(team1);
        iplTournament.addTeam(team2);
        iplTournament.addTeam(team3);
        iplTournament.addTeam(team4);
        iplTournament.addTeam(team5);

        // Create matches (each team plays against every other team twice)
        List<Team> allTeams = iplTournament.getTeams();
        for (int i = 0; i < allTeams.size(); i++) {
            for (int j = i + 1; j < allTeams.size(); j++) {
                // Each pair of teams plays 2 matches
                Match match1 = new Match(allTeams.get(i), allTeams.get(j), "Chinnaswamy stadium", "2024-09-20");
                Match match2 = new Match(allTeams.get(j), allTeams.get(i), "Wankhede stadium", "2024-09-21");
                iplTournament.addMatch(match1);
                iplTournament.addMatch(match2);
            }
        }

        // Start the tournament
        iplTournament.displayTournamentDetails();
        iplTournament.startTournament();
    }
}
