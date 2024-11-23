package com.udemy.spring1hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.udemy.spring1hello.models.Item;
import com.udemy.spring1hello.repository.ItemRepository;

@SpringBootApplication
public class Spring1helloApplication implements CommandLineRunner {

	@Autowired
	private ItemRepository itemRepository;

	public static void main(String[] args) {
		SpringApplication.run(Spring1helloApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		itemRepository.save(new Item("ネックレス", "ジュエリー"));
		itemRepository.save(new Item("パーカー", "ファッション"));
		itemRepository.save(new Item("フェイスクリーム", "ビューティー"));
		itemRepository.save(new Item("ブルーベリー", "フード"));
	}
}
