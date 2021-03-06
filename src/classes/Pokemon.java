/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import enums.ETipo;

/**
 *
 * @author Luis Guilherme
 */
public class Pokemon {
    
    private String nome;
    private ETipo tipo;
    private double peso;
    private double altura;
    private int ataque;
    private int forca;
    private int defesa;
    private int agilidade;
    private String ataqueEspecial;
    private int codigo;

    public Pokemon() {
    }

    public Pokemon(String nome, ETipo tipo, double peso, double altura, int ataque, int forca, int defesa, int agilidade, int codigo) {
        this.nome = nome;
        this.tipo = tipo;
        this.peso = peso;
        this.altura = altura;
        this.ataque = ataque;
        this.forca = forca;
        this.defesa = defesa;
        this.agilidade = agilidade;
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ETipo getTipo() {
        return tipo;
    }

    public void setTipo(ETipo tipo) {
        this.tipo = tipo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    public int getAgilidade() {
        return agilidade;
    }

    public void setAgilidade(int agilidade) {
        this.agilidade = agilidade;
    }

    public String getAtaqueEspecial() {
        return ataqueEspecial;
    }

    public void setAtaqueEspecial(String ataqueEspecial) {
        this.ataqueEspecial = ataqueEspecial;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return  "Nome: " + nome 
                + "\nTipo: " + tipo 
                + "\nPeso: " + peso 
                + "\nAltura: " + altura 
                + "\nAtaque: " + ataque 
                + "\nForça: " + forca 
                + "\nDefesa: " + defesa 
                + "\nAgilidade: " + agilidade 
                + "\nAtaque Especial: " + ataqueEspecial 
                + "\nCodigo: " + codigo
                + "\n*******************************************************";
    }
}
