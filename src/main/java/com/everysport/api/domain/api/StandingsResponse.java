package com.everysport.api.domain.api;

import java.util.LinkedList;
import java.util.List;

public class StandingsResponse extends ApiBaseResponse
{
	private League league;
	private List<Group> groups = new LinkedList<Group>();
	private Boolean liveStandings;

	public League getLeague() {
		return league;
	}

	public void setLeague(League league) {
		this.league = league;
	}

	public List<Group> getGroups()
	{
		return groups;
	}

	public void setGroups(List<Group> groups)
	{
		this.groups = groups;
	}

	public void setLiveStandings(Boolean liveStandings) {
		this.liveStandings = liveStandings;
	}

	public Boolean getLiveStandings() {
		return liveStandings;
	}
}
