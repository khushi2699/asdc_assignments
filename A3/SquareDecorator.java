public abstract class SquareDecorator extends Square{

    protected Square decoratedObject;
    public SquareDecorator(Square square){
        this.decoratedObject = square;
    }
    public void Operation(){
        decoratedObject.Operation();
    }
    public void Add(BoardComponent child){
        decoratedObject.Add(child );
    }
    public void Remove(BoardComponent child){
        decoratedObject.Remove(child);
    }
}
