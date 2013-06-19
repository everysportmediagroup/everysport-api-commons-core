package com.everysport.api.domain.api;

import java.util.LinkedList;
import java.util.List;

public class SportsResponse extends ApiListResponse
{
	private List<Sport> sports = new LinkedList<>();

    public SportsResponse(List<Sport> sports) {
        this.sports = sports;
    }

    public SportsResponse() {
    }

    public List<Sport> getSports()
	{
		return sports;
	}

	public void setSports(List<Sport> sports)
	{
		this.sports = sports;
	}
}