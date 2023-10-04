package object01.object01_solution;

public class Audience {
    // 관람객 : 소지품을 보관할 가방을 소유

    private Bag bag;

    public Audience(Bag bag) {
        this.bag = bag;
    }

    // getBag() 제거

    public Long buy(Ticket ticket) {
        if (bag.hasInvitaion()) {
            bag.setTicket(ticket);
            return 0L;
        } else {
            // 티켓을 받으면 돈을 지불한다
            bag.setTicket(ticket);
            bag.minusAmount(ticket.getFee());
            return ticket.getFee();
        }
    }
}
