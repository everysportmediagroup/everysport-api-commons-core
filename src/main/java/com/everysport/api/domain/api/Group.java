package com.everysport.api.domain.api;

import java.util.LinkedList;
import java.util.List;

public class Group extends ApiBaseEntity
{
	private List<Label> labels = new LinkedList<Label>();

	private List<Standings> standings = new LinkedList<Standings>();

	public List<Standings> getStandings()
	{
		return standings;
	}

	public void setStandings(List<Standings> standings)
	{
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
