public class Shield extends SquareDecorator{

    private int health;

    public Shield(Square receiver){
        super(receiver);
        this.health = 2;
        super.asteroidImpactInstance.attach(this);
        decoratedObject.SetParent(this);
    }

    @Override
    public void Operation() {
        decoratedObject.Operation();
    }

    @Override
    public void Add(BoardComponent child) {
        decoratedObject.Add(child);
    }

    @Override
    public void Remove(BoardComponent child){
        decoratedObject.Remove(child);
    }

    @Override
    public void update(){
        health -= 1;
        int size = GameBoard.Instance().GetBoard().size();
        if(health == 0){
            for(int i = 0 ; i < size; i++){
                int size_y = GameBoard.Instance().GetBoard().get(i).size();
                for(int j = 0 ; j < size_y; j++){
                    if(GameBoard.Instance().GetBoard().get(i).get(j).equals(this)){
                        decoratedObject.SetParent(null);
                        GameBoard.Instance().GetBoard().get(i).set(j,decoratedObject);
                    }
                }
            }
            System.out.println("Shield destroyed");
        }
    }

}
