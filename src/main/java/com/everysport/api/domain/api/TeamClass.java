package com.everysport.api.domain.api;

public enum TeamClass
{
	MEN(1), WOMEN(2), ALL(0), MIXED(3), BOYS(8), GIRLS(9);

	TeamClass(Integer id)
	{
		this.id = id;
	}

	private Integer id;

	public Integer getId()
	{
		return id;
	}

	public void setId(Integer id)
	{
		this.id = id;
	}
}
