package ru.netology;

public class Radio {
    private int maxRadioStation = 9;
    private int minRadioStation = 0;
    private int currentRadioStation = minRadioStation;
    private int maxVolume = 10;
    private int minVolume = 0;
    private int currentVolume = minVolume;
    private boolean on;

    public int getMinRadioStation() {
        return minRadioStation;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation <= minRadioStation) {
            currentRadioStation = maxRadioStation;
        } else if (currentRadioStation >= maxRadioStation) {
            currentRadioStation = minRadioStation;
        }

        // здесь уверены, что все проверки прошли
        this.currentRadioStation = currentRadioStation;
    }

    public int increaseRadioStation() {
        currentRadioStation = currentRadioStation + 1;
        return currentRadioStation;
    }

    public int reduceRadioStation() {
        currentRadioStation = currentRadioStation - 1;
        return currentRadioStation;
    }

    public int increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        } else switchLastVolume();
        return currentVolume;
    }

    public void switchLastVolume() {
        this.currentVolume = maxVolume;
    }

    public void switchZeroVolume() {
        this.currentVolume = minVolume;
    }

    public int reduceVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        } else switchZeroVolume();
        return currentVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume >= maxVolume) {
            currentVolume = maxVolume;
        } else if (currentVolume <= minVolume) {
            currentVolume = minVolume;
        }
        this.currentVolume = currentVolume;
    }
}
