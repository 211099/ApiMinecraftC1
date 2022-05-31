package com.example.demo.Services;

import com.example.demo.Entities.Item;
import com.example.demo.Repositories.IItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemServices {

    @Autowired
    private IItemRepository iItemRepository;

    public List<Item> getItem(){
        return iItemRepository.findAll();
    }
}
