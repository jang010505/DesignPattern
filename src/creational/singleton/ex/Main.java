package creational.singleton.ex;

public class Main {
    public static void main(String[] args) {
        People mother = new People("엄마");
        People father = new People("아빠");

        father.useCard(1000);
        mother.useCard(9000);
        father.useCard(1000);
    }
}
