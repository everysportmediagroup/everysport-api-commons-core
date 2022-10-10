package com.everysport.api.domain.api;

public class TeamStats extends ApiBaseEntity
{
	private String groupType;

	private String name;

	private String value;

	private Boolean primarySorting;

    private TeamStats() {
    }

    public TeamStats(String groupType, String name, String value, Boolean primarySorting)
	{
		this.groupType = groupType;
		this.name = name;
		this.value = value;
		this.primarySorting = primarySorting;
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

	public Boolean getPrimarySorting() {
		return primarySorting;
	}

	public void setPrimarySorting(Boolean primarySorting) {
		this.primarySorting = primarySorting;
	}
}
