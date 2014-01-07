package com.everysport.api.domain.api;

import java.util.HashSet;
import java.util.Set;

public class ApiIdEntity extends ApiBaseEntity
{
	private Long id;
    private Set<Link> links;

    public Set<Link> getLinks() {
        return links;
    }

    public void setLinks(Set<Link> links) {
        this.links = links;
    }

    public void addLink(Link link) {
        if(links == null) {
            links = new HashSet<Link>();
        }
        links.add(link);
    }

    public Long getId()
	{
		return id;
	}

	public void setId(Long id)
	{
		this.id = id;
	}

	@Override
	public boolean equals(Object o)
	{
		if (this == o)
		{
			return true;
		}
		if (!(o instanceof ApiIdEntity))
		{
			return false;
		}

		ApiIdEntity that = (ApiIdEntity) o;

		if (id != null ? !id.equals(that.id) : that.id != null)
		{
			return false;
		}

		return true;
	}

	@Override
	public int hashCode()
	{
		return id != null ? id.hashCode() : 0;
	}
}