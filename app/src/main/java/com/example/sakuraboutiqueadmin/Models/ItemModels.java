package com.example.sakuraboutiqueadmin.Models;

import java.util.List;

public class ItemModels {
    private int ID,Price;
    private String Name,Brand,Description;
    private List<String> Size,Color,Photos;

    public ItemModels(int ID, int price, String name, String brand, String description, List<String> size, List<String> color, List<String> photos) {
        this.ID = ID;
        Price = price;
        Name = name;
        Brand = brand;
        Description = description;
        Size = size;
        Color = color;
        Photos = photos;
    }

    public int getID() {
        return ID;
    }

    public int getPrice() {
        return Price;
    }

    public String getName() {
        return Name;
    }

    public String getBrand() {
        return Brand;
    }

    public String getDescription() {
        return Description;
    }

    public List<String> getSize() {
        return Size;
    }

    public List<String> getColor() {
        return Color;
    }

    public List<String> getPhotos() {
        return Photos;
    }
}
