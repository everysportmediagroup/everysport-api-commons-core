package com.everysport.api.domain.api;

public class TeamStats extends ApiBaseEntity
{
	private String groupType;

	private String name;

	private String value;

    private TeamStats() {
    }

    public TeamStats(String groupType, String name, String value)
	{
		this.groupType = groupType;
		this.name = name;
		this.value = value;
	}

	public String getGroupType() {
		return groupType;
	}

	public void setGroupType(String groupType) {
		this.groupType = groupType;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getValue()
	{
		return value;
	}
}
