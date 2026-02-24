package ricks.springframework.spring7restmvc.services;


import ricks.springframework.spring7restmvc.model.Beer;

import java.util.UUID;

public interface BeerService {

    Beer getBeerById(UUID id);

}
