package com.softserve.osbb.service;

import com.softserve.osbb.model.Osbb;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Roman on 08.07.2016.
 */

@Service
public interface OsbbService {

    Osbb addOsbb(Osbb osbb);

    Osbb getOsbb(Integer id);

    Osbb getOsbb(String name);

    List<Osbb> getAllOsbb();

    List<Osbb> getAllByOrder(String sortedBy, Boolean ascOrder);

    List<Osbb> findByAvailable(Boolean available);

    List<Osbb> findByNameContaining(String name);

    long countOsbb();

    boolean existsOsbb(Integer id);

    Osbb updateOsbb(Osbb osbb);

    void deleteOsbb(Integer id);

    void deleteOsbb(Osbb osbb);

}
