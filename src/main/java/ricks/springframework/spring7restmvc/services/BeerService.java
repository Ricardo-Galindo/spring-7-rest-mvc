package ricks.springframework.spring7restmvc.services;


import ricks.springframework.spring7restmvc.model.Beer;
import ricks.springframework.spring7restmvc.model.BeerStyle;

import java.util.List;
import java.util.UUID;

public interface BeerService {

    Beer getBeerById(UUID id);

    List<Beer> listBeers();

    Beer saveNewBeer(Beer beer);

    void updateBeerById(UUID beerId, Beer beer);

    void deteleById(UUID beerId);
}
