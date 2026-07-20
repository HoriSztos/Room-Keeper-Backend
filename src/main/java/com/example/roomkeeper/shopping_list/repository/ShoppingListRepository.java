package com.example.roomkeeper.shopping_list.repository;

import com.example.roomkeeper.shopping_list.model.ShoppingList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShoppingListRepository extends JpaRepository<ShoppingList, Long> {
}
