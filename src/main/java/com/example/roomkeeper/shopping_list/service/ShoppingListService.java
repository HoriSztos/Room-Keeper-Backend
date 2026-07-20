package com.example.roomkeeper.shopping_list.service;

import com.example.roomkeeper.shopping_list.model.ShoppingList;
import com.example.roomkeeper.shopping_list.repository.ShoppingListRepository;

public class ShoppingListService {
    private final ShoppingListRepository shoppingListRepository;

    public ShoppingListService(ShoppingListRepository shoppingListRepository) {this.shoppingListRepository = shoppingListRepository;}

    public ShoppingList add(ShoppingList s) { return shoppingListRepository.save(s); }
}
