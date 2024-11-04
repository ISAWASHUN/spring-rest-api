package com.udemy.spring1hello.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.udemy.spring1hello.models.Item;
import com.udemy.spring1hello.repository.ItemRepository;

@Service
public class ItemService {
  
  @Autowired
  private ItemRepository itemRepository;

  public List<Item> getAllItems() {
    List<Item> allItems = new ArrayList<>();
    itemRepository.findAll().forEach(allItems::add);
    return allItems;
  }

  public Optional<Item> getItem(Long id) {
    return itemRepository.findById(id);
  }

  public void addItem(Item item) {
    itemRepository.save(item);
  }

  public void updateItem(Long id, Item item) {
    if (itemRepository.existsById(id)) {
      itemRepository.save(item);
    }
  }

  public void deleteItem(Long itemId) {
    itemRepository.deleteById(itemId);
  }
}
