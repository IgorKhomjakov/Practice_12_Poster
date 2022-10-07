package ru.netology.poster;

import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PosterManagerTest {

    @Test
    public void shouldAddFilm() {
        PosterManager poster = new PosterManager();
        poster.addFilm("1");
        poster.addFilm("2");
        poster.addFilm("3");
        poster.addFilm("4");


        String[] expected = {"1", "2", "3", "4"};
        String[] actual = poster.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldOutputLastFilmsWithinSetLimit() {
        PosterManager poster = new PosterManager();
        poster.addFilm("1");
        poster.addFilm("2");
        poster.addFilm("3");
        poster.addFilm("4");
        poster.addFilm("5");
        poster.addFilm("6");
        poster.addFilm("7");
        poster.addFilm("8");
        poster.addFilm("9");
        poster.addFilm("10");
        poster.findLast(10);

        String[] expected = {"10", "9", "8", "7", "6", "5", "4", "3", "2", "1"};
        String[] actual = poster.findLast(10);

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldOutputLastFilmsLessSetLimit() {
        PosterManager poster = new PosterManager();
        poster.addFilm("1");
        poster.addFilm("2");
        poster.addFilm("3");
        poster.addFilm("4");
        poster.addFilm("5");
        poster.findLast(10);

        String[] expected = {"5", "4", "3", "2", "1"};
        String[] actual = poster.findLast(10);

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldOutputLastFilmsLimitSetManually() {
        PosterManager poster = new PosterManager(5);
        poster.addFilm("1");
        poster.addFilm("2");
        poster.addFilm("3");
        poster.addFilm("4");
        poster.addFilm("5");
        poster.findLast(10);

        String[] expected = {"5", "4", "3", "2", "1"};
        String[] actual = poster.findLast(10);

        Assertions.assertArrayEquals(expected, actual);
    }
}
