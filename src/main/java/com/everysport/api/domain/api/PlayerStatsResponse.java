package com.everysport.api.domain.api;

import java.util.LinkedList;
import java.util.List;

public class PlayerStatsResponse extends ApiListResponse
{
    private List<PlayerStats> playerStats = new LinkedList<>();

    public PlayerStatsResponse() {
    }

    public PlayerStatsResponse(List<PlayerStats> playerStats) {
        this.playerStats = playerStats;
    }

    public List<PlayerStats> getPlayerStats() {
        return playerStats;
    }

    public void setPlayerStats(List<PlayerStats> playerStats) {
        this.playerStats = playerStats;
    }
}