import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
@Entity
@DiscriminatorValue(value = "P")
public class Professor extends Pessoa implements Identificavel {
	private String disciplina;

	@Override
	public String toString() {
		return "Professor [disciplina=" + disciplina + "]";
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

	@Override
	public void setId(Long id) {
		// TODO Auto-generated method stub
		
	}

}
