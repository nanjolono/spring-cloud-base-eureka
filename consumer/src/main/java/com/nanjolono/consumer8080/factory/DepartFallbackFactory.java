package com.nanjolono.consumer8080.factory;

import com.nanjolono.consumer8080.bean.Depart;
import com.nanjolono.consumer8080.service.DepartService;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @program: nanjolono-parent
 * @description: factory
 * @author: nanjolono
 * @create: 2020-11-03 22:31
 **/
@Component
public class DepartFallbackFactory implements FallbackFactory<DepartService> {
    @Override
    public DepartService create(Throwable throwable) {
        return new DepartService() {
            @Override
            public boolean saveDepart(Depart depart) {
                System.out.println("服务降级处理");
                return false;
            }

            @Override
            public boolean removeDepartById(int id) {
                System.out.println("服务降级处理");
                return false;
            }

            @Override
            public boolean modifyDepart(Depart depart) {
                System.out.println("服务降级处理");
                return false;
            }

            @Override
            public Depart getDrpartById(int id) {
                System.out.println("服务降级处理");
                return null;
            }

            @Override
            public List<Depart> listAllDeparts() {
                System.out.println("服务降级处理");
                return null;
            }
        };
    }
}
