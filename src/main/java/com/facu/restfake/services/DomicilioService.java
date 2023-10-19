package com.facu.restfake.services;

import com.facu.restfake.entities.Domicilio;
import com.facu.restfake.repositories.BaseRepository;
import com.facu.restfake.repositories.DomicilioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DomicilioService extends BaseServiceImpl<Domicilio, Long> {
    @Autowired
    private DomicilioRepository domicilioRepository;

    public DomicilioService(DomicilioRepository domicilioRepository, BaseRepository<Domicilio, Long> baseRepository) {
        super(baseRepository);
        this.domicilioRepository=domicilioRepository;
    }
}
