package com.nanjolono.provider8081.repository;

import com.nanjolono.provider8081.bean.Depart;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @program: nanjolono-parent
 * @description: departRepository
 * @author: nanjolono
 * @create: 2020-11-02 19:33
 **/
public interface DepartRepository extends JpaRepository<Depart,Integer> {
}
