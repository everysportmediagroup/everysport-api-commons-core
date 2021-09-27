package com.everysport.api.domain.api;

/**
 * User: Calle
 * Date: 2013-05-06
 * Time: 15:45
 */
public class Arena extends ApiNamedEntity {
    private String articleName;
    private Coordinates rt90coordinates;
    private Position position;
    private String city;

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

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
