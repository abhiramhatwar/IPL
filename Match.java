import java.util.Random;

public class Match {
    private Team team1;
    private Team team2;
    private String venue;
    private String matchDate;
    private int team1Score;
    private int team2Score;
    private Player bestPerformer;
    private Team winner;

    public Match(Team team1, Team team2, String venue, String matchDate) {
        this.team1 = team1;
        this.team2 = team2;
        this.venue = venue;
        this.matchDate = matchDate;
    }

    public void startMatch() {
        // Simulate scores for both teams
        team1Score = simulateScore();
        team2Score = simulateScore();

        // Determine winner and best performer
        if (team1Score > team2Score) {
            winner = team1;
        } else {
            winner = team2;
        }

        bestPerformer = determineBestPerformer();

        // Display scorecard
        displayScorecard();
    }

    private int simulateScore() {
        Random random = new Random();
        return random.nextInt(101) + 100; // Random score between 100 and 200
    }

    private Player determineBestPerformer() {
        // Randomly select the best performer
        Random random = new Random();
        Team team = random.nextBoolean() ? team1 : team2;
        return team.getPlayers().get(random.nextInt(team.getPlayers().size()));
    }

    private void displayScorecard() {
        System.out.println("Match between " + team1.getTeamName() + " and " + team2.getTeamName() + " at " + venue);
        System.out.println("Date: " + matchDate);
        System.out.println(team1.getTeamName() + " Score: " + team1Score);
        System.out.println(team2.getTeamName() + " Score: " + team2Score);
        System.out.println("Winner: " + winner.getTeamName());
        System.out.println("Best Performer: " + bestPerformer.getName() + " (" + bestPerformer.getRole() + ")");
        System.out.println();
    }

    public Team getWinner() {
        return winner;
    }
}
