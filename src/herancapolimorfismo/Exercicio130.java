package herancapolimorfismo;

import entities.FuncTerceiros;
import entities.Funcionario;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio130 {

    public void exercicio130(){

        int qtdeFuncionarios;
        List<Funcionario> listaFuncionarios = new ArrayList<>();


        Scanner sc = new Scanner(System.in);

        System.out.printf("Digite a quantidade de Funcionários: ");
        qtdeFuncionarios = sc.nextInt();


        for (int i = 0; i < qtdeFuncionarios; i++) {
            System.out.printf("Funcionario é Terceiro? S/N ");
            String resposta = sc.next();
            if (resposta.equals("N")) {
                System.out.printf("Digite o nome do funcionário ID"+(i+1)+": ");
                String nome = sc.next();
                System.out.printf("Digite a qtde de horas do funcionário ID"+(i+1)+": ");
                Integer hora = sc.nextInt();
                System.out.printf("Digite o valor hora do funcionário ID"+(i+1)+": ");
                Double valorHora = sc.nextDouble();
                Funcionario funcionario = new Funcionario(nome,hora,valorHora);
                listaFuncionarios.add(funcionario);

            } else {
                System.out.printf("Digite o nome do funcionário Terceiro ID"+(i+1)+": ");
                String nome = sc.next();
                System.out.printf("Digite a qtde de horas do funcionário Terceiro ID"+(i+1)+": ");
                Integer hora = sc.nextInt();
                System.out.printf("Digite o valor hora do funcionário Terceiro ID"+(i+1)+": ");
                Double valorHora = sc.nextDouble();
                Funcionario funcionarioTerceiro = new FuncTerceiros(nome,hora,valorHora);
                listaFuncionarios.add(funcionarioTerceiro);
            }

        }

        for (Funcionario listaDeFuncionarios: listaFuncionarios) {
            System.out.println("Nome do Funcionario: " + listaDeFuncionarios.getNome()
                    + " - Pagamento: " + listaDeFuncionarios.pagamento(listaDeFuncionarios.getHora(), listaDeFuncionarios.getValorPorHora()) );

        }

        sc.close();


    }
}
