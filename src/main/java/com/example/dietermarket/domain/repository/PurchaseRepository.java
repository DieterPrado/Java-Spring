package com.example.dietermarket.domain.repository;

import com.example.dietermarket.domain.Purchase;

import java.util.List;
import java.util.Optional;

public interface PurchaseRepository {
    List<Purchase> getAll();
    Optional< List<Purchase>> getByClient(String clientId);
    Purchase save(Purchase purchase);
}
