package com.stackroute;

import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Actor var =  context.getBean("actor",Actor.class);
        System.out.println(var.toString());

        Actor var1 =  context.getBean("actor1",Actor.class);
        System.out.println(var1.toString());

        Actor var2 =  context.getBean("actor2",Actor.class);
        System.out.println(var2.toString());


        Movie movie = context.getBean("movieA",Movie.class);
        System.out.println(movie.toString());

        Movie movie1 = context.getBean("movieB",Movie.class);
        System.out.println(movie1.toString());


    }
}
