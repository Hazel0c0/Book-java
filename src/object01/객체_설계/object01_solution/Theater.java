package object01.객체_설계.object01_solution;

public class Theater {
  // 소극장

  private TicketSeller ticketSeller;

  public Theater(TicketSeller ticketSeller) {
    this.ticketSeller = ticketSeller;
  }

  // 관람객 입장
    /*
        *** 해결 방법
        Theater 소극장은 관람객의 입장 사실만을 필요로 함
        관람객과 판매원을 '자율적인 존재'로
     */

  // 첫 번째 : Theater - TicketOffice 의존성 제거
  public void enter(Audience audience){
    // 티켓 판매에 관련된 기존 코드를 TicketSeller(판매원)로 이동

    // sellTo 메서드를 호출하도록 변경
    ticketSeller.sellTo(audience);

    /* => TicketSeller의 인터페이스에만 의존하도록 수정함.
     seller가 office를 포함하고 있다는 사실은 구현의 영역에 속한다.
     */
  }
}