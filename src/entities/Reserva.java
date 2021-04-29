package entities;

import excecoes.DomainException;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reserva {

    private Integer numeroQuarto;
    private Date checkin;
    private Date checkout;
    private static SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");

    public Reserva() {
    }

    public Reserva(Integer numeroQuarto, Date checkin, Date checkout) throws DomainException {
        if (checkout.before(checkin)){
            throw new DomainException("Data final deve ser superior a data inicial");
        }
        this.numeroQuarto = numeroQuarto;
        this.checkin = checkin;
        this.checkout = checkout;
    }

    public Integer getNumeroQuarto() {
        return numeroQuarto;
    }

    public void setNumeroQuarto(Integer numeroQuarto) {
        this.numeroQuarto = numeroQuarto;
    }

    public Date getCheckin() {
        return checkin;
    }

    public Date getCheckout() {
        return checkout;
    }


    public long duracao() {
        long diferenca = checkout.getTime() - checkin.getTime();
        return TimeUnit.DAYS.convert(diferenca, TimeUnit.MILLISECONDS);
    }

    public void atualizarDatas(Date checkin, Date checkout) throws DomainException {

        if (getCheckin().after(checkin) || getCheckout().after(checkout)){
            throw new DomainException("Data de reservas devem ser maiores que datas anteriores");
        }
        if (checkout.before(checkin)){
            throw new DomainException("Data final deve ser superior a data inicial");
        }

        this.checkin = checkin;
        this.checkout = checkout;

    }

    @Override
    public String toString() {

        return "Reserva{" +
                "numeroQuarto=" + numeroQuarto +
                ", checkin=" + sdf1.format(checkin) +
                ", checkout=" + sdf1.format(checkout) +
                ", Noites=" + duracao() +
                '}';
    }
}
