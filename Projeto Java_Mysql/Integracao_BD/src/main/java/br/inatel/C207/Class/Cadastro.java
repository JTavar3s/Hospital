package br.inatel.C207.Class;

public class Cadastro {
 private static int IdCadastro=0;
    public int getIdCadastro() {
        return IdCadastro;
    }
public Cadastro() {
IdCadastro++;
}
}