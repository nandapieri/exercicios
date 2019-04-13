package entities;

public class Funcionario {
	private Integer id;
	private String nome;
	private Double salario;
	
	public Funcionario(Integer id, String nome, Double salario) {
		super();
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}

	public Integer getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getSalario() {
		return salario;
	}
	
	public void aumentaSalario (Double percent) {
		this.salario = this.salario + this.salario * (percent/100);
	} 
	
	public String toString() {
		return id+" ,"+nome+" ,"+String.format("%.2f", salario);
	}

}
