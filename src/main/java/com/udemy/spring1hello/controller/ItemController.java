package com.udemy.spring1hello.controller;

import org.springframework.web.bind.annotation.RestController;
import com.udemy.spring1hello.models.Item;
import com.udemy.spring1hello.services.ItemService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
public class ItemController {
  @Autowired
  private ItemService itemService;

  @GetMapping("/items")
  public List<Item> getAllItems() {
    return itemService.getAllItems();
  }

  @PostMapping("/items")
  public void addItem(@RequestBody Item item) {
      itemService.addItem(item);
  }
}
