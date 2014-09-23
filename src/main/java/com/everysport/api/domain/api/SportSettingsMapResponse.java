package com.everysport.api.domain.api;

import java.util.HashMap;
import java.util.Map;

public class SportSettingsMapResponse extends ApiBaseResponse
{
	private Map<Long, SportSettings> sportSettings = new HashMap<>();

    public SportSettingsMapResponse(Map<Long, SportSettings> sportSettings) {
        this.sportSettings = sportSettings;
    }

    public SportSettingsMapResponse() {
    }

    public Map<Long, SportSettings> getSportSettings() {
		return sportSettings;
	}

	public void setSportSettings(Map<Long, SportSettings> sportSettings) {
		this.sportSettings = sportSettings;
	}
}