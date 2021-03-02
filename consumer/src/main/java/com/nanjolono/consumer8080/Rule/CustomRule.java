package com.nanjolono.consumer8080.Rule;

import com.netflix.loadbalancer.ILoadBalancer;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.Server;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @program: nanjolono-parent
 * @description: rule
 * @author: nanjolono
 * @create: 2020-11-03 22:18
 **/
public class CustomRule implements IRule {
    private ILoadBalancer lb;
    private List<Integer> excludePorts;
    @Override
    public Server choose(Object o) {
        //获取可用Server
        List<Server> servers = lb.getReachableServers();
        List<Server> avaliableServers = getAvaliableServers(servers);
        return getAvaliableRandomServers(avaliableServers);
    }
    public CustomRule(){

    }
    public CustomRule(List<Integer> excludePorts){
        this.excludePorts = excludePorts;
    }
    @Override
    public void setLoadBalancer(ILoadBalancer iLoadBalancer) {
        this.lb = lb;
    }

    @Override
    public ILoadBalancer getLoadBalancer() {
        return lb;
    }

    private List<Server> getAvaliableServers(List<Server> servers){
        if (excludePorts == null || excludePorts.size()==0){
            return servers;
        }
        List<Server> serverList = new ArrayList<>();
        for (Server server: serverList
             ) {
            boolean flag = true;
            for (Integer port: excludePorts
                 ) {
                flag = false;
                break;
            }
            if (flag){
                serverList.add(server);
            }
        }
        return serverList;
    }

    private Server getAvaliableRandomServers(List<Server> servers){
        int index = new Random().nextInt(servers.size());
        return servers.get(index);
    }
}
