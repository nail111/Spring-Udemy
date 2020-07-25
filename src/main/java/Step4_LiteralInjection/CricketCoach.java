package Step4_LiteralInjection;

public class CricketCoach{
    public String getEmail() {
        return email;
    }

    public String getTeam() {
        return team;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public void setFortune(Fortune fortune) {
        System.out.println("Cricked inside setter method");
        this.fortune = fortune;
    }

    private Fortune fortune;
    private String email;
     private String team;
}