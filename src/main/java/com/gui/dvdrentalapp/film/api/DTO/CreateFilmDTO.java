package com.gui.dvdrentalapp.film.api.DTO;

import java.time.LocalDateTime;
import java.util.Date;

public record CreateFilmDTO(
                           String title,
                           String description,
                           int release_year,
                           int language_id,
                           int rental_duration,
                           double rental_rate,
                           int length,
                           double replacement_cost,
                           String rating,
                           LocalDateTime last_update,
                           String special_features,
                           String fulltext
    ) {}
