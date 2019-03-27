package ru.geekbrains.lesson1.enums;

public enum Color {
    WHITE("Белый"),
    BLACK("Черный"),
    BROWN("Коричневый"),
    GRAY("Серый"),
    YELLOW("Желтый"),
    RED("Рыжий");

    private String name;

    Color(String name) {
        this.name = name;
    }

    public String getName()  {
        return name;
    }
}
