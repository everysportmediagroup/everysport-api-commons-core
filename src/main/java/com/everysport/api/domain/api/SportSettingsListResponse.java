package com.everysport.api.domain.api;

import java.util.LinkedList;
import java.util.List;

public class SportSettingsListResponse extends ApiListResponse
{
	private List<SportSettings> sportSettingsList = new LinkedList<>();

    public SportSettingsListResponse(List<SportSettings> sportSettingsList) {
        this.sportSettingsList = sportSettingsList;
    }

    public SportSettingsListResponse() {
    }

    public List<SportSettings> getSportSettingsList() {
		return sportSettingsList;
	}

	public void setSportSettingsList(List<SportSettings> sportSettingsList) {
		this.sportSettingsList = sportSettingsList;
	}
}