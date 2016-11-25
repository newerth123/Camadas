
package controllers;

import banco.BancoDadosInstituicao;
import models.Aluno;

public class AlunoController {
    public static void adicionarAluno(int codigo, String nome, String cpf){
        Aluno a = new Aluno();
        
        a.setCodigo(codigo);
        a.setNome(nome);
        a.setCpf(cpf);
        
        
        BancoDadosInstituicao.getTabelaAluno().add(a);
        
    }
    
    public static Aluno BuscarPorCodigo(int codigo){
        
        for (Aluno a : BancoDadosInstituicao.getTabelaAluno()){
            if(codigo == a.getCodigo()){
                return a;
            }
            
            
        }
        
        return null;
    }
}
