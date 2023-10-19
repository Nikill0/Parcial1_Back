package com.facu.restfake.services;

import com.facu.restfake.entities.Autor;
import com.facu.restfake.repositories.AutorRepository;
import com.facu.restfake.repositories.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AutorService extends BaseServiceImpl<Autor, Long>{
    @Autowired
    private AutorRepository autorRepository;
    public AutorService(BaseRepository<Autor, Long> baseRepository , AutorRepository autorRepository ) {
        super(baseRepository);
        this.autorRepository=autorRepository;
    }
}
