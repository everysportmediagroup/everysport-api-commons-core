package com.everysport.api.domain.api;

public class Label extends ApiBaseEntity
{
	private String type;

	private String name;

    private Label() {
    }

    public Label(String type, String name)
	{
		this.type = type;
		this.name = name;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getType()
	{
		return type;
	}

	public void setType(String type)
	{
		this.type = type;
	}

	@Override
	public boolean equals(Object o)
	{
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Label label = (Label) o;

		if (name != null ? !name.equals(label.name) : label.name != null) return false;
		if (type != null ? !type.equals(label.type) : label.type != null) return false;

		return true;
	}

	@Override
	public int hashCode()
	{
		int result = type != null ? type.hashCode() : 0;
		result = 31 * result + (name != null ? name.hashCode() : 0);
		return result;
	}
}
