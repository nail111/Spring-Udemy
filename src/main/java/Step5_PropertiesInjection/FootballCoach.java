package Step5_PropertiesInjection;

public class FootballCoach {

    public void setFortune(Fortune fortune) {
        System.out.println("SetFortune:");
        this.fortune = fortune;
    }

    private Fortune fortune;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    private String email;
    private String team;

}