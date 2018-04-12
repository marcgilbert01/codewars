package com.example.marcgilbert.codewars.api.codewars.pojos;

public class Member {

    private Ranks ranks;

    private String[] skills;

    private String leaderboardPosition;

    private String username;

    private CodeChallenges codeChallenges;

    private String clan;

    private String honor;

    private String name;

    public Ranks getRanks() {
        return ranks;
    }

    public void setRanks(Ranks ranks) {
        this.ranks = ranks;
    }

    public String[] getSkills() {
        return skills;
    }

    public void setSkills(String[] skills) {
        this.skills = skills;
    }

    public String getLeaderboardPosition() {
        return leaderboardPosition;
    }

    public void setLeaderboardPosition(String leaderboardPosition) {
        this.leaderboardPosition = leaderboardPosition;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public CodeChallenges getCodeChallenges() {
        return codeChallenges;
    }

    public void setCodeChallenges(CodeChallenges codeChallenges) {
        this.codeChallenges = codeChallenges;
    }

    public String getClan() {
        return clan;
    }

    public void setClan(String clan) {
        this.clan = clan;
    }

    public String getHonor() {
        return honor;
    }

    public void setHonor(String honor) {
        this.honor = honor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ClassPojo [ranks = " + ranks + ", skills = " + skills + ", leaderboardPosition = " + leaderboardPosition + ", username = " + username + ", codeChallenges = " + codeChallenges + ", clan = " + clan + ", honor = " + honor + ", name = " + name + "]";
    }


}
