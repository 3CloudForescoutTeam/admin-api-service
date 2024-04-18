package com.cysiv.admin.service;

import com.azure.security.keyvault.secrets.SecretClient;
import com.cysiv.caching.service.CacheDataService;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class AdminService {

    private final CacheDataService cacheDataService;
    private final SecretClient secretClient;

    @PostConstruct
    public void getData(String secretName, String cacheDataKey) {

        log.info("getting secret {}", secretName);
        String secretValue = String.valueOf(secretClient.getSecret(secretName));

        log.info("getting cache data {}", secretName);
        String cacheDataValue = cacheDataService.getCacheData(cacheDataKey);
    }
}
