package com.everysport.api.domain.api;

import java.util.Date;
import java.util.List;

public class Event extends ApiIdEntity
{
	private Date startDate;
	private Integer round;
    private String fields;
	private EventStatus status;
	private Team homeTeam;
	private Team visitingTeam;
	private Integer homeTeamScore;
	private Integer visitingTeamScore;
	private EventFinishedTimeStatus finishedTimeStatus;
    private League league;
    private EventFacts facts;
    private List<GameEvent> gameEvents;
	private List<SubGame> subGames;
    private List<PeriodResult> periodResults;

	public Date getStartDate()
	{
		return startDate;
	}

	public void setStartDate(Date startDate)
	{
		this.startDate = startDate;
	}

	public Integer getRound()
	{
		return round;
	}

	public void setRound(Integer round)
	{
		this.round = round;
	}

    public String getFields()
    {
        return fields;
    }

    public void setFields(String fields)
    {
        this.fields = fields;
    }

	public EventStatus getStatus()
	{
		return status;
	}

	public void setStatus(EventStatus status)
	{
		this.status = status;
	}

	public Team getHomeTeam()
	{
		return homeTeam;
	}

	public void setHomeTeam(Team homeTeam)
	{
		this.homeTeam = homeTeam;
	}

	public Team getVisitingTeam()
	{
		return visitingTeam;
	}

	public void setVisitingTeam(Team visitingTeam)
	{
		this.visitingTeam = visitingTeam;
	}

	public Integer getHomeTeamScore()
	{
		return homeTeamScore;
	}

	public void setHomeTeamScore(Integer homeTeamScore)
	{
		this.homeTeamScore = homeTeamScore;
	}

	public Integer getVisitingTeamScore()
	{
		return visitingTeamScore;
	}

	public void setVisitingTeamScore(Integer visitingTeamScore)
	{
		this.visitingTeamScore = visitingTeamScore;
	}

	public EventFinishedTimeStatus getFinishedTimeStatus()
	{
		return finishedTimeStatus;
	}

	public void setFinishedTimeStatus(EventFinishedTimeStatus finishedTimeStatus)
	{
		this.finishedTimeStatus = finishedTimeStatus;
	}

    public League getLeague() {
        return league;
    }

    public void setLeague(League league) {
        this.league = league;
    }

    public EventFacts getFacts() {
        return facts;
    }

    public void setFacts(EventFacts facts) {
        this.facts = facts;
    }

    public List<GameEvent> getGameEvents() {
        return gameEvents;
    }

    public void setGameEvents(List<GameEvent> gameEvents) {
        this.gameEvents = gameEvents;
    }

    public List<PeriodResult> getPeriodResults() {
        return periodResults;
    }

    public void setPeriodResults(List<PeriodResult> periodResults) {
        this.periodResults = periodResults;
    }
	public List<SubGame> getSubGames()
	{
		return subGames;
	}

	public void setSubGames(List<SubGame> subGames)
	{
		this.subGames = subGames;
	}
}