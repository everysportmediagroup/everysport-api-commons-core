package com.everysport.api.domain.api;

import java.util.LinkedList;
import java.util.List;

public class StandingsResponse extends ApiBaseResponse
{
	private List<Group> groups = new LinkedList<Group>();
	private Boolean liveStandings;

	public List<Group> getGroups()
	{
		return groups;
	}

	public void setGroups(List<Group> groups)
	{
		this.groups = groups;
	}

	public void setliveStandings(Boolean liveStandings) {
		this.liveStandings = liveStandings;
	}

	public Boolean getliveStandings() {
		return liveStandings;
	}
}
