package com.facu.restfake.controllers;

import com.facu.restfake.entities.Domicilio;
import com.facu.restfake.services.DomicilioService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
@RequestMapping(path = "/api/domicilio")
public class DomicilioController extends BaseControllerImpl<Domicilio, DomicilioService>{
}
