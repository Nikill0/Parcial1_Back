package com.facu.restfake.controllers;

import com.facu.restfake.entities.Autor;
import com.facu.restfake.services.AutorService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
@RequestMapping(path = "/api/autor")
public class AutorController extends BaseControllerImpl<Autor, AutorService> {
}
