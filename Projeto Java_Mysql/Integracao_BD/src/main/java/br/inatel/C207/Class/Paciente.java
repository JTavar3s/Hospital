package br.inatel.C207.Class;
import br.inatel.C207.Class.Atendente;

    public class Paciente{
        private String nomePaciente;
        private String sintomas;
        private int idade;
        private int idPaciente;
        private int AtendenteDB_idAtendenteDB=0;
        private int CadastroDB_IdCadastro=0 ;

        public Paciente(int idPaciente){
            this.idPaciente = idPaciente;
        }
        public Paciente(){
        }

        public Paciente(String nomePaciente, String sintomas,int idade,int idPaciente,int AtendenteDB_idAtendenteDB,int CadastroDB_IdCadastro ) {
            this.sintomas = sintomas;
            this.nomePaciente = nomePaciente;
            this.idade = idade;
            this.idPaciente = idPaciente;
            this.AtendenteDB_idAtendenteDB = AtendenteDB_idAtendenteDB;
            this.CadastroDB_IdCadastro = CadastroDB_IdCadastro;

        }

        public void pedirConsulta(){
            System.out.println("Pedir consulta");
        }

        public void removerUsuario(String nomePaciente){
            this.nomePaciente = nomePaciente;
        }
        public int getCadastroDB_IdCadastro() {return CadastroDB_IdCadastro;}
        public void setCadastroDB_IdCadastro(int cadastroDB_IdCadastro) {CadastroDB_IdCadastro = cadastroDB_IdCadastro;}
        public String getNomePaciente() {return nomePaciente;}
        public void setNomePaciente(String nomePaciente) {this.nomePaciente = nomePaciente;}
        public String getSintomas() {return sintomas;}
        public void setSintomas(String sintomas) {this.sintomas = sintomas;}
        public int getIdade() {return idade;}
        public void setIdade(int idade) {this.idade = idade;}
        public int getIdPaciente() {return idPaciente;}
        public void setIdPaciente(int idPaciente) {this.idPaciente = idPaciente;}
        public int getAtendenteDB_idAtendenteDB() {return AtendenteDB_idAtendenteDB;}
        public void setAtendenteDB_idAtendenteDB(int AtendenteDB_idAtendenteDB) {this.AtendenteDB_idAtendenteDB = AtendenteDB_idAtendenteDB;}
    }

