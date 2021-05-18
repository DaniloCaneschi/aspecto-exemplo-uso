package com.aspecto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class AspectoApplication {

  public static void main(String[] args){
    ApplicationContext context = SpringApplication.run(AspectoApplication.class, args);

    Conta conta = context.getBean(Conta.class);
    System.out.println("Depositando 100,00");
    conta.depositar(100);

    System.out.println("\n\nDepositando 400,00");
    conta.depositar(400);
  }
}
