
public class Main {

	public static void main(String[] args) {

		Aluno aluno = new Aluno();
		aluno.setCPF(123456789);
		aluno.setCurso("Informatica");
		aluno.setEmail("Eixx@gmail.com");
		aluno.setEndereço("Rua XXXX");
		aluno.setId(1d);
		aluno.setMatricula(123);
		aluno.setNome("Hellen");

		DAO<Aluno> dao = new DAO<Aluno>();
		dao.save(aluno);
	}

}
