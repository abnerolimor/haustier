package com.olimor.Haustier.dto;

import com.olimor.Haustier.modelo.Haustier;

public class HaustierDto {
    
    
    private long id;
    private String rua;
    private String numero;
    private String bairro;
    private String cep;
    private String complemento;
    
    public HaustierDto() {
    }

    public HaustierDto(String rua, String numero, String bairro, String cep, String complemento) {
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.cep = cep;
        this.complemento = complemento;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public Haustier NovoHuastier(){
        return new Haustier(rua, numero, bairro, cep, complemento);

    }
    
}
