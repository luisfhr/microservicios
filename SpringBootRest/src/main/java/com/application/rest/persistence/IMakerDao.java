package com.application.rest.persistence;

import com.application.rest.entities.Maker;

import java.util.List;
import java.util.Optional;

public interface IMakerDao {

    List<Maker> findAll();

    void save(Maker maker);

    Optional<Maker> findById(Long id);

    void deleteById(Long id);
}
