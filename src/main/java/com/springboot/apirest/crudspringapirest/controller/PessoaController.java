package com.springboot.apirest.crudspringapirest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.apirest.crudspringapirest.entity.Pessoa;
import com.springboot.apirest.crudspringapirest.repository.PessoaRepository;

@RestController
public class PessoaController {
    
    @Autowired
    private PessoaRepository repository;

    @GetMapping(value = "/pessoa")
    public List<Pessoa> getPessoas(){
        return repository.findAll();
    }

    @GetMapping(value = "/pessoa/0")
    public String getPessoaFirst(){
        return repository.findAll().get(0).getNome();
    }

}
