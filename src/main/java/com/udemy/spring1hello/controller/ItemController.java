package com.udemy.spring1hello.controller;

import org.springframework.web.bind.annotation.RestController;
import com.udemy.spring1hello.models.Item;
import com.udemy.spring1hello.services.ItemService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class ItemController {
  @Autowired
  private ItemService ItemService;

  @GetMapping("/item")
  public List<Item> getAllItems() {
    return ItemService.getAllItems();
  }
}
