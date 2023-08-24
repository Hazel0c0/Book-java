package object01;

public class Audience {
    // 관람객 : 소지품을 보관할 가방을 소유

    private Bag bag;

    public Audience(Bag bag) {
        this.bag = bag;
    }

    public Bag getBag() {
        return bag;
    }
}
