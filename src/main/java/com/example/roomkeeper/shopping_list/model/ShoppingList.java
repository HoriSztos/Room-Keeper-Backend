package com.example.roomkeeper.shopping_list.model;


import jakarta.persistence.*;

@Entity
@Table(name="shopping_list")
public class ShoppingList {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="product_id")
    private Long productId;

    @Column(name="needed_quantity")
    private Long neededQuantity;

    //konstruktory


    public ShoppingList() {
    }

    public ShoppingList(Long id, Long productId, Long neededQuantity) {
        this.id = id;
        this.productId = productId;
        this.neededQuantity = neededQuantity;
    }


    //gettery


    public Long getId() {
        return id;
    }

    public Long getProductId() {
        return productId;
    }

    public Long getNeededQuantity() {
        return neededQuantity;
    }


    //settery


    public void setId(Long id) {
        this.id = id;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public void setNeededQuantity(Long neededQuantity) {
        this.neededQuantity = neededQuantity;
    }
}
