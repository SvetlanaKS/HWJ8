package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {
    Radio radio = new Radio();
    Radio radio2 = new Radio(5);


    @Test
    public void increaseRadioStationTest() {
        //      Radio radio = new Radio();
        radio2.setCurrentRadioStation(radio2.getCurrentRadioStation() + 4);
        int actual = radio2.increaseRadioStation();
        int expected = 5;
        assertEquals(expected, actual);
    }

    @Test
    public void switchZeroTest() {
        //       Radio radio = new Radio();
        radio2.setCurrentRadioStation(radio2.getCurrentRadioStation() + 5);
        int actual = radio2.increaseRadioStation();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void reduceRadioStationTest() {
        //     Radio radio = new Radio();
        radio2.setCurrentRadioStation(radio2.getCurrentRadioStation() + 4);
        int actual = radio2.reduceRadioStation();
        int expected = 3;
        assertEquals(expected, actual);
    }

    @Test
    public void switchLastTest() {
        //      Radio radio = new Radio();
        radio2.setCurrentRadioStation(radio2.getCurrentRadioStation());
        int actual = radio2.reduceRadioStation();
        int expected = 5;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchCurrentRadioStation() {
//        Radio radio = new Radio();
        int number = 1;
        int expected = radio.getCurrentRadioStation() + number;
        radio.setCurrentRadioStation(radio.getMinRadioStation() + number);
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSelectCurrentRadioStation() {
        int number = 4;
        radio2.setCurrentRadioStation(number);
        int actual = radio2.getCurrentRadioStation();
        int expected = 4;
        assertEquals(expected, actual);
    }

    @Test
    public void increaseVolume() {
        //     Radio radio = new Radio();
        radio.setCurrentVolume(radio.getCurrentVolume() + 9);
        int actual = radio.increaseVolume();
        int expected = 10;
        assertEquals(expected, actual);
    }

    @Test
    public void switchLastVolume() {
        //       Radio radio = new Radio();
        radio.setCurrentVolume(radio.getCurrentVolume() + 100);
        int actual = radio.increaseVolume();
        int expected = 100;
        assertEquals(expected, actual);
    }

    @Test
    public void reduceVolume() {
        //       Radio radio = new Radio();
        radio.setCurrentVolume(radio.getCurrentVolume() + 5);
        int actual = radio.reduceVolume();
        int expected = 4;
        assertEquals(expected, actual);
    }

    @Test
    public void switchZeroVolume() {
        //       Radio radio = new Radio();
        radio.setCurrentVolume(radio.getCurrentVolume());
        int actual = radio.reduceVolume();
        int expected = 0;
        assertEquals(expected, actual);
    }
}

