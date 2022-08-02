import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Funcionario {
    private String nome;
    private String email;
    private double salarioBase;
    private String cargo;
    private List<Funcionario> funcionarioList;

    public Funcionario(String nome, String email, double salarioBase, String cargo) {
        this.nome = nome;
        this.email = email;
        this.salarioBase = salarioBase;
        this.cargo = cargo;
        this.funcionarioList = new ArrayList<Funcionario>();
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

    public double calcDesenvolvedor() {
        if (salarioBase >= 3.000) {
            double devPor = 20.0 / 100.0;
            double salarioDev = salarioBase - (devPor * salarioBase);
            return salarioDev;
        } else {
            double devPor = 10.0 / 100.0;
            double salarioDev = salarioBase - (devPor * salarioBase);
            return salarioDev;
        }
    }

    public double calcDBA() {
        if (salarioBase >= 2.000) {
            double devPor = 25.0 / 100.0;
            double salarioDev = salarioBase - (devPor * salarioBase);
            return salarioDev;
        } else {
            double devPor = 15.0 / 100.0;
            double salarioDev = salarioBase - (devPor * salarioBase);
            return salarioDev;
        }
    }

    public double calcTest() {
        if (salarioBase >= 2.000) {
            double devPor = 25.0 / 100.0;
            double salarioDev = salarioBase - (devPor * salarioBase);
            return salarioDev;
        } else {
            double devPor = 15.0 / 100.0;
            double salarioDev = salarioBase - (devPor * salarioBase);
            return salarioDev;
        }
    }

    public double calcGeren() {
        if (salarioBase >= 5.000) {
            double devPor = 30.0 / 100.0;
            double salarioDev = salarioBase - (devPor * salarioBase);
            return salarioDev;
        } else {
            double devPor = 20.0 / 100.0;
            double salarioDev = salarioBase - (devPor * salarioBase);
            return salarioDev;
        }
    }

    public void salvaFuncionario(Funcionario funcionario) {
        funcionarioList.add(funcionario);
    }

    public List<Funcionario> getFuncionarioList() {
        return Collections.unmodifiableList(funcionarioList);
    }

}
