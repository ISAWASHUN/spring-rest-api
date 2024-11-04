package com.udemy.spring1hello.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.udemy.spring1hello.models.Item;

@Repository
public interface ItemRepository extends CrudRepository<Item, Long> {
  
}
