package com.everysport.api.domain.api;

public class Team extends ApiIdEntity
{
	private String name;
	private String shortName;
	private String abbreviation;
	private String articleName;
	private String articleShortName;
	private String link;
    private Municipality municipality;

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getShortName()
	{
		return shortName;
	}

	public void setShortName(String shortName)
	{
		this.shortName = shortName;
	}

	public String getAbbreviation()
	{
		return abbreviation;
	}

	public void setAbbreviation(String abbreviation)
	{
		this.abbreviation = abbreviation;
	}

	public String getLink()
	{
		return link;
	}

	public void setLink(String link)
	{
		this.link = link;
	}

    public Municipality getMunicipality() {
        return municipality;
    }

    public void setMunicipality(Municipality municipality) {
        this.municipality = municipality;
    }

	public String getArticleName() {
		return articleName;
	}

	public void setArticleName(String articleName) {
		this.articleName = articleName;
	}

	public String getArticleShortName() {
		return articleShortName;
	}

	public void setArticleShortName(String articleShortName) {
		this.articleShortName = articleShortName;
	}
}