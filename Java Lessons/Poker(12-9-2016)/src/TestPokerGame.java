


public class TestPokerGame {

    public static void main(String args[]) {
        SimplePoker pokergame;
        if (args.length > 0)
            pokergame = new SimplePoker(Integer.parseInt(args[0]));
        else
            pokergame = new SimplePoker();
        pokergame.play();
    }
}