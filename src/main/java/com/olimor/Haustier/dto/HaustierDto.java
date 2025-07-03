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

    public HaustierDto(long id, String cep) {
        this.id = id;
        this.cep = cep;
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
        return new Haustier(this.id, this.cep);

    }
    
}
