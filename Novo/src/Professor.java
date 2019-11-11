import javax.persistence.Entity;

@Entity
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

}
