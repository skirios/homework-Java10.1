package ru.netology.domain;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;


public class RadioTest {


    @Test
    public void upperVolumeLimit() {
        Radio radio = new Radio();
        radio.setCurrentVolume(11);
        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    public void lowerVolumeLimit() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void toggleVolumeUp() {
        Radio radio = new Radio();
        radio.setCurrentVolume(7);
        radio.setCurrentVolumeUp();
        assertEquals(8, radio.getCurrentVolume());
    }

    @Test
    public void toggleVolumeUpLimit() {
        Radio radio = new Radio();
        radio.setCurrentVolume(11);
        radio.setCurrentVolumeUp();
        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    public void toggleVolumeDown() {
        Radio radio = new Radio();
        radio.setCurrentVolume(7);
        radio.setCurrentVolumeDown();
        assertEquals(6, radio.getCurrentVolume());
    }

    @Test
    public void toggleVolumeDownLimit() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        radio.setCurrentVolumeDown();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void maxRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(10);
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void minRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        assertEquals(0, radio.getCurrentStation());

    }

    @Test
    public void setSwitchRadioStationOneStep() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        radio.setCurrentRadioStationUp();
        assertEquals(6, radio.getCurrentStation());
    }

    @Test
    public void testOfTheUpperLimitOfRadioValue() {
        Radio radio = new Radio();
        radio.setCurrentStation(10);
        radio.setCurrentRadioStationUp();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void radioLowerLimitTest() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);
        radio.setCurrentRadioStationDown();
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void switchOneStationDown() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);
        radio.setCurrentRadioStationDown();
        assertEquals(7, radio.getCurrentStation());
    }

    @Test
    public void theVolumeIsMoreThan100() {
        Radio radio = new Radio(100,0,101,10,0,1);
        radio.setCurrentVolume(101);
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    void turningOnThe11RadioStation() {
        Radio radio = new Radio(100,0,101,10,0,11);
        radio.setCurrentStation(11);
        assertEquals(10,radio.getCurrentStation());
    }
}