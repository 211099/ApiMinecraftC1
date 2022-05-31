package com.example.demo.Controllers;

import com.example.demo.Entities.Mob;
import com.example.demo.Services.MobServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("mob")
public class MobController {

    @Autowired
    private MobServices services;

    @GetMapping
    List<Mob> getList(){
        return services.getList();
    }


}
