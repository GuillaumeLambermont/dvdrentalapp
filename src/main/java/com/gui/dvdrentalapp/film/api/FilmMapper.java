package com.gui.dvdrentalapp.film.api;

import com.gui.dvdrentalapp.film.api.DTO.FilmDTO;
import com.gui.dvdrentalapp.film.domain.Film;
import org.springframework.stereotype.Component;

@Component
public class FilmMapper {
    public Film fromDTO(FilmDTO filmDTO) {
        return new Film(
                filmDTO.title(),
                filmDTO.description(),
                filmDTO.release_year(),
                filmDTO.language_id(),
                filmDTO.rental_duration(),
                filmDTO.rental_rate(),
                filmDTO.length(),
                filmDTO.replacement_cost(),
                filmDTO.rating(),
                filmDTO.last_update(),
                filmDTO.special_features(),
                filmDTO.fulltext()
        );
    }

    public FilmDTO toDTO(Film film) {
        return new FilmDTO(
                film.getFilm_id(),
                film.getTitle(),
                film.getDescription(),
                film.getRelease_year(),
                film.getLanguage_id(),
                film.getRental_duration(),
                film.getRental_rate(),
                film.getLength(),
                film.getReplacement_cost(),
                film.getRating(),
                film.getLast_update(),
                film.getSpecial_features(),
                film.getFulltext()
        );
    }
}
