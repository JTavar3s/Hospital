package br.inatel.C207.Class;

import br.inatel.C207.DB.Database;

public abstract class Funcionarios extends Database {
    private String nome;
    private int idade=0;
    private int id=0;
    private String setor;

    public Funcionarios(String nome, int idade, int id , String setor ) {
        this.nome = nome;
        this.idade = idade;
        this.setor = setor;
        this.id = id;
    }
    public abstract void fazerCafe();
    public String getSetor() {return setor;}
    public void setSetor(String setor) {this.setor = setor;}
    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}
    public int getIdade() {return idade;}
    public int getId() {return id;}
    public void setId(int id) {this.id = id;}
    public void setIdade(int idade) {
        this.idade = idade;
    }
}
