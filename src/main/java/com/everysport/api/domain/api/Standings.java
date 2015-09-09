package com.everysport.api.domain.api;

import java.util.LinkedList;
import java.util.List;

public class Standings extends ApiBaseEntity
{
	private Team team;

	private List<PositionStatus> positionStatuses = new LinkedList<PositionStatus>();

	private Integer lineThicknessBelow;

	private List<TeamStats> stats = new LinkedList<TeamStats>();

	private Integer previousPosition;

	private Boolean live;

	public Team getTeam()
	{
		return team;
	}

	public void setTeam(Team team)
	{
		this.team = team;
	}

	public List<PositionStatus> getPositionStatuses()
	{
		return positionStatuses;
	}

	public void setPositionStatuses(List<PositionStatus> positionStatuses)
	{
		this.positionStatuses = positionStatuses;
	}

	public Integer getLineThicknessBelow()
	{
		return lineThicknessBelow;
	}

	public void setLineThicknessBelow(Integer lineThicknessBelow)
	{
		this.lineThicknessBelow = lineThicknessBelow;
	}

	public List<TeamStats> getStats()
	{
		return stats;
	}

	public void setStats(List<TeamStats> stats)
	{
		this.stats = stats;
	}

	public Integer getPreviousPosition() { return previousPosition; }

	public void setPreviousPosition(Integer previousPosition) {
		this.previousPosition = previousPosition;
	}

	public void setLive(Boolean live) {
		this.live = live;
	}

	public Boolean getLive() {
		return live;
	}

}
