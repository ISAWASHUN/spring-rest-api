package com.udemy.spring1hello.controller;

import org.springframework.web.bind.annotation.RestController;

import com.udemy.spring1hello.exception.ItemNotFoundException;
import com.udemy.spring1hello.models.Item;
import com.udemy.spring1hello.services.ItemService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class ItemController {
  @Autowired
  private ItemService itemService;

  @GetMapping("/items")
  public List<Item> getAllItems() {
    return itemService.getAllItems();
  }

  @GetMapping("/items/{itemId}")
  public Item getItem(@PathVariable("itemId") Long itemId) {
    return itemService.getItem(itemId).orElseThrow(() -> new ItemNotFoundException(itemId));
  }

  @PostMapping("/items")
  public void addItem(@RequestBody Item item) {
      itemService.addItem(item);
  }

  @PutMapping("items/{id}")
  public void updateItem(
    @RequestBody Item item,
    @PathVariable Long id
    ) {
      itemService.updateItem(id, item);
  }

  @DeleteMapping("items/{id}")
  public void deleteItem(@PathVariable Long itemId) {
    itemService.deleteItem(itemId);
  }
}
