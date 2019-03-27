package ru.geekbrains.lesson1.course;

import ru.geekbrains.lesson1.Participant;

public class Water extends Obstacle {
    private int SwimDistancence;


    public Water(int SwimDistancence) {
        this.SwimDistancence=SwimDistancence;;
        // TODO доработать по аналогии с другими препятствиями+
    }

    @Override
    public void doIt(Participant participant) {
        participant.swim(this.SwimDistancence);


        // TODO доработать по аналогии с другими препятствиями+
    }
}
