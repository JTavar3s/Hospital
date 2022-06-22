package br.inatel.C207.Class;

public class Medico extends Funcionarios implements Cirurgia{
    public Medico(String nome,int idade,int id,String setor){
        super(nome, idade, id, setor);
    }
    public void fazerCirurgia() {
        System.out.println("Fazendo cirurgia!");
    }

    public void fazerCafe() {
        System.out.println("Fazer café");
    }
}
