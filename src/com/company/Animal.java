package com.company;

/**
 * Created by User on 28.12.2016.
 */
public class Animal implements Runnable {
    @Override
    public void run() {
        boolean isAlive = true;
        while (isAlive) {
            eat += EAT_STEP;
            if (eat > (EAT_MAX - 2 * EAT_STEP)) {
                System.out.println("I want to eat");
                wantEat = true;

            }
            sleep += SLEEP_STEP;
            if (sleep > (SLEEP_MAX - 2 * SLEEP_STEP)) {
                System.out.println("I want to sleep");
                wantSleep = true;

            }
            toilet += TOILET_STEP;
            if (toilet > (TOILET_MAX - 2 * TOILET_STEP)) {
                System.out.println("I want to toilet");
                wantToilet = true;
            }
            if (eat >= EAT_MAX || sleep >= SLEEP_MAX || toilet >= TOILET_MAX) {
                System.out.println("R.I.P!!!");
                isAlive = false;

            }
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private int eat;
    private int sleep;
    private int toilet;

    private final static int EAT_MAX = 100;
    private final static int SLEEP_MAX = 100;
    private final static int TOILET_MAX = 100;

    private final static int EAT_STEP = 12;
    private final static int SLEEP_STEP = 8;
    private final static int TOILET_STEP = 10;

    private boolean wantEat;
    private boolean wantSleep;
    private boolean wantToilet;

    public boolean isWantToilet() {
        return wantToilet;
    }

    public boolean isWantSleep() {
        return wantSleep;
    }

    public boolean isWantEat() {
        return wantEat;
    }

    public void giveEat() {
        eat = 0;
        wantEat = false;
    }

    public void giveSleep() {
        sleep = 0;
        wantSleep = false;
    }

    public void giveToilet() {
        toilet = 0;
        wantToilet = false;
    }

}
