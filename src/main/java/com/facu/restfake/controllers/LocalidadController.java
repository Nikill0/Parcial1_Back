package com.facu.restfake.controllers;

import com.facu.restfake.entities.Localidad;
import com.facu.restfake.services.LocalidadService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
@RequestMapping(path = "/api/localidad")
public class LocalidadController extends BaseControllerImpl<Localidad, LocalidadService>{
}
