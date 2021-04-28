package excecoes;

import entities.Reserva;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Exercicio143 {

    public void exerciocio143() throws ParseException {
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");

        Date entrada = sdf1.parse("27/04/2021");
        Date saida = sdf1.parse("28/04/2021");

        if (saida.before(entrada)) {
            System.out.println("Data de saida maior que data de entrada!");
        } else {
            Reserva testeReserva = new Reserva(111, entrada, saida);
            System.out.println(testeReserva.toString());

            System.out.println("Datas atualizadas: ");
            entrada = sdf1.parse("29/04/2021");
            saida = sdf1.parse("16/05/2021");
            if (testeReserva.getCheckin().after(entrada) || testeReserva.getCheckout().after(saida)) {
                System.out.println("Data de entrada e/ou saida devem ser maiores que as datas anteriores");
            } else if (saida.before(entrada)) {
                System.out.println("Data de saida maior que data de entrada!");
            } else {
                testeReserva.atualizarDatas(entrada, saida);
                System.out.println(testeReserva.toString());
            }
        }

    }


}
