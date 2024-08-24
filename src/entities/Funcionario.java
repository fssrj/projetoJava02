package entities;

import java.util.Date;

import enums.TipoContratacao;

public class Funcionario extends Pessoa{
		
	private String matricula;
	private Date dataAdmissao;
	private TipoContratacao tipoContratacao;
	
	public Funcionario() {
		// TODO Auto-generated constructor stub
	}

	public Funcionario(String matricula, Date dataAdmissao, TipoContratacao tipoContratacao) {
		super();
		this.matricula = matricula;
		this.dataAdmissao = dataAdmissao;
		this.tipoContratacao = tipoContratacao;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public Date getDataAdmissao() {
		return dataAdmissao;
	}

	public void setDataAdmissao(Date dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}

	public TipoContratacao getTipoContratacao() {
		return tipoContratacao;
	}

	public void setTipoContratacao(TipoContratacao tipoContratacao) {
		this.tipoContratacao = tipoContratacao;
	}
		
	
}
