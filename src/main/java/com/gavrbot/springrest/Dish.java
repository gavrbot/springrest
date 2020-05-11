package com.gavrbot.springrest;

import javax.persistence.*;

@Entity
@Table(name = "dishes_table")
public class Dish {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @PrimaryKeyJoinColumn
    private int id;
    private String name;
    private double price;
    private String category;

    public Dish() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("Id:" + id + " Dish:" + name + " Price:" + price + " Category:" + category);
        return new String(stringBuffer);
    }
}
