package ru.study.chapter_02.observer;

/**
 * Простой наблюдатель A
 */
public class ConcreteObserverA implements Observer<String> {
    @Override
    public void observe(String event) {
        System.out.println("Observer A: " + event);
    }
}
