/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adicionarimagem;
/**
 * Comandos Get e Set para o o nome e imagem
 * @author Vander
 */
public class Jogo {
    private byte[] imagem;
    private String nome;

   /**
    * Comando getImagem
    */
    public byte[] getImagem() {
        return imagem;
    }
/**
    * Comando setImagem
    */
    public void setImagem(byte[] imagem) {
        this.imagem = imagem;
    }
/**
    * Comando getNome
    */
    public String getNome() {
        return nome;
    }
/**
    * Comando setNome
    */
    public void setNome(String nome) {
        this.nome = nome;
    }

    
    
}
