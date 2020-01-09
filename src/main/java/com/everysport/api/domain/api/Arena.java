package com.everysport.api.domain.api;

/**
 * User: Calle
 * Date: 2013-05-06
 * Time: 15:45
 */
public class Arena extends ApiNamedEntity {
    private String articleName;
    private Coordinates rt90coordinates;

    public String getArticleName() {
        return articleName;
    }

    public void setArticleName(String articleName) {
        this.articleName = articleName;
    }

    public Coordinates getRt90coordinates() {
        return rt90coordinates;
    }

    public void setRt90coordinates(Coordinates rt90coordinates) {
        this.rt90coordinates = rt90coordinates;
    }
}
