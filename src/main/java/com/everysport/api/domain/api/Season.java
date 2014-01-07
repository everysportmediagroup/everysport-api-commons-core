package com.everysport.api.domain.api;

import java.io.Serializable;

public class Season implements Serializable {

    private String name;
    private static final long serialVersionUID = -7293115954664886344L;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Season season = (Season) o;

        if (name != null ? !name.equals(season.name) : season.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }
}
