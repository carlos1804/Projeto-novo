import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Random rdn = new Random();
		for (int i = 0; i < 3000; i++) {
			Aluno aluno = new Aluno();
			aluno.setCPF(rdn.nextLong());
			aluno.setCurso("Informática" + rdn.nextInt());
			aluno.setEmail("Eixx" + rdn.nextInt());
			aluno.setEndereço("Endereço" + rdn.nextInt());
			aluno.setId(rdn.nextLong());
			aluno.setMatricula(rdn.nextInt());
			aluno.setNome("Hellen" + rdn.nextInt());

			DAO<Aluno> dao = new DAO<Aluno>();
			dao.save(aluno);
		}

	}

}
