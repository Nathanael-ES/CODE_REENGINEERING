package beforeRefact;

public abstract class Rook extends Piece
{
    public Rook(Color color)
    {
        super(color, 'r');
    }

    @Override
    public String toString()
    {
        return "r";
    }
}
