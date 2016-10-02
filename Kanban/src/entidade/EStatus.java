/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidade;

public class EStatus {
    
    public String novo;
    public String analise;
    public String desenvolvimento;
    public String desenvolvido;

    /**
     * @return the novo
     */
    public String getNovo() {
        return "Novo";
    }

    /**
     * @return the analise
     */
    public String getAnalise() {
        return "Em Analise";
    }

    /**
     * @return the desenvolvimento
     */
    public String getDesenvolvimento() {
        return "Em Desenvolvimento";
    }

    /**
     * @return the desenvolvido
     */
    public String getDesenvolvido() {
        return "Desenvolvido";
    }
}
