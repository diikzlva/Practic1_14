
package com.mirea.kt.example.practical_1_14;

import java.util.concurrent.Semaphore;

public class Student implements Runnable {

    private int id;
    private Semaphore semaphore;

    public Student(int id, Semaphore semaphore) {
        this.id = id;
        this.semaphore = semaphore;
    }

    @Override
    public void run() {
        try {
            // Студент ожидает свободного места за столом
            System.out.println("Student" + id + " waiting");
            semaphore.acquire();

            // Студент начинает есть
            System.out.println("Student" + id + " eating");
            Thread.sleep(3000); // Задержка на 3 секунды для имитации обеда

            // Студент выходит из-за стола
            System.out.println("Student" + id + " exit");
            semaphore.release();
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }
}
