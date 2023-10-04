package object01.객체_설계.object01_solution;

public class TicketSeller {
    // 판매원

    private TicketOffice ticketOffice;

    public TicketSeller(TicketOffice ticketOffice) {
        this.ticketOffice = ticketOffice;
    }

    /*
    ** getTicketOffice 메서드 제거
    TicketOffice에 대한 접근이 오로지 TicketSeller에서 이루어 지기 때문에 필요가 없어짐

    => 객체 내부적인 상황을 감추는 것을 캡슐화(encapsulation)이라고 한다.
     */

    // 두 번째 : TicketSeller - Audience 의존성 제거
    // 3. 아직 seller는 office의 자율권을 침해.
    public void sellTo(Audience audience){
//        ticketOffice.plusAmount(audience.buy(ticketOffice.getTicket()));
        // sellTicketTo 메서드를 호출 -> 인터페이스에 의존하게 됨
        ticketOffice.sellTicketTo(audience);
        /*
        그러나 TicketOffice 와 Audience 사이에 의존성이 추가됨!!
        TicketOffice 의 자율성을 높였지만 전체 설계 관점에서 결합도가 상승함.

        ** 현실에서는 수동적이지만
        의인화 : 객체지향에서 능동적이고 자율적인 존재로 소프트웨어 객체를 설계하는 원칙
         */
    }
}
