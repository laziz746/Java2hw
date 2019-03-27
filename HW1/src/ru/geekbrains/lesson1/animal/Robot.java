package ru.geekbrains.lesson1.animal;

import ru.geekbrains.lesson1.Participant;
import ru.geekbrains.lesson1.enums.Color;

/**
 * Робот не является животным, но может учавствовать в соревнованиях
 * так как реализует интерфейс {@link Participant}
 */
public class Robot  implements Participant {

    private String name;
    private boolean isOnDistance;
    private int runDistance;
    private int jumpHeight;
    private int distance;


    public Robot(String name, Color color, int age, int runDistance, int jumpHeight, int distance) {
        this.name = name;
        this.isOnDistance = true;
        this.runDistance = runDistance;
        this.jumpHeight = jumpHeight;
        this.distance=distance;
    }


    @Override
    public boolean isOnDistance() {
        return true; // TODO доработать по аналогии с классами животных+
    }

    @Override
    public void run(int distance) {


        // TODO доработать по аналогии с классами животных+
        if (!isOnDistance) {
            return;
        }
        if (distance > runDistance) {
            isOnDistance = false;
            return;
        }
        System.out.println(String.format("Робот %s пробежал кросс длинной %d", getName(), distance));
    }





    @Override
    public void jump(int height) {
        // TODO доработать по аналогии с классами животных+
        if (!isOnDistance){
            return;
        }
        if (height>jumpHeight){
            isOnDistance=false;
            return;
        }System.out.println(String.format("Робот %s прыгнул на высоту %d", getName(), height));
    }

    @Override
    public void swim(int distance) {

        // TODO доработать по аналогии с классами животных+
        if (!isOnDistance){
            return;
        }
        if (distance>jumpHeight){
            isOnDistance=false;
            return;
        }System.out.println(String.format("Робот %s проплыл дистанцию  %d", getName(), distance));
    }
    public String getName() {
        return name;
    }
    }


