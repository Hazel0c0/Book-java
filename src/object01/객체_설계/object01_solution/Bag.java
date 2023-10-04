package object01.객체_설계.object01_solution;

public class Bag {
  private Long amount; // 현금
  private Ticket ticket;
  private Invitation invitation;

  // 2. hold 메서드를 추가해 응집도 ↑
  public Long hold(Ticket ticket) {
    if (hasInvitaion()) {
      setTicket(ticket);
      return 0L;
    } else {
      setTicket(ticket);
      minusAmount(ticket.getFee());
      return ticket.getFee();
    }
  }

  // 1. 초대장 유무 판단
  // 인스턴스 생성 시점에서 제약 강제
  public Bag(long amount) {
    this(null, amount);
  }

  public Bag(Invitation invitation, long amount) {
    this.invitation = invitation;
    this.amount = amount;
  }


  // 초대장 & 티켓 소유 여부
  public boolean hasInvitaion() {
    return invitation != null;
  }

  public boolean hasTicket() {
    return ticket != null;
  }

  /*
  2. public -> private 변경
  아래 메서드들은 hold 메서드를 통해 내부에서만 사용됨
  코드 재사용, 표현력 ↑
   */
  private void setTicket(Ticket ticket) {
    // 초대장 -> 티켓 교환
    this.ticket = ticket;
  }

  // 현금 증가 감소
  private void minusAmount(Long amount) {
    this.amount -= amount;
  }

  private void plusAmount(Long amount) {
    this.amount += amount;
  }
}
