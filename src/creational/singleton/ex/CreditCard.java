package creational.singleton.ex;

import creational.singleton.Singleton;

public class CreditCard {
    public static CreditCard instance = null;
    private int money;

    private CreditCard(int money){
        this.money = money;
    }

    public static CreditCard getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null)
                    instance = new CreditCard(10000);
            }
        }
        return instance;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
