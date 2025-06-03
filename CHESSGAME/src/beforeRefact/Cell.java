package beforeRefact;

public class Cell {
	public Cell(Color color) {
		// TODO Auto-generated constructor stub
	}

	public class Move
	{
	    private Position _from, _to;

	    public Move(Position from, Position to)
	    {
	        _from = from;
	        _to = to;
	    }

	    public Position getFrom()
	    {
	        return _from;
	    }

	    public Position getTo()
	    {
	        return _to;
	    }
	}
}
