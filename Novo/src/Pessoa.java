import javax.persistence.Column;
	import javax.persistence.DiscriminatorColumn;
	import javax.persistence.DiscriminatorType;
	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	import javax.persistence.Inheritance;
	import javax.persistence.InheritanceType;

	@Entity
	@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
	@DiscriminatorColumn(name = "tipo", length = 1, discriminatorType = DiscriminatorType.STRING)
public abstract class Pessoa implements Identificavel {
	@Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
	private String Nome;
	private Long CPF;
	private Long id;
	@Column(insertable = false, updatable = false)
	private String tipo;
	private String email;
	private String endereco;

	@Override
	public String toString() {
		return "Pessoa [Nome=" + Nome + ", CPF=" + CPF + ", id=" + id + ", email=" + email + ", endereco=" + endereco
				+ "]";
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public Long getCPF() {
		return CPF;
	}

	public void setCPF(int i) {
		CPF = (long) i;
	}

	public Long getId() {
		return id;
	}

	public void setId(double d) {
		this.id = (long) d;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

}
