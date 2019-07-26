package com.stackroute.domain;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Movie {
    private Actor actor; //actor object

    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "actor=" + actor +
                '}';
    }
}
