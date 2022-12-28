package com.everysport.api.domain.api;

import java.io.Serializable;
import java.util.Objects;

public class Season implements Serializable {

    private String name;
    private String slug;
    private Integer startYear;
    private Integer endYear;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public Integer getStartYear() {
        return startYear;
    }

    public void setStartYear(Integer startYear) {
        this.startYear = startYear;
    }

    public Integer getEndYear() {
        return endYear;
    }

    public void setEndYear(Integer endYear) {
        this.endYear = endYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Season season = (Season) o;
        return name.equals(season.name) &&
                startYear.equals(season.startYear) &&
                endYear.equals(season.endYear);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, startYear, endYear);
    }
}
