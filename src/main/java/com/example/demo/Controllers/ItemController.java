package com.example.demo.Controllers;

import com.example.demo.Entities.Item;
import com.example.demo.Services.ItemServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/addItem")
    public Item add(@RequestBody @Validated Item item){
        System.out.println("Entre");
        return  itemServices.add(item);
    }

    @PutMapping("/modifi")
    public Item modify(@RequestBody @Validated Item item){
        return  itemServices.modify(item);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") int id){
        itemServices.delete(id);
    }
}
