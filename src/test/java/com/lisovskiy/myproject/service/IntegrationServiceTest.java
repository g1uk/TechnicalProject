//package com.lisovskiy.myproject.service;
//
//import com.lisovskiy.myproject.config.ApplicationContextConfig;
//import com.lisovskiy.myproject.entity.Film;
//import com.lisovskiy.myproject.service.impl.FilmServiceImpl;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.test.annotation.DirtiesContext;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.junit.jupiter.SpringExtension;
//import org.springframework.test.context.web.WebAppConfiguration;
//
//import java.time.LocalDate;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//@DirtiesContext
//@WebAppConfiguration
//@ExtendWith(SpringExtension.class)
//@ContextConfiguration(classes = ApplicationContextConfig.class)
//public class IntegrationServiceTest {
//
//    @Autowired
//    FilmServiceImpl filmService;
//
//    @Test
//    public void createTest() {
//        Film film = new Film();
//        film.setTitle("Pulp Fiction");
//        film.setCreateCountry("USA");
//        film.setReleaseYear(LocalDate.of(1998, 5, 17));
//        film.setShortDescription("Awesome film");
//        film.setRating(10);
//        film.setGenre("Criminal");
//        filmService.create(film);
//        assertEquals(1, filmService.findAll().size());
//
//    }
//
//    @Test
//    public void findAllTest() {
//        System.out.println(filmService.findAll().toString());
//    }
//
//
//
//}
