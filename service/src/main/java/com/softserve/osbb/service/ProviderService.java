package com.softserve.osbb.service;

import com.softserve.osbb.model.Provider;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Anastasiia Fedorak on 12.07.2016.
 */

@Service
public interface ProviderService {

    void saveProvider(Provider provider);

    void saveProviderList(List<Provider> providerList);

    Provider findOneProviderById(Integer id);

    List<Provider> findAllProvidersByIds(List<Integer> ids);

    List<Provider> findAllProviders();

    void deleteProvider(Provider provider);

    void deleteProviderById(Integer id);

    void deleteListOfProviders(List<Provider> providerList);

    void deleteAllProviders();

    long countProviders();

    boolean existsProvider(Integer id);

    Provider updateProvider(Integer providerId, Provider provider) throws Exception;

    List<Provider> findProvidersByNameOrDescription(String name);

}
