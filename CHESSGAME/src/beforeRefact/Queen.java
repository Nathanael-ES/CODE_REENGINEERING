package beforeRefact;

public class Queen extends Piece
{
    public Queen(Color color)
    {
        super(color, 'q');
    }

    @Override
    public String toString()
    {
        return "q";
    }
}
