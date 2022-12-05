import java.util.ArrayList;
public abstract class Subject {

    private ArrayList<BoardComponent> boardComponentArrayList = new ArrayList<BoardComponent>();

    public void attach(BoardComponent boardComponent){
        boardComponentArrayList.add(boardComponent);
    }

    public void detach(BoardComponent boardComponent){
        boardComponentArrayList.remove(boardComponent);
    }

    public void notifyObservers(BoardComponent parent){
            parent.update();
    }
}
