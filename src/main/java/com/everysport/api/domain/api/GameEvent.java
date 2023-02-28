package com.everysport.api.domain.api;

import java.util.LinkedList;
import java.util.List;

public class GameEvent extends ApiBaseEntity {

    private Team team;
    private Integer homeTeamScore;
    private Integer visitingTeamScore;
    private Integer count;
    private Integer minute;
    private Integer second;
    private GameEventType type;
    private Integer penaltyShot;
    private Boolean ownGoal;
    private Player player;
    private List<Player> assistingPlayers;
    private Player inPlayer;
    private Player outPlayer;
    private GoalType goalType;
    private PenaltyType penaltyType;
    private GameEventLevel level;
    private PeriodResult periodResult;
    private String text;
    private String imageUrl;

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public Integer getHomeTeamScore() {
        return homeTeamScore;
    }

    public void setHomeTeamScore(Integer homeTeamScore) {
        this.homeTeamScore = homeTeamScore;
    }

    public Integer getVisitingTeamScore() {
        return visitingTeamScore;
    }

    public void setVisitingTeamScore(Integer visitingTeamScore) {
        this.visitingTeamScore = visitingTeamScore;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getMinute() {
        return minute;
    }

    public void setMinute(Integer minute) {
        this.minute = minute;
    }

    public Integer getSecond() {
        return second;
    }

    public void setSecond(Integer second) {
        this.second = second;
    }

    public GameEventType getType() {
        return type;
    }

    public void setType(GameEventType type) {
        this.type = type;
    }

    public GoalType getGoalType() {
        return goalType;
    }

    public void setGoalType(GoalType goalType) {
        this.goalType = goalType;
    }

    public Integer getPenaltyShot() {
        return penaltyShot;
    }

    public void setPenaltyShot(Integer penaltyShot) {
        this.penaltyShot = penaltyShot;
    }

    public Boolean getOwnGoal() {
        return ownGoal;
    }

    public void setOwnGoal(Boolean ownGoal) {
        this.ownGoal = ownGoal;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public List<Player> getAssistingPlayers() {
        return assistingPlayers;
    }

    public void setAssistingPlayers(List<Player> assistingPlayers) {
        this.assistingPlayers = assistingPlayers;
    }

    public void addAssistingPlayer(Player player) {

        if(this.assistingPlayers == null) {
            this.assistingPlayers = new LinkedList<Player>();
        }

        this.assistingPlayers.add(player);
    }

    public Player getInPlayer() {
        return inPlayer;
    }

    public void setInPlayer(Player inPlayer) {
        this.inPlayer = inPlayer;
    }

    public Player getOutPlayer()
    {
        return outPlayer;
    }

    public void setOutPlayer(Player outPlayer)
    {
        this.outPlayer = outPlayer;
    }

    public PenaltyType getPenaltyType() {
        return penaltyType;
    }

    public void setPenaltyType(PenaltyType penaltyType) {
        this.penaltyType = penaltyType;
    }

    public GameEventLevel getLevel() {
        return level;
    }

    public void setLevel(GameEventLevel level) {
        this.level = level;
    }

    public void setPeriodResult(PeriodResult periodResult) {
        this.periodResult = periodResult;
    }

    public PeriodResult getPeriodResult() {
        return periodResult;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getImageUrl() {
        return imageUrl;
    }
}
