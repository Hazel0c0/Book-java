package object01.object01_solution;

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
    public Ticket getTicket() {
        return tickets.remove(0);
    }


    // 판매
    public void minusAmount(Long amount){
        this.amount -= amount;
    }
    public void plusAmount(Long amount){
        this.amount += amount;
    }
}
