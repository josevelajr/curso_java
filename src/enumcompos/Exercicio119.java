package enumcompos;

import entities.Department;
import entities.HourContract;
import entities.Worker;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Exercicio119 {
    public void exercicio119() throws ParseException {
        int numeroContratos;

        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");

        Worker trabalhador = new Worker();
        System.out.print("Digite o nome do trabalhador: ");
        trabalhador.setName(sc.nextLine());
        System.out.println();
        System.out.print("Digite o nível do trabalhador: ");
        trabalhador.setLevel(WorkerLevel.valueOf(sc.nextLine()));
        System.out.println();
        System.out.print("Digite a base salarial: ");
        trabalhador.setBaseSalary(sc.nextDouble());
        System.out.println();
        System.out.print("Digite o nome do departamento: ");
        Department departamento = new Department(sc.next());
        trabalhador.setDepartment(departamento);
        System.out.println();


        System.out.print("Trabalhador possui contratos (Sim/Não) ? ");
        String respostaContratos;
        respostaContratos = sc.next();

        if (respostaContratos.equals("Sim")) {
            System.out.print("Digite o numero de contratos que o trabalhador possui: ");
            numeroContratos = sc.nextInt();
            System.out.println();
            for (int i = 0; i < numeroContratos; i++) {
                HourContract contract = new HourContract();
                System.out.print("Digite a data do contrato (dd/MM/yyyy) - "+(i+1)+" ");
                Date contractDate = sdf1.parse(sc.next());
                contract.setDate(contractDate);
                System.out.print("Digite o valor do contrato "+(i+1)+" ");
                contract.setValuePerHour(sc.nextDouble());
                System.out.print("Digite a quantidade de horas do contrato "+(i+1)+" ");
                contract.setHours(sc.nextInt());
                trabalhador.addContract(contract);
            }
        }

        System.out.print("Digite mês e ano para calcular salário: (MM/YYYY)");
        String mesEAno = sc.next();
        int mes = Integer.parseInt(mesEAno.substring(0,2));
        int ano = Integer.parseInt(mesEAno.substring(3,7));


        System.out.println(trabalhador.toString());
        System.out.println("A soma total dos contratos é: " + trabalhador.totalIncome());
        System.out.println("A soma total dos contratos do mês "+mes+" ano "+ano+" é de: " + trabalhador.income(mes,ano));

        sc.close();


    }
}
