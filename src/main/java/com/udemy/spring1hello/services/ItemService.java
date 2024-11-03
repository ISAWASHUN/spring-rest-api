package com.udemy.spring1hello.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.udemy.spring1hello.models.Item;

@Service
public class ItemService {
  private List<Item> allItems = new ArrayList<>(Arrays.asList(
      new Item(1, "Item1", "Category1"),
      new Item(2, "Item2", "Category2"),
      new Item(3, "Item3", "Category3")
    ));

  public List<Item> getAllItems() {
    return allItems;
  }

  public void addItem(Item item) {
    allItems.add(item);
  }

  public void updateItem(int id, Item item) {
    for (int i = 0; i < allItems.size(); i++) {
      Item currentItem = allItems.get(i);
      if (currentItem.getItemId() == id) {
        allItems.set(i, item);
        return;
      }
    }
  }

  public void deleteItem(String itemId) {
    allItems.removeIf(item -> item.getItemId() == Integer.parseInt(itemId));
  }
}
