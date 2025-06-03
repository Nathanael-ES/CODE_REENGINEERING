package beforeRefact;

public class King extends Piece
{
    public King(Color color)
    {
        super(color, 'K');
    }

    @Override
    public String toString()
    {
        return "K";
    }
}
