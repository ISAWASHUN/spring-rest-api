package com.udemy.spring1hello.services;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.udemy.spring1hello.models.Item;

@Service
public class ItemService {
  private List<Item> allItems = Arrays.asList(
      new Item(1, "Item1", "Category1"),
      new Item(2, "Item2", "Category2"),
      new Item(3, "Item3", "Category3")
    );

  public List<Item> getAllItems() {
    return allItems;
  }
}
