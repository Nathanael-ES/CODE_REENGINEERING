package afterRefact;

public class Rook extends Piece
{
    public Rook(Color color)
    {
        super(color);
    }

    public boolean isValidMove(Position from, Position to)
    {
        return MoveUtil.isHorizontalOrVerticalMove(from, to);
    }

    @Override
    public String toString()
    {
        return "r";
    }
}
