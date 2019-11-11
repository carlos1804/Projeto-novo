import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Pessoa implements Identificavel {
	@Id
	private String Nome;
	private Long CPF;
	private Long id;
	@Column(insertable = false, updatable = false)
	private String tipo;
	private String email;
	private String endereço;

	@Override
	public String toString() {
		return "Pessoa [Nome=" + Nome + ", CPF=" + CPF + ", id=" + id + ", email=" + email + ", endereço=" + endereço
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

	public String getEndereço() {
		return endereço;
	}

	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}

}
