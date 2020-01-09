package com.everysport.api.domain.api;

/**
 * User: Calle
 * Date: 2013-05-06
 * Time: 15:45
 */
public class Arena extends ApiNamedEntity {
    private String articleName;
    private Coordinates _coordinates;

    public String getArticleName() {
        return articleName;
    }

    public void setArticleName(String articleName) {
        this.articleName = articleName;
    }

    public Coordinates get_Coordinates() {
        return _coordinates;
    }

    public void set_Coordinates(Coordinates _coordinates) {
        this._coordinates = _coordinates;
    }
}
