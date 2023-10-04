package object01.객체_설계.object01_solution;

public class Audience {
  // 관람객 : 소지품을 보관할 가방을 소유

  /* 2.
  Audience는 자율적인 존재
  Bag은 아직 수동적.
  => 캡슐화로 결합도를 낮추자!
   */
  private Bag bag;

  public Audience(Bag bag) {
    this.bag = bag;
  }


  public Long buy(Ticket ticket) {
    // 2. 인터페이스에 의존하도록 수정
    return bag.hold(ticket);
    // 1. getBag() 제거
//        if (bag.hasInvitaion()) {
//            bag.setTicket(ticket);
//            return 0L;
//        } else {
//            // 티켓을 받으면 돈을 지불한다
//            bag.setTicket(ticket);
//            bag.minusAmount(ticket.getFee());
//            return ticket.getFee();
//        }
  }
}
