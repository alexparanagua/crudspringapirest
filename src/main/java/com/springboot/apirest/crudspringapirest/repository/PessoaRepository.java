package com.springboot.apirest.crudspringapirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.apirest.crudspringapirest.entity.Pessoa;

@Repository
public interface PessoaRepository extends JpaRepository<Pessoa,Long> {
    
}
