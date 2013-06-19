package com.everysport.api.domain.api;

public class EventResponse extends ApiBaseResponse
{

    private Event event;

    public EventResponse() {
    }

    public EventResponse(Event event) {
        setEvent(event);
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }
}
