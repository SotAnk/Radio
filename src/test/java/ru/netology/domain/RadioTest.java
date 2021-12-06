package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {
    Radio radio = new Radio();
    Radio radio1 = new Radio(12);

    @Test
    void increaseStation() {
        radio.setCurrentStation(2);
        radio.increaseStation();
        int expected = 3;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void increaseStationUpperLimit() {
        radio.setCurrentStation(radio.getMaxStation() + 1);
        radio.increaseStation();
        int expected = radio.getMinStation();
        int actual = radio.getCurrentStation() - 1;
        assertEquals(expected, actual);
    }

    @Test
    void decreaseStation() {
        radio.setCurrentStation(7);
        radio.decreaseStation();
        int expected = 6;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void decreaseStationUnderLimit() {
        radio.setCurrentStation(radio.getMinStation() - 1);
        radio.decreaseStation();
        int expected = radio.getMaxStation();
        int actual = radio.getCurrentStation() + 1;
        assertEquals(expected, actual);
    }

    @Test
    void increaseVolume() {
        radio.setCurrentVolume(1);
        radio.increaseVolume();
        int expected = 2;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void increaseVolumeUpperLimit() {
        radio.setCurrentVolume(radio.getMaxVolume() + 1);
        radio.increaseVolume();
        int expected = radio.getMaxVolume();
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void decreaseVolume() {
        radio.setCurrentVolume(8);
        radio.decreaseVolume();
        int expected = 7;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);

    }

    @Test
    void decreaseVolumeUnderLimit() {
        radio.setCurrentVolume(radio.getMinVolume() - 1);
        radio.decreaseVolume();
        int expected = radio.getMinVolume();
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void maxStation() {
        int expected = 11;
        int actual = radio1.getMaxStation();
        assertEquals(expected, actual);
    }
}
