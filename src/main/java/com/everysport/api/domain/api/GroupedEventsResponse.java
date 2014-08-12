package com.everysport.api.domain.api;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupedEventsResponse extends ApiListResponse
{
	private Map<String, List<Event>> events = new HashMap<>();

	public Map<String, List<Event>> getEvents()
	{
		return events;
	}

	public void setEvents(Map<String, List<Event>> events)
	{
		this.events = events;
	}
}