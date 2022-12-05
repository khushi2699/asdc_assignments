// This is the base Component abstract for the game's Composite pattern.
public abstract class BoardComponent implements ISubjectObserver
{
	protected BoardComponent boardComponentParent;
	protected AsteroidImpact asteroidImpactInstance = AsteroidImpact.Instance();

	public BoardComponent()
	{
		boardComponentParent = null;
	}
	
	public abstract void Operation();
	public abstract void Add(BoardComponent child);
	public abstract void Remove(BoardComponent child);
	public void SetParent(BoardComponent parent)
	{
		this.boardComponentParent = parent;
	}
}