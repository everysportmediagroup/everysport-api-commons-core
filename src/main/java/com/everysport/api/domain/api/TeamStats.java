package com.everysport.api.domain.api;

public class TeamStats extends ApiBaseEntity
{
	private String name;

	private Integer value;

    private TeamStats() {
    }

    public TeamStats(String name, Integer value)
	{
		this.name = name;
		this.value = value;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public Integer getValue()
	{
		return value;
	}
}
