import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class EmpresaFuncionarioController {
    public static void main(String[] args) {

        Empresa e1 = new Empresa("1987456321", "LIFEMED  INDUSTRIAL DE EQUIPAMENTOS E ARTIGOS MEDICOS E HOSPITALARES S.A.", "LIFEMED");
        Empresa e2 = new Empresa("198574652", "OSIRNET INFO TELECOM LTDA.", "OSIRNET");


        Funcionario func1 = new Funcionario(187, "15215429887", "Roberto", "Cardoso", LocalDate.of(1989, 10, 18), e1);
        Funcionario func2 = new Funcionario(189, "18745236598", "Patricia", "Santos", LocalDate.of(1975, 2, 28), e1);
        Funcionario func3 = new Funcionario(3265, "04255410235", "Laissa", "Menezes", LocalDate.of(1995, 12, 14), e1);
        Funcionario func4 = new Funcionario(3245,"14365898710", "Bianca", "Soares",  LocalDate.of(1991, 4, 1), e2);
        Funcionario func5 = new Funcionario(3289, "78496532102", "Sandro", "Almeida",  LocalDate.of(1988, 6, 29), e2);
        Funcionario func6 = new Funcionario(3395, "75421425398", "Lucas", "Menezes",  LocalDate.of(1995, 4, 29), e2);

        System.out.println("\n" + func1);

        List<Funcionario> funcionarioE1List = new ArrayList<>();
        funcionarioE1List.add(func1);
        funcionarioE1List.add(func2);
        funcionarioE1List.add(func3);

    }
}
