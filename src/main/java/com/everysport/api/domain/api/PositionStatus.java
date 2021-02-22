package com.everysport.api.domain.api;

import java.io.Serializable;

public class PositionStatus implements Serializable
{
	private String type;
	private String name;
	private League destinationLeague;
	private String destinationLeagueName;
	private Integer destinationLeagueId;

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getType()
	{
		return type;
	}

	public void setType(String type)
	{
		this.type = type;
	}

	public League getDestinationLeague() {
		return destinationLeague;
	}

	public void setDestinationLeague(League destinationLeague) {
		this.destinationLeague = destinationLeague;
	}

	public String getDestinationLeagueName() {
		return destinationLeagueName;
	}

	public void setDestinationLeagueName(String destinationLeagueName) {
		this.destinationLeagueName = destinationLeagueName;
	}

	public Integer getDestinationLeagueId() {
		return destinationLeagueId;
	}

	public void setDestinationLeagueId(Integer destinationCompetitionId) {
		this.destinationLeagueId = destinationCompetitionId;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		PositionStatus that = (PositionStatus) o;

		if (type != null ? !type.equals(that.type) : that.type != null) return false;
		if (name != null ? !name.equals(that.name) : that.name != null) return false;
		if (destinationLeague != null ? !destinationLeague.equals(that.destinationLeague) : that.destinationLeague != null) return false;
		if (destinationLeagueId != null ? !destinationLeagueId.equals(that.destinationLeagueId) : that.destinationLeagueId != null) return false;
		return destinationLeagueName != null ? destinationLeagueName.equals(that.destinationLeagueName) : that.destinationLeagueName == null;

	}

	@Override
	public int hashCode() {
		int result = type != null ? type.hashCode() : 0;
		result = 31 * result + (name != null ? name.hashCode() : 0);
		result = 31 * result + (destinationLeague != null ? destinationLeague.hashCode() : 0);
		result = 31 * result + (destinationLeagueId != null ? destinationLeagueId.hashCode() : 0);
		result = 31 * result + (destinationLeagueName != null ? destinationLeagueName.hashCode() : 0);
		return result;
	}

}