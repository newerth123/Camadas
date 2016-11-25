package aula2311_camadas;

import banco.BancoDadosInstituicao;
import views.Alunoview;

public class Aula2311_Camadas {

    public static void main(String[] args) {
            BancoDadosInstituicao.inicializarBanco();
            
            Alunoview alunoview = new Alunoview();
            
            while(true){
                alunoview.exibirMenuAluno();
            }
    }
    
}
