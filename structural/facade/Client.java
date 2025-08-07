package structural.facade;

public class Client {
    public static void main(String[] args) {
        HomeKeeper keeper = new HomeKeeper();

        keeper.arriveHome();
        System.out.println();
        keeper.leaveHome();
    }
}