package com.everysport.api.domain.api;

import java.util.LinkedList;
import java.util.List;

public class CategoriesResponse extends ApiListResponse {
    private List<Category> categories = new LinkedList<Category>();

    public CategoriesResponse() {
    }

    public CategoriesResponse(List<Category> categories) {
        this.categories = categories;
    }

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }
}
