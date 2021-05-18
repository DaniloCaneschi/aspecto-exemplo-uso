package com.aspecto;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class Aspecto {

  @Before(value = ("execution(* com.aspecto.Conta.*(..))"))
  public void exemploBefore(){
    System.out.println("Executando antes da chamado do método");
  }

  @After(value = ("execution(* com.aspecto.Conta.*(..))"))
  public void exemploAfter(){
    System.out.println("Executando depois da chamado do método");
  }
}
