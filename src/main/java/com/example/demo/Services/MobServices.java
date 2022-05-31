package com.example.demo.Services;

import com.example.demo.Entities.Mob;
import com.example.demo.Repositories.IMobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MobServices {

    @Autowired
    private IMobRepository crudService;

    public List<Mob> getList(){return  crudService.findAll(); }
}
