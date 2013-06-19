package com.everysport.api.domain.api;

/**
 * User: Calle
 * Date: 2013-05-06
 * Time: 15:45
 */
public class Arena extends ApiIdEntity {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
