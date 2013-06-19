package com.everysport.api.domain.api;

import java.util.LinkedList;
import java.util.List;

public class SubGame extends ApiBaseEntity
{
	private Integer gameNumber;
	private String gameWinner;
    private Integer homeTeamScore;
    private Integer visitingTeamScore;
	private Player homeTeamPlayer;
	private Player visitingTeamPlayer;

	private List<Score> setScores = new LinkedList<>();

	public Integer getGameNumber()
	{
		return gameNumber;
	}

	public void setGameNumber(Integer gameNumber)
	{
		this.gameNumber = gameNumber;
	}

	public Player getHomeTeamPlayer()
	{
		return homeTeamPlayer;
	}

	public void setHomeTeamPlayer(Player homeTeamPlayer)
	{
		this.homeTeamPlayer = homeTeamPlayer;
	}

	public Player getVisitingTeamPlayer()
	{
		return visitingTeamPlayer;
	}

	public void setVisitingTeamPlayer(Player visitingTeamPlayer)
	{
		this.visitingTeamPlayer = visitingTeamPlayer;
	}

    public Integer getHomeTeamScore() {
        return homeTeamScore;
    }

    public void setHomeTeamScore(Integer homeTeamScore) {
        this.homeTeamScore = homeTeamScore;
    }

    public Integer getVisitingTeamScore() {
        return visitingTeamScore;
    }

    public void setVisitingTeamScore(Integer visitingTeamScore) {
        this.visitingTeamScore = visitingTeamScore;
    }

    public List<Score> getSetScores()
	{
		return setScores;
	}

	public void setSetScores(List<Score> setScores)
	{
		this.setScores = setScores;
	}

	public void setGameWinner(String gameWinner)
	{
		this.gameWinner = gameWinner;
	}

	public String getGameWinner()
	{
		return gameWinner;
	}
}
