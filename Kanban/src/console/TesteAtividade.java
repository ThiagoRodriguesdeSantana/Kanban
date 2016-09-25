package console;

import entidade.EAtividade;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import negocio.NAtividade;

public class TesteAtividade {
    
    public static void main(String[] args){
//        try{
//        EAtividade eAtividade = new EAtividade();
//        
//        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
//        Date dateEscrita = format.parse("05/08/2016");
//        java.sql.Date date = new java.sql.Date(dateEscrita.getTime());
//        
//        eAtividade.setDescricao("Testando listar3");
//        eAtividade.setDataDeEntrega(date);
//        eAtividade.setConcluida(false);
//        eAtividade.setRelatoFinal("Crteste2");
//        eAtividade.getUsuario().setCodigo(1);
//        
//        new NAtividade().salvar(eAtividade);
//        
//        }catch(Exception e){
//            e.printStackTrace();
//        }

//        try{
//            NAtividade nAtividade = new NAtividade();
//            
//            Scanner teclado = new Scanner(System.in);
//            
//            int n1 = teclado.nextInt();
//            
//            nAtividade.excluir(n1);
//            
//        }catch(Exception e){
//            e.printStackTrace();
//        }

        try{
            
//            EAtividade eAtividade = new EAtividade();
//            eAtividade.setCodigo(1);
//
//            NAtividade nAtividade = new NAtividade();
//
//            eAtividade = nAtividade.consultar(eAtividade.getCodigo());
//            
//            System.out.println(eAtividade);

            NAtividade nAtividade = new NAtividade();
            
            List<EAtividade> lista = new ArrayList<>();
            
            
            lista = nAtividade.Listar("l");
            
            for (EAtividade eAtividade : lista) {
                System.out.println(eAtividade);
                System.out.println("--------");
            }
            
            
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }
    
}
