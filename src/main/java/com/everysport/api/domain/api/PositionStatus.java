package com.everysport.api.domain.api;

import java.io.Serializable;

public class PositionStatus implements Serializable
{
	private String type;
	private String name;

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

	@Override
	public boolean equals(Object o)
	{
		if (this == o)
		{
			return true;
		}
		if (o == null || getClass() != o.getClass())
		{
			return false;
		}

		PositionStatus positionStatus = (PositionStatus) o;

		if (name != null ? !name.equals(positionStatus.name) : positionStatus.name != null)
		{
			return false;
		}
		if (type != null ? !type.equals(positionStatus.type) : positionStatus.type != null)
		{
			return false;
		}

		return true;
	}

	@Override
	public int hashCode()
	{
		int result = type != null ? type.hashCode() : 0;
		result = 31 * result + (name != null ? name.hashCode() : 0);
		return result;
	}
}