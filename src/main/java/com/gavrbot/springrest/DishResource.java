package com.gavrbot.springrest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
public class DishResource {
    @Autowired
    DishRepository repo;

    @GetMapping(value = "/get")
    public List<Dish> findAll() {
        List<Dish> dishes = (List<Dish>) repo.findAll();
        return dishes;
    }

    @PostMapping("/add")
    public Dish createDish(@RequestBody Dish dish) {
        repo.save(dish);
        System.out.println("Created dish:" + dish);

        return dish;
    }

    @GetMapping("/get/{id}")
    public Optional<Dish> findById(@PathVariable("id") int id) {
        return repo.findById(id);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable("id") int id) {
        System.out.println("Deleted dish with id:" + id);
        repo.deleteById(id);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity updateDish(@RequestBody Dish newDish,@PathVariable("id") int id) {
        Dish dishFinded = repo.findById(id).get();
        if(dishFinded != null){
            dishFinded.setName(newDish.getName());
            dishFinded.setPrice(newDish.getPrice());
            dishFinded.setCategory(newDish.getCategory());
            System.out.println("Updated dish with id: "+dishFinded.getId());
            return ResponseEntity.ok(repo.save(dishFinded));
        }
        return ResponseEntity.notFound().build();
    }
}