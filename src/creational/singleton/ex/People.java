package creational.singleton.ex;

public class People {
    private final CreditCard card;
    private final String name;

    public People(String name){
        this.card = CreditCard.getInstance();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void useCard(int money){
        int balance = card.getMoney() - money;
        if(balance >= 0){
            System.out.println("\n사용자 : " + getName() + "\n현재 잔액은 : " + balance);
            card.setMoney(balance);
        }
        else{
            System.out.println("\n잔액이 부족합니다.");
        }
    }
}
