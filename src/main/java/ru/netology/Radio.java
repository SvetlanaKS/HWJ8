package ru.netology;

public class Radio {
    private int maxRadioStation = 9;
    private int minRadioStation;
    private int currentRadioStation;
    private int maxVolume = 100;
    private int minVolume;
    private int currentVolume;
    private boolean on;

    public Radio() {
    }

    public Radio(int maxRadioStation) {
        this.maxRadioStation = maxRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation >= maxRadioStation) {
            this.currentRadioStation = maxRadioStation;
        } else {
            // здесь уверены, что все проверки прошли
            this.currentRadioStation = currentRadioStation;
        }
    }

    public int increaseRadioStation() {
        if (currentRadioStation >= maxRadioStation) {
            currentRadioStation = minRadioStation;
        } else {
            currentRadioStation = currentRadioStation + 1;
        }
        return currentRadioStation;
    }


    public int reduceRadioStation() {
        if (currentRadioStation == minRadioStation) {
            currentRadioStation = maxRadioStation;
        } else {
            currentRadioStation = currentRadioStation - 1;
        }
        return currentRadioStation;
    }

    public int getMinRadioStation() {
        return minRadioStation;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }


    public int increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        } else {
            switchLastVolume();
        }
        return currentVolume;
    }

    public void switchLastVolume() {
        this.currentVolume = maxVolume;
    }

    public void switchZeroVolume() {
        this.currentVolume = minVolume;
    }

    public int reduceVolume() {
        if (currentVolume > minVolume) {
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
