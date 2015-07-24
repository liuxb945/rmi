package com.habuma.spitter.service.rmi;

import java.util.Date;

import com.habuma.spitter.domain.Spitter;
import com.habuma.spitter.domain.Spittle;

public class HelloServiceImpl implements HelloService {
  public Spittle sayHello(String name) {
    System.out.println("Hello " + name);
    Spitter s=new Spitter();
    s.setEmail("dkdk@163.com");
    Spittle sp=new Spittle();
    sp.setSpitter(s);
    Date d=new Date();
    sp.setWhen(d);
    return sp;
  }
}
