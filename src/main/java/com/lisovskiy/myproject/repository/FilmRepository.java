package com.lisovskiy.myproject.repository;

import com.lisovskiy.myproject.entity.Film;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FilmRepository extends CrudRepository<Film, Integer> {

    List<Film> findAll();

}
