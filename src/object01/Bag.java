package object01;

public class Bag {
    private Long amount; // 현금
    private Invitation invitation;
    private Ticket ticket;

    // 1. 초대장 유무 판단
    // 인스턴스 생성 시점에서 제약 강제
    public Bag(long amount){
        this(null, amount);
    }
    public Bag(Invitation invitation, long amount){
        this.invitation = invitation;
        this.amount = amount;
    }


    // 초대장 & 티켓 소유 여부
    public boolean hasInvitaion() {
        return invitation != null;
    }

    public boolean hasTicket(){
        return ticket != null;
    }

    public void setTicket(Ticket ticket){
        // 초대장 -> 티켓 교환
        this.ticket = ticket;
    }

    // 현금 증가 감소
    public void minusAmount(Long amount){
        this.amount -= amount;
    }
    public void plusAmount(Long amount){
        this.amount += amount;
    }
}
