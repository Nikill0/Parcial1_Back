package com.facu.restfake.services;

import com.facu.restfake.entities.Libro;
import com.facu.restfake.repositories.BaseRepository;
import com.facu.restfake.repositories.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LibroService extends BaseServiceImpl<Libro, Long> {
    @Autowired
    private LibroRepository libroRepository;

    public LibroService(BaseRepository<Libro, Long> baseRepository, LibroRepository libroRepository) {
        super(baseRepository);
        this.libroRepository=libroRepository;
    }
}
