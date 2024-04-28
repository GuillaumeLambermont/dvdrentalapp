package com.gui.dvdrentalapp.film.service;

import com.gui.dvdrentalapp.film.api.DTO.FilmDTO;
import com.gui.dvdrentalapp.film.api.FilmMapper;
import com.gui.dvdrentalapp.film.domain.Film;
import com.gui.dvdrentalapp.film.domain.FilmRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class FilmService {

    private FilmRepository filmRepository;
    private FilmMapper filmMapper;

    public FilmService(FilmRepository filmRepository, FilmMapper filmMapper) {
        this.filmRepository = filmRepository;
        this.filmMapper = filmMapper;
    }

    public List<FilmDTO> getAllFilms() {
        return filmRepository.findAll()
                .stream()
                .map(filmMapper::toDTO)
                .toList();
    }
}
