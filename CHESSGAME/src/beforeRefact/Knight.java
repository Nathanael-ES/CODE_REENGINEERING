package beforeRefact;

public abstract class Knight extends Piece
{
    public Knight(Color color)
    {
        super(color, 'k');
    }

    @Override
    public String toString()
    {
        return "k";
    }
}