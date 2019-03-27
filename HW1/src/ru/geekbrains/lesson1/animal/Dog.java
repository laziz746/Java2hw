package ru.geekbrains.lesson1.animal;

import ru.geekbrains.lesson1.Participant;
import ru.geekbrains.lesson1.enums.Color;

public class Dog extends Animal implements Participant {
    private int runDistance;
    private boolean isOnDistance;
    private int jumpHeight;
    private int distance;

    public Dog(String name, Color color, int age, int runDistance, int jumpHeight, int distance) {

        super(name, color, age);
        this.isOnDistance = true;
        this.runDistance = runDistance;
        this.jumpHeight = jumpHeight;
        this.distance=distance;

    }

    public Dog(String name, Color color) {
        super(name, color, 0);
    }

    @Override
    public void voice() {
        System.out.println("Гав");
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
        System.out.println(String.format("Собака %s пробежала кросс длинной %d", getName(), distance));
    }

    @Override
    public void jump(int height) {
        // TODO доработать по аналогии с классом Cat+
        if (!isOnDistance) {
            return;
        }
        if (height > jumpHeight) {
            isOnDistance = false;
            return;
        }
        System.out.println(String.format("Собака %s пругнула на высоту %d", getName(), height));
    }

    @Override
    public void swim(int distance) {
        // TODO доработать по аналогии с классом Cat+
        if (!isOnDistance) {
            return;
        }
        if (distance > distance) {
            isOnDistance = false;
            return;
        }
        System.out.println(String.format("Собака %s проплыла дистанцию %d", getName(), distance));

    }
}
