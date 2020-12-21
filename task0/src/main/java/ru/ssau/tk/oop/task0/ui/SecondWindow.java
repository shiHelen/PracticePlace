package ru.ssau.tk.oop.task0.ui;

import javax.swing.*;
import java.awt.*;
import java.util.Date;
import java.util.function.Consumer;

public class SecondWindow extends JFrame {

    // callback-функция приходит из другого окна; она будет применяться к дате, которая создаётся в этом окне
    // ничего возрващать она не должна, т.е. у нас получается функция вида f : Date -> void
    // самый подходящий для неё функциональный интерфейс - Consumer
    // если бы функция действовала не из одного значения (из 0 или нескольких) и/или что-то возвращала,
    // можно было бы выбрать любой другой подходящий функциональный интерфейс:
    // Producer, Function, BiFunction, BiConsumer, Predicate и т.п.
    public SecondWindow(Consumer<? super Date> callback) {
        super("Second Window"); // заголовок окна
        setDefaultCloseOperation(DISPOSE_ON_CLOSE); // при нажатии на X окно уничтожается
        setSize(300, 100); // размеры окна
        setLocationRelativeTo(null); // центрируем окно относительно экрана с учётом заданных выше размеров
        setLayout(new FlowLayout()); // самый простой менеджер компоновки
        JButton button = new JButton("Close"); // кнопка закрытия
        button.addActionListener(event -> { // слушатель, заданный с помощью лямбда-выражения
            Date date = new Date(); // создаём объект текущей даты
            callback.accept(date); // применяем callback-функцию к дате
            dispose(); // уничтожаем окно
        });
        getContentPane().add(button); // добавляем кнопку
    }

}