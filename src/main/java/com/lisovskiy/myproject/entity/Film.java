package com.lisovskiy.myproject.entity;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.PastOrPresent;
import java.sql.Date;
import java.time.LocalDate;

@Entity
@Table(name = "film", schema = "films_db")
public class Film {
    private int filmId;
    private String title;
    private String createCountry;
    private LocalDate releaseYear;
    private String shortDescription;
    private int rating;
    private String genre;

    @Id
    @Column(name = "film_id", nullable = false)
    public int getFilmId() {
        return filmId;
    }

    public void setFilmId(int filmId) {
        this.filmId = filmId;
    }

    @Basic
    @Column(name = "title", nullable = false, length = 45)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Basic
    @Column(name = "create_country", nullable = false, length = 45)
    public String getCreateCountry() {
        return createCountry;
    }

    public void setCreateCountry(String createCountry) {
        this.createCountry = createCountry;
    }

    @Basic
    @Column(name = "release_year", nullable = false)
    @PastOrPresent
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    public LocalDate getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(LocalDate releaseYear) {
        this.releaseYear = releaseYear;
    }

    @Basic
    @Column(name = "short_description", nullable = false, length = 45)
    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    @Basic
    @Column(name = "rating", nullable = false)
    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Basic
    @Column(name = "genre", nullable = false)
    public String getGenre() {return genre;}

    public void setGenre(String genre) {this.genre = genre;}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Film that = (Film) o;

        if (filmId != that.filmId) return false;
        if (rating != that.rating) return false;
        if (title != null ? !title.equals(that.title) : that.title != null) return false;
        if (createCountry != null ? !createCountry.equals(that.createCountry) : that.createCountry != null)
            return false;
        if (releaseYear != null ? !releaseYear.equals(that.releaseYear) : that.releaseYear != null) return false;
        if (shortDescription != null ? !shortDescription.equals(that.shortDescription) : that.shortDescription != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = filmId;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (createCountry != null ? createCountry.hashCode() : 0);
        result = 31 * result + (releaseYear != null ? releaseYear.hashCode() : 0);
        result = 31 * result + (shortDescription != null ? shortDescription.hashCode() : 0);
        result = 31 * result + rating;
        return result;
    }
}
