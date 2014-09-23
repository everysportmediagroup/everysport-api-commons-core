package com.everysport.api.domain.api;

public class SportSettings extends ApiIdEntity
{
    private Integer numberOfPeriods;
    private Integer periodLengthInMinutes;
    private Boolean continuousClock;
    private Sport sport;

    public Integer getNumberOfPeriods() {
        return numberOfPeriods;
    }

    public void setNumberOfPeriods(Integer numberOfPeriods) {
        this.numberOfPeriods = numberOfPeriods;
    }

    public Integer getPeriodLengthInMinutes() {
        return periodLengthInMinutes;
    }

    public void setPeriodLengthInMinutes(Integer periodLengthInMinutes) {
        this.periodLengthInMinutes = periodLengthInMinutes;
    }

    public Boolean getContinuousClock() {
        return continuousClock;
    }

    public void setContinuousClock(Boolean continuousClock) {
        this.continuousClock = continuousClock;
    }

    public Sport getSport() {
        return sport;
    }

    public void setSport(Sport sport) {
        this.sport = sport;
    }
}