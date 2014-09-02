package com.everysport.api.domain.api;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class GroupedEventsResponse extends ApiListResponse
{
    private List<Map<String, Object>> groupedEvents = new LinkedList<>();

    public List<Map<String, Object>> getGroupedEvents()
    {
        return groupedEvents;
    }

    public void setGroupedEvents(List<Map<String, Object>> groupedEvents)
    {
        this.groupedEvents = groupedEvents;
    }
}
