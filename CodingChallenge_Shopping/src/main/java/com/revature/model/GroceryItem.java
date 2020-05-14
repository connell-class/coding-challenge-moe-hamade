package com.revature.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
@Table(name = "grocery_items")
public class GroceryItem {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int itemId;
  
  
  private String itemName;
  
  
  
  private String itemType;
  
  @OnDelete(action = OnDeleteAction.CASCADE)
  @ManyToOne
  @JoinColumn(name = "groceryList_id")
  private GroceryList groceryList;

  public int getItemId() {
    return itemId;
  }

  public void setItemId(int itemId) {
    this.itemId = itemId;
  }

  public String getItemName() {
    return itemName;
  }

  public void setItemName(String itemName) {
    this.itemName = itemName;
  }

  public String getItemType() {
    return itemType;
  }

  public void setItemType(String itemType) {
    this.itemType = itemType;
  }

  public GroceryList getGroceryList() {
    return groceryList;
  }

  public void setGroceryList(GroceryList groceryList) {
    this.groceryList = groceryList;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((groceryList == null) ? 0 : groceryList.hashCode());
    result = prime * result + itemId;
    result = prime * result + ((itemName == null) ? 0 : itemName.hashCode());
    result = prime * result + ((itemType == null) ? 0 : itemType.hashCode());
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
    GroceryItem other = (GroceryItem) obj;
    if (groceryList == null) {
      if (other.groceryList != null)
        return false;
    } else if (!groceryList.equals(other.groceryList))
      return false;
    if (itemId != other.itemId)
      return false;
    if (itemName == null) {
      if (other.itemName != null)
        return false;
    } else if (!itemName.equals(other.itemName))
      return false;
    if (itemType == null) {
      if (other.itemType != null)
        return false;
    } else if (!itemType.equals(other.itemType))
      return false;
    return true;
  }

  public GroceryItem(int itemId, String itemName, String itemType, GroceryList groceryList) {
    super();
    this.itemId = itemId;
    this.itemName = itemName;
    this.itemType = itemType;
    this.groceryList = groceryList;
  }

  public GroceryItem() {
    super();
    // TODO Auto-generated constructor stub
  }

  @Override
  public String toString() {
    return "GroceryItem [itemId=" + itemId + ", itemName=" + itemName + ", itemType=" + itemType
        + ", groceryList=" + groceryList + "]";
  }
  
  

}