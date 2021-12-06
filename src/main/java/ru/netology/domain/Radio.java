package ru.netology.domain;

public class Radio {
    private int currentStation;
    private int maxStation = 9;
    private int minStation = 0;

    private int currentVolume;
    private int maxVolume = 100;
    private int minVolume = 0;

    private int amountStation = 10;

    public Radio(int amountStation) {
        maxStation = amountStation - 1;
        this.amountStation = amountStation;
    }

    public Radio() {
    }

    public int getMaxStation() {
        return maxStation;
    }

    public int getMinStation() {
        return minStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int increaseStation() {
        setCurrentStation(currentStation + 1);
        return currentStation;
    }

    public int decreaseStation() {
        setCurrentStation(currentStation - 1);
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < minStation) {
            currentStation = maxStation;
        }
        if (currentStation > maxStation) {
            currentStation = minStation;
        }
        this.currentStation = currentStation;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int increaseVolume() {
        setCurrentVolume(currentVolume + 1);
        return currentVolume;
    }

    public int decreaseVolume() {
        setCurrentVolume(currentVolume - 1);
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < minVolume) {
            currentVolume = minVolume;
        }
        if (currentVolume > maxVolume) {
            currentVolume = maxVolume;
        }
        this.currentVolume = currentVolume;
    }
}