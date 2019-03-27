package ru.geekbrains.lesson1;

import ru.geekbrains.lesson1.animal.Cat;
import ru.geekbrains.lesson1.animal.Dog;
import ru.geekbrains.lesson1.animal.Human;
import ru.geekbrains.lesson1.animal.Robot;
import ru.geekbrains.lesson1.course.Course;
import ru.geekbrains.lesson1.course.Cross;
import ru.geekbrains.lesson1.course.Wall;
import ru.geekbrains.lesson1.course.Water;
import ru.geekbrains.lesson1.enums.Color;

/**
 * Класс для запуска приложения - симулятор кросса
 */
public class Application {

    public static void main(String[] args) {

        Team team = new Team(
                new Cat("Барсик1", Color.BLACK, 1, 100, 5,0),
                new Cat("Барсик2", Color.BLACK, 1, 80, 17,6),
                new Dog("Sharik",Color.RED,1,255,40,15),
            new Human("Patrik",Color.WHITE,27,150,25,150),
                new Robot("alesha",Color.YELLOW,1,960,950,950)




                // TODO здесь должны быть участники всех видов (Cat, Dog, Human, Robot)
        );

        Course course = new Course(
                new Cross(50),
                new Wall(10),
                new Cross(80),
                new Water(9)
        );

        course.doIt(team);
    }

}
