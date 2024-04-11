
package com.mirea.kt.example.practical_1_14;

import java.util.concurrent.Semaphore;


public class Practical_1_14 {

    public static void main(String[] args) {
        System.out.println ("Козлова Динара Артёмовна, РИБО-01-22, Вариант 2, ");

        Semaphore semaphore = new Semaphore(2);

        for (int i = 1; i <= 7; i++) {
            Student student = new Student(i, semaphore);
            Thread studentThread = new Thread(student);
            studentThread.start();
        }
    }
}
