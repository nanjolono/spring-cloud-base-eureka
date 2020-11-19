package com.nanjolono.provider8081.bean;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @program: nanjolono-parent
 * @description: depart
 * @author: nanjolono
 * @create: 2020-11-02 19:30
 **/
@Data
@Entity
@JsonIgnoreProperties()
public class Depart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String dbase;
}
