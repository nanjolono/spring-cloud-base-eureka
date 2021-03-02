package com.nanjolono.provider8081.service.impl;

import com.nanjolono.provider8081.repository.DepartRepository;
import com.nanjolono.provider8081.bean.Depart;
import com.nanjolono.provider8081.service.DepartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: nanjolono-parent
 * @description: departServiceImpl
 * @author: nanjolono
 * @create: 2020-11-02 19:37
 **/
@Service
public class DepartServiceImpl implements DepartService {

    @Autowired
    private DepartRepository departRepository;

    @Override
    public boolean saveDepart(Depart depart) {
        Depart obj = departRepository.save(depart);
        return obj != null;
    }

    @Override
    public boolean removeDepartById(int id) {
        if(departRepository.existsById(id)){
            departRepository.deleteById(id);
        }
        return false;
    }

    @Override
    public boolean modifyDepart(Depart depart) {
        Depart save = departRepository.save(depart);
        return save != null;
    }

    @Override
    public Depart getDepartById(int id) {
        return null;
    }

    @Override
    public List<Depart> listAllDeparts() {
        return departRepository.findAll();
    }
}
