package com.gavrbot.springrest;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
@Table(name = "dishes_table")
@JsonPropertyOrder({"id","name","price","category"})
public class Dish {
    @Id
    @PrimaryKeyJoinColumn
    private int id;
    private String name;
    private double price;
    private String category;

    public Dish(){}

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

    public String toString()
    {
        StringBuffer stringBuffer = new StringBuffer("Id:"+id+" Dish:"+ name +" Price:"+ price +" Category:"+ category);
        return new String(stringBuffer);
    }
}
