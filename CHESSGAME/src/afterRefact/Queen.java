package afterRefact;

public class Queen extends Piece
{
    public Queen(Color color)
    {
        super(color);
    }

    public boolean isValidMove(Position from, Position to)
    {
        return MoveUtil.isStraightLineMove(from, to);
    }

    @Override
    public String toString()
    {
        return "q";
    }
}
