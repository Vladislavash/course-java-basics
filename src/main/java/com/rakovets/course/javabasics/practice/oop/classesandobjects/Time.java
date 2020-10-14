package com.rakovets.course.javabasics.practice.oop.classesandobjects;

public class Time {
    private int hours;
    private int minutes;
    private int seconds;
    private int totalSeconds;
    int minutes1;
    Time(int totalSeconds) {
        this.hours = totalSeconds / 3600;
        this.minutes = ( totalSeconds % 3600 ) / 60;
        this.seconds = ( totalSeconds % 3600 ) % 60;
    }

    Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    int getHours() {
        return this.hours;
    }
    void setHours(int hours) {
        this.hours = hours;
    }
    int getMinutes() {
        return this.minutes;
    }
    void setMinutes(int minutes) {
        this.minutes = minutes;
    }
    int getSeconds() {
        return this.seconds;
    }
    void setSeconds(int seconds) {
        this.seconds = seconds;
    }
    int getTotalSeconds() {
        return (this.hours * 3600 + this.minutes * 60 + this.seconds);
    }
}