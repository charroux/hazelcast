package com.example.caching;

import com.hazelcast.client.HazelcastClient;
import com.hazelcast.client.config.ClientConfig;
import com.hazelcast.config.GroupConfig;
import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.security.UsernamePasswordCredentials;
import com.hazelcast.spring.cache.HazelcastCacheManager;
import org.springframework.cache.CacheManager;
import org.springframework.cache.interceptor.KeyGenerator;
import org.springframework.cache.interceptor.SimpleKeyGenerator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HazelcastConfig {

    @Bean
    ClientConfig clientConfig(){
        ClientConfig config = new ClientConfig();
        //config.getNetworkConfig().addAddress("127.0.0.1");
        config.getNetworkConfig().addAddress("hazelcast");
/*
        config.setCredentials(new UsernamePasswordCredentials("dev", "dev-pass"));
        GroupConfig groupConfig = config.getGroupConfig();
        groupConfig.setName("dev");*/
        return config;
    }

    @Bean
    KeyGenerator keyGenerator() {
        return new SimpleKeyGenerator();
    }

    @Bean
    public CacheManager cacheManager() {
        return new HazelcastCacheManager(hazelcastInstance());
    }

    @Bean
    public HazelcastInstance hazelcastInstance() {
        System.out.println("------------------------------------");
        System.out.println("------------------------------------");
        System.out.println("------------------------------------");
        System.out.println("------------------------------------");
        System.out.println("------------------------------------");
        // for client HazelcastInstance LocalMapStatistics will not available
        return HazelcastClient.newHazelcastClient(clientConfig());
        // return Hazelcast.newHazelcastInstance();
    }

}
