package ru.netology.domain;

public class Radio {
    private int maxVolume = 10;
    private int minVolume = 0;
    private int currentVolume = getCurrentVolume();
    private int maxRadioStation = 9;
    private int minRadioStation = 0;
    private int currentStation = getCurrentStation();


    public int getMaxVolume() {
        return maxVolume;
    }

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume <= maxVolume) {
            this.currentVolume = currentVolume;
        } else {
            currentVolume = maxVolume;
        }
        if (currentVolume <= minVolume) {
            this.currentVolume = minVolume;
        }
        this.currentVolume = currentVolume;

    }

    public void setCurrentVolumeUp() {
        if (currentVolume < maxVolume) {
            currentVolume ++;
        } else{
            currentVolume = maxVolume;
        }
    }

    public void setCurrentVolumeDown() {
        if (currentVolume > minVolume) {
            currentVolume--;
        } else{
            currentVolume = minVolume;
        }
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

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation <= maxRadioStation) {
            this.currentStation = currentStation;
        } else {
            currentStation = maxRadioStation;

        }
        if (currentStation <= minRadioStation) {
            this.currentStation = currentStation;
        }
        this.currentStation = currentStation;
    }

    public void setCurrentRadioStationUp() {
        if (currentStation < maxRadioStation) {
            currentStation++;
        } else {
            currentStation = minRadioStation;
        }

    }

    public void setCurrentRadioStationDown() {
        if (currentStation > minRadioStation) {
            currentStation--;
        } else {
            currentStation = maxRadioStation;
        }
    }


}