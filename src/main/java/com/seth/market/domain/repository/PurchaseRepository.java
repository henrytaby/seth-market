package com.seth.market.domain.repository;

import com.seth.market.domain.Purchase;

import java.util.List;
import java.util.Optional;

public interface PurchaseRepository {
    List<Purchase> getAll();
    Optional<List<Purchase>>  getByClient(String clientId);
    Purchase save(Purchase purchase);
}
