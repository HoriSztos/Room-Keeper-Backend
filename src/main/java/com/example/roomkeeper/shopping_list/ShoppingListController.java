package com.example.roomkeeper.shopping_list;


import com.example.roomkeeper.shopping_list.model.ShoppingList;
import com.example.roomkeeper.shopping_list.service.ShoppingListService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/shopping_list")
public class ShoppingListController {
    private final ShoppingListService shoppingListService;

    public ShoppingListController(ShoppingListService shoppingListService) {
        this.shoppingListService = shoppingListService;
    }

    @PostMapping
    public ShoppingList add(@RequestBody ShoppingList s) {
        return shoppingListService.add(s);
    }
}
