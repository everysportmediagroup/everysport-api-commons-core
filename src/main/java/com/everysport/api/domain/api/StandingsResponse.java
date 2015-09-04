package com.everysport.api.domain.api;

import java.util.LinkedList;
import java.util.List;

public class StandingsResponse extends ApiBaseResponse
{
	private List<Group> groups = new LinkedList<Group>();
	private Boolean livetable;

	public List<Group> getGroups()
	{
		return groups;
	}

	public void setGroups(List<Group> groups)
	{
		this.groups = groups;
	}

	public void setLivetable(Boolean livetable) {
		this.livetable = livetable;
	}

	public Boolean getLivetable() {
		return livetable;
	}
}
