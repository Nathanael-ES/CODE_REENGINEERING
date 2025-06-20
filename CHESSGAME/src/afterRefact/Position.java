package afterRefact;

public class Position
{
    private final int _row;
    private final int _column;

    public Position(int row, int column)
    {
        _row = row;
        _column = column;
    }

    public int getRow()
    {
        return _row;
    }

    public int getColumn()
    {
        return _column;
    }

    public Position translatedPosition(Direction direction)
    {
        return new Position(getRow() + direction.getRowOffset(), getColumn() + direction.getColumnOffset());
    }

    @Override
    public boolean equals(Object obj)
    {
        if (obj == null || !(obj instanceof Position))
            return false;
        Position otherPosition = (Position) obj;
        return this == obj || (_row == otherPosition.getRow() && _column == otherPosition.getColumn());
    }
}
