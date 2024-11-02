package com.udemy.spring1hello.models;

public class Item {
  private int itemId;
  private String itemName;
  private String itemCategory;

  // (int, String, String) コンストラクタの追加
  public Item(int itemId, String itemName, String itemCategory) {
    this.itemId = itemId;
    this.itemName = itemName;
    this.itemCategory = itemCategory;
  }

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

  public String getItemCategory() {
    return itemCategory;
  }

  public void setItemCategory(String itemCategory) {
    this.itemCategory = itemCategory;
  }
}
