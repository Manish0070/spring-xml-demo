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


        Movie movie = context.getBean("movie",Movie.class);
        System.out.println(movie.toString());

    }
}
