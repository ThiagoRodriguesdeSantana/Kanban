package entidade;

import java.sql.Date;

public class EAtividade {
    private int codigo;
    private String descricao;
    private Date dataDeEntrega;
    private boolean concluida;
    private String relatoFinal;
    private Usuario usuario;

    public EAtividade() {
        this.usuario = new Usuario();
    }
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getDataDeEntrega() {
        return dataDeEntrega;
    }

    public void setDataDeEntrega(Date dataDeEntrega) {
        this.dataDeEntrega = dataDeEntrega;
    }

    public boolean isConcluida() {
        return concluida;
    }

    public void setConcluida(boolean concluida) {
        this.concluida = concluida;
    }

    public String getRelatoFinal() {
        return relatoFinal;
    }

    public void setRelatoFinal(String relatoFinal) {
        this.relatoFinal = relatoFinal;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    
}