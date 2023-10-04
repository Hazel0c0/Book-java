package object01.객체_설계.object01_solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TicketOffice {
    // 매표소

    private Long amount;
    private List<Ticket> tickets = new ArrayList<>();

    public TicketOffice(Long amount, Ticket ... tickets){
        this.amount = amount;
        this.tickets.addAll(Arrays.asList(tickets));
    }
    // 티켓 판매
    private Ticket getTicket() {
        return tickets.remove(0);
    }

    // 판매
    public void minusAmount(Long amount){
        this.amount -= amount;
    }
    private void plusAmount(Long amount){
        this.amount += amount;
    }

    public void sellTicketTo(Audience audience){
    // sellTo 메서드 이동
    // getTicket 메스드와 plusAmount 는 내부에서만 사용됨
        plusAmount(audience.buy(getTicket()));
    }

}
