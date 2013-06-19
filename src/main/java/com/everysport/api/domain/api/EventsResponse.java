package com.everysport.api.domain.api;

import java.util.LinkedList;
import java.util.List;

public class EventsResponse extends ApiListResponse
{
	private List<Event> events = new LinkedList<>();

	public List<Event> getEvents()
	{
		return events;
	}

	public void setEvents(List<Event> events)
	{
		this.events = events;
	}
}