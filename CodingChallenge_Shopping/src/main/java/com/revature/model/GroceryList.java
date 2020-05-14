package com.revature.model;

import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "grocery_list")
public class GroceryList {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int groceryListId;
  
  @OneToMany(cascade = { CascadeType.ALL }, mappedBy = "groceryList")
  private Set<GroceryItem>  groceryItem;
  
  @Column
  private String title;

  public int getGroceryListId() {
    return groceryListId;
  }

  public void setGroceryListId(int groceryListId) {
    this.groceryListId = groceryListId;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public GroceryList(int groceryListId, Set<GroceryItem> groceryItem, String title) {
    super();
    this.groceryListId = groceryListId;
    this.groceryItem = groceryItem;
    this.title = title;
  }

  public GroceryList() {
    super();
    // TODO Auto-generated constructor stub
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((groceryItem == null) ? 0 : groceryItem.hashCode());
    result = prime * result + groceryListId;
    result = prime * result + ((title == null) ? 0 : title.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    GroceryList other = (GroceryList) obj;
    if (groceryItem == null) {
      if (other.groceryItem != null)
        return false;
    } else if (!groceryItem.equals(other.groceryItem))
      return false;
    if (groceryListId != other.groceryListId)
      return false;
    if (title == null) {
      if (other.title != null)
        return false;
    } else if (!title.equals(other.title))
      return false;
    return true;
  }

  @Override
  public String toString() {
    return "GroceryList [groceryListId=" + groceryListId + ", groceryItem=" + groceryItem
        + ", title=" + title + "]";
  }
 
  
}
  
 