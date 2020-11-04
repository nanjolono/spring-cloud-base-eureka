package com.nanjolono.consumer8080.service;

import com.nanjolono.consumer8080.bean.Depart;
import com.nanjolono.consumer8080.factory.DepartFallbackFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @program: nanjolono-parent
 * @description: departService
 * @author: nanjolono
 * @create: 2020-11-02 23:34
 **/
@Service
@FeignClient(value = "nanjolono-provider-8081" ,fallbackFactory = DepartFallbackFactory.class)
@RequestMapping("/provider/depart")
public interface DepartService {
    @PostMapping("/save")
    boolean saveDepart(Depart depart);
    @DeleteMapping("/del/{id}")
    boolean removeDepartById(@PathVariable("id") int id);
    @PutMapping("/update")
    boolean modifyDepart(Depart depart);
    @GetMapping("/get/{id}")
    Depart getDrpartById(@PathVariable("id") int id);
    @GetMapping("/list")
    List<Depart> listAllDeparts();
}
