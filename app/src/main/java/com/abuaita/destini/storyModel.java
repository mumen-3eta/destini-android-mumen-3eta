package com.abuaita.destini;

public class storyModel {
    private int currentBath;
    private  int firstBath;
    private int secondBath;
    private int nextBath1;
    private int nextBath2;

    public storyModel(int currentBath, int firstBath, int secondBath, int nextBath1, int nextBath2){
        this.currentBath = currentBath;
        this.firstBath = firstBath;
        this.secondBath = secondBath;
        this.nextBath1 = nextBath1;
        this.nextBath2 = nextBath2;
    }

    public  storyModel (int currentBath){
        this.currentBath = currentBath;
    }

    public int getCurrentBath() {
        return currentBath;
    }

    public void setCurrentBath(int currentBath) {
        this.currentBath = currentBath;
    }

    public int getFirstBath() {
        return firstBath;
    }

    public void setFirstBath(int firstBath) {
        this.firstBath = firstBath;
    }

    public int getSecondBath() {
        return secondBath;
    }

    public void setSecondBath(int secondBath) {
        this.secondBath = secondBath;
    }

    public int getNextBath1() {
        return nextBath1;
    }

    public void setNextBath1(int nextBath1) {
        this.nextBath1 = nextBath1;
    }

    public int getNextBath2() {
        return nextBath2;
    }

    public void setNextBath2(int nextBath2) {
        this.nextBath2 = nextBath2;
    }
}
