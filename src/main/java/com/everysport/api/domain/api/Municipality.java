package com.everysport.api.domain.api;

public class Municipality extends ApiIdEntity {

    private String name;

    public Municipality() {
    }

    public Municipality(Long id, String name) {
        setId(id);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
