package com.everysport.api.domain.api;

import java.util.LinkedList;
import java.util.List;

public class TrendGroup extends ApiBaseEntity
{
	private List<Label> labels = new LinkedList<Label>();

	private List<StandingsTrend> standings = new LinkedList<StandingsTrend>();

    public List<StandingsTrend> getStandings() {
        return standings;
    }

    public void setStandings(List<StandingsTrend> standings) {
        this.standings = standings;
    }

    public List<Label> getLabels()
	{
		return labels;
	}

	public void setLabels(List<Label> labels)
	{
		this.labels = labels;
	}
}
