package com.team;

public class Team {
    private String teamName;
    private long id;
    String x;
    String y;
    String z;

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
    public String getType(){
        return x;
    };
    public String getSponsor() {
        return y;
    }
    public String getMascotte() {
        return z;
    }


}
