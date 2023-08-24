package object01;

public class TicketSeller {
    // 판매원

    private TicketOffice ticketOffice;

    public TicketSeller(TicketOffice ticketOffice) {
        this.ticketOffice = ticketOffice;
    }

  public TicketOffice getTicketOffice() {
    return ticketOffice;
  }
}
