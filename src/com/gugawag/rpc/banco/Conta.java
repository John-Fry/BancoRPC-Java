package com.gugawag.rpc.banco;

import java.io.Serializable;

public class Conta implements Serializable {

    private String numero;
    private Double saldo;

    public Conta(String numero) {
        this.numero = numero;
        this.saldo = 0.0;
    }

    public String getNumero() {
        return numero;
    }

    public Double getSaldo() {
        return saldo;
    }
}
