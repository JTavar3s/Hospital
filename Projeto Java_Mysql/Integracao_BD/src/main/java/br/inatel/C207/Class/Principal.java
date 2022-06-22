package br.inatel.C207.Class;
import br.inatel.C207.DB.AtendenteDB;
import br.inatel.C207.DB.CadastroDB;
import br.inatel.C207.DB.PacienteDB;
import br.inatel.C207.DB.MedicoDB;
import java.util.Scanner;
public class Principal {



        public static void main(String[] args){
AtendenteDB at1 = new AtendenteDB(); //Instanciando um atendente para usar o CRUD
PacienteDB p1 = new PacienteDB(); // Instanciando um paciente pra atualizar o nome do paciente
CadastroDB cadastro = new CadastroDB(); //Instanciando um cadastro para salvar no paciente
MedicoDB m1 = new MedicoDB(); // Instanciando um medico pra atualizar o nome do medico
/////////////////////////////////////////////////////////////////////
        Cadastro cadastro1 = new Cadastro();  //Instanciando um paciente para tabela
        cadastro.insertCadastro(cadastro1);  //Inserindo um cadastro no banco de dados
            Atendente atendente1 = new Atendente("nathan",10,1,"Setor");
           // at1.insertAtendente(atendente1); //Inserindo um novo atendente
                Paciente paciente1 = new Paciente("Renan","Dor",20,1, atendente1.getId(), cadastro1.getIdCadastro());//Criando o primeiro paciente
        Cadastro cadastro2 = new Cadastro(); //Criando um novo cadastro
        cadastro.insertCadastro(cadastro1); //Inserindo novo cadastro
Paciente paciente2 = new Paciente("DOIDIN","Resfriado",10,2, atendente1.getId(),cadastro2.getIdCadastro()); //Criando o segundo paciente
Funcionarios medico1 = new Medico("Nathan",20,2,"Medico"); //Criando o primeiro medico
cadastro.insertCadastro(cadastro2); //Inserindo um novo cadastroat1.updateAtendente("renan",10,1,"Medico");
        at1.researchAtendentes();
        at1.insertMedico(medico1); //Inserindo um novo medico no banco de dados
             at1.insertPaciente(paciente1); //Inserindo um novo paciente no banco de dados
              at1.insertPaciente(paciente2); //Inserindo um novo paciente no banco de dados
     //  at1.updateAtendente(atendente1);
       //   at1.deleteAtendente(atendente1);
            ///BUSCA DOS DADOS NO INTELIJEI
        at1.researchPacientes(); //Mostrando os pacientes via terminal
        at1.researchAtendentes();  //Mostrando os atendentes via terminal
        at1.researchMedicos();  //Mostrando os medicos via terminal
  //     m1.updateMedico("Renan",2,20,"Medico");
       p1.updatePaciente("rogerio",2,10);


    }
}
