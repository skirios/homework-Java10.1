package ru.netology.domain;


import static org.junit.jupiter.api.Assertions.assertEquals;


public class RadioTest {
    Radio radio = new Radio();

    @Test
    public void upperVolumeLimit() {
        radio.setCurrentVolume(11);
        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    public void lowerVolumeLimit() {
        radio.setCurrentVolume(0);
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void toggleVolumeUp() {
        radio.setCurrentVolume(7);
        radio.setCurrentVolumeUp();
        assertEquals(8, radio.getCurrentVolume());
    }

    @Test
    public void toggleVolumeUpLimit() {
        radio.setCurrentVolume(11);
        radio.setCurrentVolumeUp();
        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    public void toggleVolumeDown() {
        radio.setCurrentVolume(7);
        radio.setCurrentVolumeDown();
        assertEquals(6, radio.getCurrentVolume());
    }

    @Test
    public void toggleVolumeDownLimit() {
        radio.setCurrentVolume(-1);
        radio.setCurrentVolumeDown();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void maxRadioStation() {
        radio.setCurrentStation(10);
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void minRadioStation() {
        radio.setCurrentStation(0);
        assertEquals(0, radio.getCurrentStation());

    }

    @Test
    public void setSwitchRadioStationOneStep() {
        radio.setCurrentStation(5);
        radio.setCurrentRadioStationUp();
        assertEquals(6, radio.getCurrentStation());
    }

    @Test
    public void testOfTheUpperLimitOfRadioValue() {
        radio.setCurrentStation(10);
        radio.setCurrentRadioStationUp();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void radioLowerLimitTest() {
        radio.setCurrentStation(-1);
        radio.setCurrentRadioStationDown();
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void switchOneStationDown() {
        radio.setCurrentStation(8);
        radio.setCurrentRadioStationDown();
        assertEquals(7, radio.getCurrentStation());
    }
}