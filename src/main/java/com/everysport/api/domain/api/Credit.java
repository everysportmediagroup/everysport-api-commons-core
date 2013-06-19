package com.everysport.api.domain.api;

public final class Credit extends ApiBaseEntity
{
	private final String message = "Provided by Everysport.com";
	private final String link = "http://www.everysport.com";
	//Todo: better logo
	private final String logoUrl = "http://c.static.es-cdn.net/files/everysport2/images/icons/event/small/everysport.png";

	public String getLogoUrl()
	{
		return logoUrl;
	}

	public String getLink()
	{
		return link;
	}

	public String getMessage()
	{
		return message;
	}

	private static Credit instance = null;

	protected Credit()
	{
		// Exists only to defeat instantiation.
	}

	public static Credit getInstance()
	{
		if (instance == null)
		{
			instance = new Credit();
		}
		return instance;
	}
}
