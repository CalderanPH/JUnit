import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FuncionarioTest {

    @Test
    public void descontaSalarioDevMais() {
        Funcionario joao = new Funcionario(
                "Joao", "joao@joao.com", 5.000, "Desenvolvedor");
        joao.salvaFuncionario(joao);
        double salario = joao.salarioDesenvolvedor();
        assertEquals(1, joao.getFuncionarioList().size());
        assertEquals(4.000, salario, 0.00001);
    }

    @Test
    public void descontaSalarioDevMenos() {
        Funcionario joao = new Funcionario(
                "Joao", "joao@joao.com", 2.000, "Desenvolvedor");
        joao.salvaFuncionario(joao);
        double salario = joao.salarioDesenvolvedor();
        assertEquals(1, joao.getFuncionarioList().size());
        assertEquals(1.800, salario, 0.00001);
    }

    @Test
    public void descontaSalarioDBAMais() {
        Funcionario pedro = new Funcionario(
                "Pedro", "pedro@pedro.com", 3.500, "DBA");
        pedro.salvaFuncionario(pedro);
        double salario = pedro.salarioDBA();
        assertEquals(1, pedro.getFuncionarioList().size());
        assertEquals(2.625, salario, 0.00001);
    }

    @Test
    public void descontaSalarioDBAMenos() {
        Funcionario pedro = new Funcionario(
                "Pedro", "pedro@pedro.com", 1.500, "DBA");
        pedro.salvaFuncionario(pedro);
        double salario = pedro.salarioDBA();
        assertEquals(1, pedro.getFuncionarioList().size());
        assertEquals(1.275, salario, 0.00001);
    }

    @Test
    public void descontaSalarioTestMais() {
        Funcionario maria = new Funcionario(
                "Maria", "maria@maria.com", 2.000, "Testador");
        maria.salvaFuncionario(maria);
        double salario = maria.salarioQA();
        assertEquals(1, maria.getFuncionarioList().size());
        assertEquals(1.500, salario, 0.00001);
    }

    @Test
    public void descontaSalarioTestMenos() {
        Funcionario maria = new Funcionario(
                "Maria", "maria@maria.com", 1.500, "Testador");
        maria.salvaFuncionario(maria);
        double salario = maria.salarioQA();
        assertEquals(1, maria.getFuncionarioList().size());
        assertEquals(1.275, salario, 0.00001);
    }

    @Test
    public void descontaSalarioGerenMais() {
        Funcionario rosa = new Funcionario(
                "Rosa", "rosa@rosa.com", 5.000, "Gerente");
        rosa.salvaFuncionario(rosa);
        double salario = rosa.salarioGerente();
        assertEquals(1, rosa.getFuncionarioList().size());
        assertEquals(3.500, salario, 0.00001);
    }

    @Test
    public void descontaSalarioGerenMenos() {
        Funcionario rosa = new Funcionario(
                "Rosa", "rosa@rosa.com", 3.000, "Gerente");
        rosa.salvaFuncionario(rosa);
        double salario = rosa.salarioGerente();
        assertEquals(1, rosa.getFuncionarioList().size());
        assertEquals(2.400, salario, 0.00001);
    }

}