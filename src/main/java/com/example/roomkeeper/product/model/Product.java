package com.example.roomkeeper.product.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name="product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="name")
    private String name;

    @Column(name="quantity")
    private Long quantity;

    @Column(name="storage_id")
    private Long storage_id;

    @Column(name="category_id")
    private Long category_id;

    @Column(name="purchase_price")
    private LocalDate purchaseDate;

    @Column(name="expiration_date")
    private LocalDate expirationDate;

    @Enumerated(EnumType.STRING)
    private Unit unit;



    //konstruktory


    public Product(Long id, String name, Long quantity, Long storage_id, Long category_id, LocalDate purchaseDate, LocalDate expirationDate, Unit unit) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.storage_id = storage_id;
        this.category_id = category_id;
        this.purchaseDate = purchaseDate;
        this.expirationDate = expirationDate;
        this.unit = unit;
    }

    public Product() {
    }


    //gettery

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Long getQuantity() {
        return quantity;
    }

    public Long getStorage_id() {
        return storage_id;
    }

    public Long getCategory_id() {
        return category_id;
    }

    public LocalDate getPurchaseDate() {
        return purchaseDate;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public Unit getUnit() {
        return unit;
    }


    //settery


    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public void setStorage_id(Long storage_id) {
        this.storage_id = storage_id;
    }

    public void setCategory_id(Long category_id) {
        this.category_id = category_id;
    }

    public void setPurchaseDate(LocalDate purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    public void setUnit(Unit unit) {
        this.unit = unit;
    }
}
