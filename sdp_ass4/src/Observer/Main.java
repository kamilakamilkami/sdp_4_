package Observer;

public class Main {
    public static void main(String[] args) {
        NewAgency agency = new NewAgency();
        NewChannel channel1 = new NewChannel("Channel 1 ");
        NewChannel channel2 = new NewChannel("Channel 2 ");

        agency.addObserver(channel1);
        agency.addObserver(channel2);

        agency.setHeadline("Breaking News!");
    }
}
