package com.crud.app.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.crud.app.model.ItemModel;
import com.crud.app.services.ItemService;

@RestController
public class ItemController {

	@Autowired
	ItemService i_ser;
	@PostMapping("/savepost")
	public ItemModel addDetails(@RequestBody ItemModel item_id)
	{
		return i_ser.saveInfo(item_id);
	}
	@GetMapping("/gethm/{item_id}")
	public Optional<ItemModel> getDetails(@PathVariable("id") int id)
	{
		return i_ser.getInfo(item_id);
	}
	@PutMapping("/puthm")
	public ItemModel updateDetails(@RequestBody ItemModel item_id)
	{
		return i_ser.updateInfo(item_id);
	}
	@DeleteMapping("/delhm/{item_id}")
	public void deleteDetails(@PathVariable ("item_id") int item_id)
	{
		i_ser.deleteInfo(item_id);
	}
}
