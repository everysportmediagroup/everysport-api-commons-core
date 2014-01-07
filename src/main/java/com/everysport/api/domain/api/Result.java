package com.everysport.api.domain.api;

public class Result extends ApiBaseEntity
{
    private Integer position;
    private Event event;

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }
}
