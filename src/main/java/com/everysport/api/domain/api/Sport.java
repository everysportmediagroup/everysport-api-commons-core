package com.everysport.api.domain.api;

public class Sport extends ApiNamedEntity {
    /* Used by Reflection in ResourceLinkUtils */
    public static final String RESOURCE_PATH = "/sports";

    private String slug;

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }
}