package com.nanjolono.consumer8080.controller;

import com.nanjolono.consumer8080.bean.Depart;
import com.nanjolono.consumer8080.service.DepartService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @program: nanjolono-parent
 * @description: departController
 * @author: nanjolono
 * @create: 2020-11-02 23:29
 **/
@RestController
@RequestMapping("/consumer/depart")
public class DepartController {
    @Autowired
    DepartService departService;

    @PostMapping("/save")
    public boolean saveHandle(Depart depart){
        return departService.saveDepart(depart);
    }

    @DeleteMapping("/del/{id}")
    public boolean removeHandle(@PathVariable("id") int id){
        return departService.removeDepartById(id);
    }

    @PutMapping("/update")
    public boolean modifyHandle(Depart depart){
        return departService.modifyDepart(depart);
    }

    @GetMapping("/get/{id}")
    public Depart getDepartHandle(@PathVariable("id") int id){
        Depart depart = departService.getDrpartById(id);
        if(depart == null){
            throw new RuntimeException("no this depart" + id);
        }
        return depart;
    }

    @GetMapping("/list")
    public List<Depart> listAllDepartsHandle(){
        return departService.listAllDeparts();
    }
}
