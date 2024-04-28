package com.gui.dvdrentalapp.film.domain;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "film")
public class Film {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "film_id")
    private long film_id;

    @Column(name = "title")
    private String title;
    @Column(name = "description")
    private String description;
    @Column(name = "release_year")
    private int release_year;
    @Column(name = "language_id")
    private int language_id;
    @Column(name = "rental_duration")
    private int rental_duration;
    @Column(name = "rental_rate")
    private double rental_rate;
    @Column(name = "length")
    private int length;
    @Column(name = "replacement_cost")
    private double replacement_cost;
    @Column(name = "rating")
    private String rating;
    @Column(name = "last_update")
    private LocalDateTime last_update;
    @Column(name = "special_features")
    private String special_features;
    @Column(name = "fulltext")
    private String fulltext;

    public Film(String title, String description, int release_year, int language_id, int rental_duration,
                double rental_rate, int length, double replacement_cost, String rating, LocalDateTime last_update,
                String special_features, String fulltext) {
        this.title = title;
        this.description = description;
        this.release_year = release_year;
        this.language_id = language_id;
        this.rental_duration = rental_duration;
        this.rental_rate = rental_rate;
        this.length = length;
        this.replacement_cost = replacement_cost;
        this.rating = rating;
        this.last_update = last_update;
        this.special_features = special_features;
        this.fulltext = fulltext;
    }
    public Film() {}

    public long getFilm_id() {
        return film_id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getRelease_year() {
        return release_year;
    }

    public int getLanguage_id() {
        return language_id;
    }

    public int getRental_duration() {
        return rental_duration;
    }

    public double getRental_rate() {
        return rental_rate;
    }

    public int getLength() {
        return length;
    }

    public double getReplacement_cost() {
        return replacement_cost;
    }

    public String getRating() {
        return rating;
    }

    public LocalDateTime getLast_update() {
        return last_update;
    }

    public String getSpecial_features() {
        return special_features;
    }

    public String getFulltext() {
        return fulltext;
    }
}
