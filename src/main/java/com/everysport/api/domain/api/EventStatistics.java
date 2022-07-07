package com.everysport.api.domain.api;

public class EventStatistics extends ApiBaseEntity {
    private EventStatisticsType ballPossession;
    private EventStatisticsType shotsOnGoal;
    private EventStatisticsType shotsOffGoal;
    private EventStatisticsType freeKicks;
    private EventStatisticsType cornerKicks;
    private EventStatisticsType offsides;
    private EventStatisticsType throwIns;
    private EventStatisticsType goalkeeperSaves;
    private EventStatisticsType goalKicks;
    private EventStatisticsType fouls;
    private EventStatisticsType injuries;
    private EventStatisticsType redCards;

    public EventStatisticsType getBallPossession() {
        return ballPossession;
    }

    public void setBallPossession(EventStatisticsType ballPossession) {
        this.ballPossession = ballPossession;
    }

    public EventStatisticsType getShotsOnGoal() {
        return shotsOnGoal;
    }

    public void setShotsOnGoal(EventStatisticsType shotsOnGoal) {
        this.shotsOnGoal = shotsOnGoal;
    }

    public EventStatisticsType getShotsOffGoal() {
        return shotsOffGoal;
    }

    public void setShotsOffGoal(EventStatisticsType shotsOffGoal) {
        this.shotsOffGoal = shotsOffGoal;
    }

    public EventStatisticsType getFreeKicks() {
        return freeKicks;
    }

    public void setFreeKicks(EventStatisticsType freeKicks) {
        this.freeKicks = freeKicks;
    }

    public EventStatisticsType getCornerKicks() {
        return cornerKicks;
    }

    public void setCornerKicks(EventStatisticsType cornerKicks) {
        this.cornerKicks = cornerKicks;
    }

    public EventStatisticsType getOffsides() {
        return offsides;
    }

    public void setOffsides(EventStatisticsType offsides) {
        this.offsides = offsides;
    }

    public EventStatisticsType getThrowIns() {
        return throwIns;
    }

    public void setThrowIns(EventStatisticsType throwIns) {
        this.throwIns = throwIns;
    }

    public EventStatisticsType getGoalkeeperSaves() {
        return goalkeeperSaves;
    }

    public void setGoalkeeperSaves(EventStatisticsType goalkeeperSaves) {
        this.goalkeeperSaves = goalkeeperSaves;
    }

    public EventStatisticsType getGoalKicks() {
        return goalKicks;
    }

    public void setGoalKicks(EventStatisticsType goalKicks) {
        this.goalKicks = goalKicks;
    }

    public EventStatisticsType getFouls() {
        return fouls;
    }

    public void setFouls(EventStatisticsType fouls) {
        this.fouls = fouls;
    }

    public EventStatisticsType getInjuries() {
        return injuries;
    }

    public void setInjuries(EventStatisticsType injuries) {
        this.injuries = injuries;
    }

    public EventStatisticsType getRedCards() {
        return redCards;
    }

    public void setRedCards(EventStatisticsType redCards) {
        this.redCards = redCards;
    }
}