package com.everysport.api.domain.api;

import java.util.Date;
import java.util.List;
import java.util.Map;

public class Event extends ApiIdEntity
{
    /* Used by Reflection in ResourceLinkUtils */
    public static final String RESOURCE_PATH = "/events";

	private Date startDate;
	private Integer round;
    private String fields;
	private EventStatus status;
	private Team homeTeam;
	private Team visitingTeam;
	private Integer homeTeamScore;
	private Integer visitingTeamScore;
	private Integer homeTeamPoints;
	private Integer visitingTeamPoints;
	private Integer highestPossibleTeamPoints;
	private Integer pointsFactor;
	private EventFinishedTimeStatus finishedTimeStatus;
    private League league;
	private boolean neutralGround;
    private EventFacts facts;
    private List<GameEvent> gameEvents;
	private List<SubGame> subGames;
    private List<PeriodResult> periodResults;
    private CurrentPeriod currentPeriod;
    private EventStatistics statistics;
    private String homeTeamFormation;
    private List<GameTeamPlayer> homeTeamLineup;
    private String awayTeamFormation;
    private List<GameTeamPlayer> visitingTeamLineup;
    private Map<String, List<Map<String, Object>>> oddsTypes;
    private boolean liveScore;
	private List<String> liveScoreFactTypes;
	private String source;
	private String sourceEntityId;

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

	public Integer getVisitingTeamPoints()
	{
		return visitingTeamPoints;
	}

	public void setVisitingTeamPoints(Integer visitingTeamPoints)
	{
		this.visitingTeamPoints = visitingTeamPoints;
	}

	public Integer getHomeTeamPoints()
	{
		return homeTeamPoints;
	}

	public void setHomeTeamPoints(Integer homeTeamPoints)
	{
		this.homeTeamPoints = homeTeamPoints;
	}
	
	public Integer getHighestPossibleTeamPoints()
	{
		return highestPossibleTeamPoints;
	}

	public void setHighestPossibleTeamPoints(Integer highestPossibleTeamPoints)
	{
		this.highestPossibleTeamPoints = highestPossibleTeamPoints;
	}

	public Integer getPointsFactor() {
		return pointsFactor;
	}

	public void setPointsFactor(Integer pointsFactor) {
		this.pointsFactor = pointsFactor;
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

	public boolean isNeutralGround() {
		return neutralGround;
	}

	public void setNeutralGround(boolean neutralGround) {
		this.neutralGround = neutralGround;
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

    public CurrentPeriod getCurrentPeriod() {
        return currentPeriod;
    }

    public void setCurrentPeriod(CurrentPeriod currentPeriod) {
        this.currentPeriod = currentPeriod;
    }

	public EventStatistics getStatistics() {
		return statistics;
	}

	public void setStatistics(EventStatistics statistics) {
		this.statistics = statistics;
	}

	public List<GameTeamPlayer> getHomeTeamLineup() {
        return homeTeamLineup;
    }

    public void setHomeTeamLineup(List<GameTeamPlayer> homeTeamLineup) {
        this.homeTeamLineup = homeTeamLineup;
    }

    public List<GameTeamPlayer> getVisitingTeamLineup() {
        return visitingTeamLineup;
    }

    public void setVisitingTeamLineup(List<GameTeamPlayer> visitingTeamLineup) {
        this.visitingTeamLineup = visitingTeamLineup;
    }

	public Map<String, List<Map<String, Object>>> getOddsTypes() {
		return oddsTypes;
	}

	public void setOddsTypes(Map<String, List<Map<String, Object>>> oddsTypes) {
		this.oddsTypes = oddsTypes;
	}

	public boolean getLiveScore() {
        return liveScore;
    }

    public void setLiveScore(boolean liveScore) {
        this.liveScore = liveScore;
    }

    public void setHomeTeamFormation(String homeTeamFormation) {
        this.homeTeamFormation = homeTeamFormation;
    }

    public String getHomeTeamFormation() {
        return homeTeamFormation;
    }

	public void setAwayTeamFormation(String awayTeamFormation) {
		this.awayTeamFormation = awayTeamFormation;
	}

	public String getAwayTeamFormation() {
		return awayTeamFormation;
	}

	public List<String> getLiveScoreFactTypes() {
		return liveScoreFactTypes;
	}

	public void setLiveScoreFactTypes(List<String> liveScoreFactTypes) {
		this.liveScoreFactTypes = liveScoreFactTypes;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public void setSourceEntityId(String sourceEntityId) {
        this.sourceEntityId = sourceEntityId;
    }

    public String getSourceEntityId() {
        return sourceEntityId;
    }
}
