package com.everysport.api.domain.api;

public class Sport extends ApiIdEntity
{
    /* Used by Reflection in ResourceLinkUtils */
    public static final String RESOURCE_PATH = "/sports";
	private String name;

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}
}