package com.revature.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.revature.dao.GroceryListInterface;
import com.revature.model.GroceryList;

@Service
public class GroceryListServ {

  @Autowired
  GroceryListInterface listDAO;
  
  public GroceryList insert(GroceryList list) {
    return listDAO.save(list);
  }
  
  public String delete(Integer id) {
    listDAO.deleteById(id);
    return "the list has been deleted";
  }
  
  public List <GroceryList> findAll(){
    return listDAO.findAll();
  }
  
  public List<GroceryList> findById(Integer id){
    List<Integer> list = new ArrayList<Integer>();
    list.add(id);
    return listDAO.findAllById(list);
  }
  
  
}
