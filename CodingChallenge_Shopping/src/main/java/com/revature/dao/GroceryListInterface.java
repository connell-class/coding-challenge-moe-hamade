package com.revature.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.revature.model.GroceryList;

public interface GroceryListInterface extends JpaRepository<GroceryList, Integer> {

}
