package object01.객체_설계;

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
