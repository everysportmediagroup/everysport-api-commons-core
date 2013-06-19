package com.everysport.api.domain.api;

public class PeriodResult extends ApiBaseEntity {

    public enum PeriodType {
        ORDINARY, OVERTIME, SHOOTOUT
    }

    private Integer period;
    private Integer homeTeamPeriodScore;
    private Integer visitingTeamPeriodScore;
    private Integer homeTeamScore;
    private Integer visitingTeamScore;
    private PeriodType type;

    public PeriodResult() {
    }

    public PeriodResult(PeriodType type) {
        this.type = type;
    }

    public Integer getPeriod() {
        return period;
    }

    public void setPeriod(Integer period) {
        this.period = period;
    }

    public Integer getHomeTeamPeriodScore() {
        return homeTeamPeriodScore;
    }

    public void setHomeTeamPeriodScore(Integer homeTeamPeriodScore) {
        this.homeTeamPeriodScore = homeTeamPeriodScore;
    }

    public Integer getVisitingTeamPeriodScore() {
        return visitingTeamPeriodScore;
    }

    public void setVisitingTeamPeriodScore(Integer visitingTeamPeriodScore) {
        this.visitingTeamPeriodScore = visitingTeamPeriodScore;
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

    public PeriodType getType() {
        return type;
    }

    public void setType(PeriodType type) {
        this.type = type;
    }
}
