
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
            System.out.println("Student" + id + " waiting");
            semaphore.acquire();

            System.out.println("Student" + id + " eating");
            Thread.sleep(3000); 

            System.out.println("Student" + id + " exit");
            semaphore.release();
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }
}
