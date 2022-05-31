package com.example.demo.Controllers;

import com.example.demo.Entities.Item;
import com.example.demo.Services.ItemServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("Item")
public class ItemController {

    @Autowired
    private ItemServices itemServices;
    @GetMapping("list")
    public List<Item> listItem(){
        return itemServices.getItem();
    }
}
