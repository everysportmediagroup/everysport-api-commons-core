package com.everysport.api.domain.api;

import java.util.HashMap;
import java.util.Map;

public abstract class ApiBaseResponse extends ApiBaseEntity
{
	private Credit credit = null;
	private Map<String, Object> metadata = new HashMap<>();

	public Credit getCredit()
	{
		return credit;
	}

	public void setCredit(Credit credit)
	{
		this.credit = credit;
	}

	public Map<String, Object> getMetadata()
	{
		return metadata;
	}

	public void setMetadata(Map<String, Object> metadata)
	{
		this.metadata = metadata;
	}
}