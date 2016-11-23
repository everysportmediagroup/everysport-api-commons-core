package com.everysport.api.domain.api;

import java.io.Serializable;

public class PositionStatus implements Serializable
{
	private String type;
	private String name;
	private Integer destinationCompetitionId;

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

	public Integer getDestinationCompetitionId() {
		return destinationCompetitionId;
	}

	public void setDestinationCompetitionId(Integer destinationCompetitionId) {
		this.destinationCompetitionId = destinationCompetitionId;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		PositionStatus that = (PositionStatus) o;

		if (type != null ? !type.equals(that.type) : that.type != null) return false;
		if (name != null ? !name.equals(that.name) : that.name != null) return false;
		return destinationCompetitionId != null ? destinationCompetitionId.equals(that.destinationCompetitionId) : that.destinationCompetitionId == null;

	}

	@Override
	public int hashCode() {
		int result = type != null ? type.hashCode() : 0;
		result = 31 * result + (name != null ? name.hashCode() : 0);
		result = 31 * result + (destinationCompetitionId != null ? destinationCompetitionId.hashCode() : 0);
		return result;
	}
}