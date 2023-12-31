package com.example.ecommerceapp.models;

import java.io.Serializable;

public class PopularProductsModel implements Serializable {
    String img_url;
    String description;
    String name;
    String rating;
    int price;
    String type;

    public PopularProductsModel() {
    }

    public PopularProductsModel(String img_url, String description, String name, String rating, int price, String type) {
        this.img_url = img_url;
        this.description = description;
        this.name = name;
        this.rating = rating;
        this.price = price;
        this.type = type;
    }

    public PopularProductsModel(String img_url, String description, String name, String rating, int price) {
        this.img_url = img_url;
        this.description = description;
        this.name = name;
        this.rating = rating;
        this.price = price;
    }

    public String getImg_url() {
        return img_url;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setImg_url(String img_url) {
        this.img_url = img_url;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
