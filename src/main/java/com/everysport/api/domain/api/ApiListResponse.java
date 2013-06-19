package com.everysport.api.domain.api;

public class ApiListResponse extends ApiBaseResponse
{
	public void setTotalCount(Integer totalCount)
	{
		getMetadata().put("totalCount", totalCount);
	}

	public void setCount(Integer count)
	{
		getMetadata().put("count", count);
	}

	public void setLimit(Integer limit)
	{
		getMetadata().put("limit", limit);
	}

	public void setOffset(Integer offset)
	{
		getMetadata().put("offset", offset);
	}
}