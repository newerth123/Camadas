
package views;

import banco.BancoDadosInstituicao;
import controllers.AlunoController;
import java.util.InputMismatchException;
import java.util.Scanner;
import models.Aluno;

public class Alunoview {
    
    static Scanner scan = new Scanner(System.in);
    
    public void exibirMenuAluno(){
        System.out.println("1 - Cadastrar Aluno");
        System.out.println("2 - Listar Aluno");
        System.out.println("3 - Buscar Aluno por Codigo");
        
        System.out.print("Digite: ");
        
        try{
            int opcao = scan.nextInt();
            scan.nextLine();
            
            switch(opcao){
            case 1:
                adicionarAluno();
                break;
            case 2:
                ListarAluno();
                break;
            case 3:
                BuscarAlunoPorCodigo();
            default:
                System.out.println("Opção Inválida."); 
                break;
            }
        }catch(InputMismatchException ie){
            System.out.println("ERRO: Digíte um Número Inteiro.(" + ie.toString() + ")");
            scan.nextLine();
        }catch(Exception e){
            System.out.println("ERRO Inesperado! (" + e.toString() + ")");
            scan.nextLine();    
        }
        
        
        
               
        
                
    }
    
    public void adicionarAluno(){
        System.out.print("Digite o codigo do aluno: ");
        int cod = scan.nextInt();
        scan.nextLine();
        
        
        System.out.print("Digite o nome do aluno: ");
        String nome = scan.nextLine();
        
        System.out.print("Digite o CPF do aluno: ");
        String cpf = scan.nextLine();
        
        AlunoController.adicionarAluno(cod, nome, cpf);
        
        
    }

    private void ListarAluno() {
        System.out.println("--");
        for (Aluno a : BancoDadosInstituicao.getTabelaAluno()){
            
            System.out.println("Codigo: " + a.getCodigo());
            System.out.println("Nome: " + a.getNome());
            System.out.println("CPF: " + a.getCpf());
            System.out.println("");
            
            
        }
        System.out.println("--");
        
    }

    private void BuscarAlunoPorCodigo() {
        
        System.out.print("Digite o Codigo do Aluno: ");
        int cod = scan.nextInt();
        scan.nextLine();
        System.out.println("--");
        
        
        Aluno z = AlunoController.BuscarPorCodigo(cod);
        
        if(z != null){
            System.out.println("Codigo: " + z.getCodigo());
            System.out.println("Nome: " + z.getNome());
            System.out.println("CPF: " + z.getCpf());
            System.out.println("");
        }else{
            System.out.println("Aluno não Cadastrado.");
        }
      
    }
}
