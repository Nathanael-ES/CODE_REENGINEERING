package afterRefact;

public class Bishop extends Piece
{

    public Bishop(Color color)
    {
        super(color);
    }

    @Override
    public boolean isValidMove(Position from, Position to)
    {
        return MoveUtil.isDiagonalMove(from, to);
    }

    @Override
    public String toString()
    {
        return "b";
    }
}
