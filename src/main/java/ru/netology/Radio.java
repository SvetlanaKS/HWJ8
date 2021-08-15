package ru.netology;

public class Radio {
    public String name;
    private int maxRadioStation = 9;
    private int minRadioStation = 0;
    private int currentRadioStation = minRadioStation;
    private int maxVolume = 10;
    private int minVolume = 0;
    private int currentVolume = minVolume;
    private boolean on;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxRadioStation() {
        return maxRadioStation;
    }

    public void setMaxRadioStation(int maxRadioStation) {
        this.maxRadioStation = maxRadioStation;
    }

    public int getMinRadioStation() {
        return minRadioStation;
    }

    public void setMinRadioStation(int minRadioStation) {
        this.minRadioStation = minRadioStation;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation > maxRadioStation) {
            currentRadioStation = minRadioStation;
        }
        if (currentRadioStation < minRadioStation) {
            currentRadioStation = maxRadioStation;
        }
        // здесь уверены, что все проверки прошли
        this.currentRadioStation = currentRadioStation;
    }

//    public void setOn(boolean on) {
//        this.on = on;
//    }

    public int increaseRadioStation() {
        if (currentRadioStation < 9) {
            currentRadioStation = currentRadioStation + 1;
        } else switchZero();
        return currentRadioStation;
    }

    public void switchZero() {
        this.currentRadioStation = minRadioStation;
    }

    public int reduceRadioStation() {
        if (currentRadioStation > 0) {
            currentRadioStation = currentRadioStation - 1;
        } else switchLast();
        return currentRadioStation;
    }

    public void switchLast() {
        this.currentRadioStation = maxRadioStation;
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
        if (currentVolume > maxVolume) {
            currentVolume = maxVolume;
        }
        if (currentVolume < minVolume) {
            currentVolume = minVolume;
        }
        this.currentVolume = currentVolume;
    }
}
