public class SpawnShieldCommand extends Command{

    public SpawnShieldCommand(Object receiver, String[] args) { //square args 00
        super(receiver, args);
    }

    @Override
    public void Execute() {
        Square square = (Square) receiver;
        IAsteroidGameFactory factory = GameBoard.Instance().GetFactory();
        System.out.println();
        System.out.println("Spawning Shield at (" + args[0] + "," + args[1] + ")");
        BoardComponent boardComponent = factory.MakeShield(square);
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        GameBoard.Instance().GetBoard().get(y).set(x,boardComponent);

    }
}