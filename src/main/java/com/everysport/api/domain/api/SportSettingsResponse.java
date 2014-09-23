package com.everysport.api.domain.api;

public class SportSettingsResponse extends ApiBaseResponse
{
    private SportSettings sportSettings;

    public SportSettingsResponse() {
    }

    public SportSettingsResponse(SportSettings sportSettings) {
        setSportSettings(sportSettings);
    }

    public SportSettings getSportSettings() {
        return sportSettings;
    }

    public void setSportSettings(SportSettings sportSettings) {
        this.sportSettings = sportSettings;
    }
}