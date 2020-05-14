package com.revature.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.revature.dao.GroceryItemInterface;
import com.revature.model.GroceryItem;

@Service
public class GroceryItemServ{

  @Autowired
  GroceryItemInterface itemDAO;
  
  public GroceryItem insert(GroceryItem item) {
    return itemDAO.save(item);
  }
  
  public String delete(Integer id) {
    itemDAO.deleteById(id);
    return "the item has been deleted from your list";
  }
  
  public List <GroceryItem> findById(Integer id){
    return itemDAO.findGroceryItemBylist_id(id);
  }
}
