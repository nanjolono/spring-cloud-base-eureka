package com.nanjolono.provider8081.service;

import com.nanjolono.provider8081.bean.Depart;
import org.springframework.stereotype.Service;

import java.util.List;

public interface DepartService {
    boolean saveDepart(Depart depart);
    boolean removeDepartById(int id);
    boolean modifyDepart(Depart depart);
    Depart getDepartById(int id);
    List<Depart> listAllDeparts();
}
