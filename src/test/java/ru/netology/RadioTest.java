package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    @Test
    public void shouldCreate() {
        Radio radio = new Radio();
    }

    @Test
    public void increaseRadiostation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(radio.getCurrentRadioStation() + 9);
        int actual = radio.increaseRadioStation();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void reduceRadiostation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(radio.getCurrentRadioStation());
        int actual = radio.reduceRadioStation();
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchCurrentRadioStation() {
        Radio radio = new Radio();
        int number = 1;
        int expected = radio.getCurrentRadioStation() + number;
        radio.setCurrentRadioStation(radio.getMinRadioStation() + number);
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void increaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(radio.getCurrentVolume() + 9);
        int actual = radio.increaseVolume();
        int expected = 10;
        assertEquals(expected, actual);
    }

    @Test
    public void reduceVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(radio.getCurrentVolume() + 5);
        int actual = radio.reduceVolume();
        int expected = 4;
        assertEquals(expected, actual);
    }
}
