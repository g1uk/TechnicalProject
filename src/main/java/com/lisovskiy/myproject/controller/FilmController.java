package com.lisovskiy.myproject.controller;

import com.lisovskiy.myproject.entity.Film;
import com.lisovskiy.myproject.service.impl.FilmServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FilmController {

    private final FilmServiceImpl filmService;

    public FilmController(FilmServiceImpl filmService) {
        this.filmService = filmService;
    }

    @GetMapping
    public List<Film> findAll() {
        return filmService.findAll();
    }

}
