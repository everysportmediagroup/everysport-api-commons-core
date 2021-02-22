package com.everysport.api.domain.api;

public class SportSettings extends ApiIdEntity
{
    private Integer numberOfPeriods;
    private Integer periodLengthInMinutes;
    private Boolean continuousClock;
    private Integer totalGameLengthInMinutes;
    private Integer totalMatchLengthInMinutes;

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

    public Integer getTotalGameLengthInMinutes() {
        return totalGameLengthInMinutes;
    }

    public void setTotalGameLengthInMinutes(Integer totalGameLengthInMinutes) {
        this.totalGameLengthInMinutes = totalGameLengthInMinutes;
    }

    public Integer getTotalMatchLengthInMinutes() {
        return totalMatchLengthInMinutes;
    }

    public void setTotalMatchLengthInMinutes(Integer totalMatchLengthInMinutes) {
        this.totalMatchLengthInMinutes = totalMatchLengthInMinutes;
    }
}