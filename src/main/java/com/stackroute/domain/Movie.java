package com.stackroute.domain;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public  class Movie implements ApplicationContextAware,BeanNameAware,BeanFactoryAware {
    private Actor actor,actor1,actor2;

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println(beanFactory);
    }


    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println(applicationContext);

    }
    public Movie() {
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public void setBeanName(String s){
        System.out.println(s);
    }

    public void setActor1(Actor actor1) {
        this.actor1 = actor1;
    }

    public void setActor2(Actor actor2) {
        this.actor2 = actor2;
    }

    public Movie(Actor actor, Actor actor1, Actor actor2) {
        this.actor = actor;
        this.actor1 = actor1;
        this.actor2 = actor2;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "actor=" + actor +
                ", actor1=" + actor1 +
                ", actor2=" + actor2 +
                '}';
    }
}
