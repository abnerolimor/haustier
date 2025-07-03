package com.olimor.Haustier.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Haustier {
    
    @Id
    private long id;
    private String rua;
    private String numero;
    private String bairro;
    private String cep;
    private String complemento;

    @Deprecated
    public Haustier() {
    }


    public Haustier(long id, String cep) {
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


    @Override
    public String toString() {
        return "Haustier [id=" + id + ", cep=" + cep + "]";
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) (id ^ (id >>> 32));
        result = prime * result + ((cep == null) ? 0 : cep.hashCode());
        return result;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Haustier other = (Haustier) obj;
        if (id != other.id)
            return false;
        if (cep == null) {
            if (other.cep != null)
                return false;
        } else if (!cep.equals(other.cep))
            return false;
        return true;
    }
    
}
