package object01.object01_solution;

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
    public void sellTo(Audience audience){
        ticketOffice.plusAmount(audience.buy(ticketOffice.getTicket()));
    }
}
