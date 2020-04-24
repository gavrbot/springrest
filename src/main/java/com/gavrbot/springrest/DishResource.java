package com.gavrbot.springrest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class DishResource {
    @Autowired
    DishRepository repo;

    @GetMapping(value = "dishes")
    public List<Dish> findAll(){
        List<Dish> dishes = (List<Dish>) repo.findAll();
        return dishes;
    }

    @PostMapping("dish")
    public Dish createDish(@RequestBody Dish dish){
        repo.save(dish);
        System.out.println(dish);
        return dish;
    }

    @GetMapping("dish/{id}")
    public Optional<Dish> findById(@PathVariable("id")int id){
        return repo.findById(id);
    }

    @DeleteMapping("dish/{id}")
    public void deleteById(@PathVariable("id") int id){
        repo.deleteById(id);
    }

    @DeleteMapping("dish")
    public void delete(@RequestBody Dish dish){
        repo.delete(dish);
    }
}