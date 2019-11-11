
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name="id")
public class Tecnico extends Pessoa implements Identificavel {
	private String curso;

	@Override
	public String toString() {
		return "Tecnico [curso=" + curso + "]";
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	@Override
	public void setId(Long id) {
		// TODO Auto-generated method stub

	}

}
