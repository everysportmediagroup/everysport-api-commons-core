package com.everysport.api.domain.api;

import java.util.LinkedList;
import java.util.List;

public class StandingsTrendResponse extends ApiBaseResponse
{
	private List<TrendGroup> groups = new LinkedList<>();

	public List<TrendGroup> getGroups()
	{
		return groups;
	}

	public void setGroups(List<TrendGroup> groups)
	{
		this.groups = groups;
	}
}
