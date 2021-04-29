package excecoes;

import entities.Reserva;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Exercicio145 {

    public void exercicio145() {


        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");

        try {
            Date entrada = sdf1.parse("10/04/2021");
            Date saida = sdf1.parse("11/04/2021");

            Reserva testeReserva = new Reserva(111, entrada, saida);
            System.out.println(testeReserva.toString());

            System.out.println("Datas atualizadas: ");
            entrada = sdf1.parse("29/04/2021");
            saida = sdf1.parse("30/04/2021");

            testeReserva.atualizarDatas(entrada, saida);
            System.out.println(testeReserva.toString());
        } catch (ParseException e) {
            System.out.println("Formato de data inválida");
        } catch (DomainException e) {
            System.out.println("Erro na reserva: " + e.getMessage());
        }
    }
}
