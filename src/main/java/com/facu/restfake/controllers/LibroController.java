package com.facu.restfake.controllers;

import com.facu.restfake.entities.Libro;
import com.facu.restfake.services.LibroService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
@RequestMapping(path = "/api/libro")
public class LibroController extends BaseControllerImpl<Libro, LibroService> {
}
