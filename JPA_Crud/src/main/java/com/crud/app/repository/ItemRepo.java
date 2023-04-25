package com.crud.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.app.model.ItemModel;

public interface ItemRepo extends JpaRepository<ItemModel, Integer> {

}
