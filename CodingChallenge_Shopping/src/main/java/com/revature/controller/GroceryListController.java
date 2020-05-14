package com.revature.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.revature.model.GroceryItem;
import com.revature.model.GroceryList;
import com.revature.service.GroceryItemServ;
import com.revature.service.GroceryListServ;

@RestController
@RequestMapping("/grocerylist")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class GroceryListController {

  @Autowired
  GroceryListServ listServ;
  
  @Autowired
  GroceryItemServ itemServ;
  
  @GetMapping
  public List<GroceryList> List(){
    return listServ.findAll();
  }
  
  @PostMapping
  public GroceryList insert(@RequestBody GroceryList gl) {
    return listServ.insert(gl);
  }
  
  
  @PostMapping("/item")
  public GroceryItem insert(@RequestBody GroceryItem gl) {
    return itemServ.insert(gl);
  }
  
  
  @GetMapping("/{id}")
  public List <GroceryItem> listItem(@PathVariable("id") int id){
    return itemServ.findById(id);
  }
  
  @DeleteMapping("item/{id}")
  public String deleteItem(@PathVariable("id") int id) {
    return itemServ.delete(id);
  }
  
  @DeleteMapping("item/{id}")
  public String deleteList(@PathVariable("id") int id) {
    return listServ.delete(id);
  }
  
}
