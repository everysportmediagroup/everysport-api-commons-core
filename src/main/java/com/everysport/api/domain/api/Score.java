package com.everysport.api.domain.api;

public class Score extends ApiBaseEntity
{
	private Integer homeTeamSetScore;
	private Integer visitingTeamSetScore;

	public Integer getHomeTeamSetScore()
	{
		return homeTeamSetScore;
	}

	public void setHomeTeamSetScore(Integer homeTeamSetScore)
	{
		this.homeTeamSetScore = homeTeamSetScore;
	}

	public Integer getVisitingTeamSetScore()
	{
		return visitingTeamSetScore;
	}

	public void setVisitingTeamSetScore(Integer visitingTeamSetScore)
	{
		this.visitingTeamSetScore = visitingTeamSetScore;
	}
}
