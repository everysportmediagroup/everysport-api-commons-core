package com.everysport.api.domain.api;

public class CategoryResponse extends ApiBaseResponse {
    private Category category;

    public CategoryResponse() {
    }

    public CategoryResponse(Category category) {
        this.category = category;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
