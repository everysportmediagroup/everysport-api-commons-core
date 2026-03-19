package com.everysport.api.domain.api;

public class Credit extends ApiBaseEntity
{
	private final String message = "Provided by Everysport.com";
	private final String link = "http://www.everysport.com";
	private final String logoUrl = "http://c.static.es-cdn.net/files/everysport2/images/icons/event/small/everysport.png";
	private String widgetFooterContent;

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

	public String getWidgetFooterContent()
	{
		return widgetFooterContent;
	}

	public void setWidgetFooterContent(String widgetFooterContent)
	{
		this.widgetFooterContent = widgetFooterContent;
	}
}
