import java.util.ArrayList;
import java.util.List;

public class Funcionario {

    private final String nome;
    private final String email;
    private final double salarioBase;
    private final String cargo;
    private final List<Funcionario> funcionarioList;

    public Funcionario(String nome, String email, double salarioBase, String cargo) {
        this.nome = nome;
        this.email = email;
        this.salarioBase = salarioBase;
        this.cargo = cargo;
        this.funcionarioList = new ArrayList<>();
    }

    public double salarioDesenvolvedor() {
        if (salarioBase >= 3.000) {
            double devPor = 20.0 / 100.0;
            return salarioBase - (devPor * salarioBase);
        } else {
            double devPor = 10.0 / 100.0;
            return salarioBase - (devPor * salarioBase);
        }
    }

    public double salarioDBA() {
        if (salarioBase >= 2.000) {
            double devPor = 25.0 / 100.0;
            return salarioBase - (devPor * salarioBase);
        } else {
            double devPor = 15.0 / 100.0;
            return salarioBase - (devPor * salarioBase);
        }
    }

    public double salarioQA() {
        if (salarioBase >= 2.000) {
            double devPor = 25.0 / 100.0;
            return salarioBase - (devPor * salarioBase);
        } else {
            double devPor = 15.0 / 100.0;
            return salarioBase - (devPor * salarioBase);
        }
    }

    public double salarioGerente() {
        if (salarioBase >= 5.000) {
            double devPor = 30.0 / 100.0;
            return salarioBase - (devPor * salarioBase);
        } else {
            double devPor = 20.0 / 100.0;
            return salarioBase - (devPor * salarioBase);
        }
    }

    public void salvaFuncionario(Funcionario funcionario) {
        funcionarioList.add(funcionario);
    }

    public List<Funcionario> getFuncionarioList() {
        return funcionarioList;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public String getCargo() {
        return cargo;
    }

}