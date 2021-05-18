package com.aspecto;

import org.springframework.stereotype.Component;

@Component
public class Conta {
  private String numero;
  private String titular;
  private double saldo;

  public void criarConta(String numero, String titular){
    this.numero = numero;
    this.titular = titular;
  }

  public void depositar(double valor) {
    this.saldo += valor;
  }
}
