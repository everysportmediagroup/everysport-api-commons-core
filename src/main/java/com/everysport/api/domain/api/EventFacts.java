package com.everysport.api.domain.api;

import java.util.List;

/**
 * User: Calle
 * Date: 2013-05-06
 * Time: 15:44
 */
public class EventFacts extends ApiBaseEntity {
    private List<String> referees;
    private String shots;
    private String penalties;
    private Arena arena;
    private Integer spectators;

    public List<String> getReferees() {
        return referees;
    }

    public void setReferees(List<String> referees) {
        this.referees = referees;
    }

    public String getShots() {
        return shots;
    }

    public void setShots(String shots) {
        this.shots = shots;
    }

    public String getPenalties() {
        return penalties;
    }

    public void setPenalties(String penalties) {
        this.penalties = penalties;
    }

    public Arena getArena() {
        return arena;
    }

    public void setArena(Arena arena) {
        this.arena = arena;
    }

    public Integer getSpectators() {
        return spectators;
    }

    public void setSpectators(Integer spectators) {
        this.spectators = spectators;
    }
}
