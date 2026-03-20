package com.everysport.api.domain.api;

public class Credit extends ApiBaseEntity
{
	private String message;
	private String link;
	private String logoUrl;

	public String getLogoUrl()
	{
		return logoUrl;
	}

	public void setLogoUrl(String logoUrl)
	{
		this.logoUrl = logoUrl;
	}

	public String getLink()
	{
		return link;
	}

	public void setLink(String link)
	{
		this.link = link;
	}

	public String getMessage()
	{
		return message;
	}

	public void setMessage(String message)
	{
		this.message = message;
	}
}
