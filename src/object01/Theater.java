package object01;

public class Theater {
  // 소극장

  private TicketSeller ticketSeller;

  public Theater(TicketSeller ticketSeller) {
    this.ticketSeller = ticketSeller;
  }

  // 관람객 입장
  /*
    문제점 1. 관람객과 판매원이 소극장의 통제를 받는 수동적인 존재
    - 소극장에서 관람객에 가방에 직접 접근
    - 매표소의 돈에 직접 접근
    => 상식과 다르다

     and 코드를 이해하기 위해 여러가지 세부적 내용들을 기억하고 있어야함

     문제점 2. 변경에 취약한 코드
     과도한 의존성(dependency)에 의해 객체의 일부가 변경될 때 다른 객체에 끼치는 영향이 크다
     => 결합도(coupling) 가 높다
   */
  public void enter(Audience audience){
    if (audience.getBag().hasInvitaion()) {
      // 초대장이 있다면
      Ticket ticket = ticketSeller.getTicketOffice().getTicket();
      // 판매원이 티켓을 발매해줌

      audience.getBag().setTicket(ticket);
      // 가방에 티켓을 넣어준다
    } else {
      Ticket ticket = ticketSeller.getTicketOffice().getTicket();
      audience.getBag().minusAmount(ticket.getFee());
      // 관객의 가방에서 돈을 인출
      ticketSeller.getTicketOffice().plusAmount(ticket.getFee());
      // 매표원은 티켓 티켓 가격을 받음
      audience.getBag().setTicket(ticket);
    }
  }
}
