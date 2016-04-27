package com.everysport.api.domain.api;

public class Municipality extends ApiNamedEntity {

    public Municipality() {
    }

    public Municipality(Long id, String name) {
        setId(id);
        setName(name);
    }
}