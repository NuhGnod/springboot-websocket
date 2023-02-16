package com.example.springwebsocket.chat.handler;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

//@Component
public class FOR {
    @Bean(name = "donghun")
    public String print() {
        System.out.println("ADSDA");
        number();
        return "@@";
    }

    public int number()
    {
        System.out.println("number :  " + 23);
        return 11;
    }
}
