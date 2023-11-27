import java.util.Comparator;

public class AlunoDisciplinaController {
    public static void main(String[] args) {
        Aluno a1 = new Aluno(19292L, "Mariana", "Silva");
        Aluno a2 = new Aluno(189232L, "Beatriz", "Silveira");

        Disciplina d1 = new Disciplina(011L, "Desenvolvimento Frontend I");
        Disciplina d2 = new Disciplina(012L, "Banco de Dados II");
        Disciplina d3 = new Disciplina(013L,"Desenvolvimento Backend I");

        a1.getDisciplinaList().add(d1);
        a1.getDisciplinaList().add(d2);

        a2.getDisciplinaList().add(d1);
        a2.getDisciplinaList().add(d2);
        a2.getDisciplinaList().add(d3);

        System.out.println("Impressão de disciplinas por aluno em ordem crescente:");
        a1.getDisciplinaList().sort(Comparator.comparing(Disciplina::getNome));
        System.out.println(a1);

        a2.getDisciplinaList().sort(Comparator.comparing(Disciplina::getNome));
        System.out.println(a2);

        a2.getDisciplinaList().clear();
        System.out.println("Impressão de disciplinas após a remoção de matrícula de a2");
        a1.getDisciplinaList().sort(Comparator.comparing(Disciplina::getNome));
        System.out.println(a1);
        a2.getDisciplinaList().sort(Comparator.comparing(Disciplina::getNome));
        System.out.println(a2);
    }
}
