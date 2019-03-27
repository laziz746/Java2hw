package ru.geekbrains.lesson1.animal;

import ru.geekbrains.lesson1.Participant;
import ru.geekbrains.lesson1.enums.Color;

public class Human extends Animal implements Participant {
    private boolean isOnDistance;
    private int runDistance;
    private int jumpHeight;
    private int distance;

    public Human(String name, Color color, int age,int runDistance, int jumpHeight, int distance) {
        super(name, color, age);
        this.isOnDistance = true;
        this.runDistance = runDistance;
        this.jumpHeight = jumpHeight;
        this.distance=distance;
    }

    public Human(String name, Color color) {
        super(name, color, 0);
    }


    @Override
    public boolean isOnDistance() {
        return true; // TODO доработать по аналогии с классом Cat+
    }

    @Override
    public void run(int distance) {
        // TODO доработать по аналогии с классом Cat+
        if (!isOnDistance) {
            return;
        }
        if (distance > runDistance) {
            isOnDistance = false;
            return;
        }
        System.out.println(String.format("Человек %s пробежал кросс длинной %d", getName(), distance));
    }

    @Override
    public void jump(int height) {
        // TODO доработать по аналогии с классом Cat+
        if (!isOnDistance){
            return;
        }
        if (height>jumpHeight){
            isOnDistance=false;
            return;
        }System.out.println(String.format("Человек %s прыгнул  на высоту %d", getName(), height));
    }

    @Override
    public void swim(int distance) {
        // TODO доработать по аналогии с классом Cat+
        if (!isOnDistance){
            return;
        }
        if (distance>distance){
            isOnDistance=false;
            return;
        }System.out.println(String.format("Человек %s проплыл дистанцию %d", getName(), distance));
    }

    @Override
    public void voice() {
        // TODO доработать по аналогии с классом Cat+
        System.out.println("Привет учитель!");
    }
}
