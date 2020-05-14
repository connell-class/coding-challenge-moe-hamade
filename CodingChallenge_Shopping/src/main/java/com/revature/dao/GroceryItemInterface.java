package com.revature.dao;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.revature.model.GroceryItem;



public interface GroceryItemInterface extends JpaRepository<GroceryItem, Integer> {

  List<GroceryItem> findGroceryItemBylist_id(int id);
}
