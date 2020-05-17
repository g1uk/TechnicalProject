package com.lisovskiy.myproject.service.impl;

import com.lisovskiy.myproject.entity.Film;
import com.lisovskiy.myproject.repository.FilmRepository;
import com.lisovskiy.myproject.service.FilmService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Service
public class FilmServiceImpl implements FilmService {

    private final FilmRepository filmRepository;

    public FilmServiceImpl(FilmRepository filmRepository) {
        this.filmRepository = filmRepository;
    }

    @PersistenceContext
    EntityManager entityManager;

    @Transactional
    public Film create(Film film) {
//        List<Film> films = filmRepository.findAll();
//        for (Film temp : films
//             ) {
//            if (temp.getTitle().equals(film.getTitle())) {
//                System.out.println("error");
//            } else
//        }
        entityManager.persist(film);
        return film;
    }

    public List<Film> findAll() {
        return filmRepository.findAll();
    }

}
