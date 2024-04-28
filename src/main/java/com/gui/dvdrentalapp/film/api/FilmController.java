package com.gui.dvdrentalapp.film.api;

import com.gui.dvdrentalapp.film.api.DTO.FilmDTO;
import com.gui.dvdrentalapp.film.domain.Film;
import com.gui.dvdrentalapp.film.service.FilmService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/films")
public class FilmController {
    private final FilmService filmService;
    Logger logger = LoggerFactory.getLogger(FilmController.class);

    public FilmController(FilmService filmService) {
        this.filmService = filmService;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<FilmDTO> getAllFilms() {
        return filmService.getAllFilms();
    }

    @GetMapping(path = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    public FilmDTO getFilmById(@PathVariable long id) {
        return filmService.getFilmById(id);
    }
}
