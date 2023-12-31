package chess;

import java.util.Objects;

public class Position implements ChessPosition{

    public Position(int row, int column){
       this.row = row;
        this.column = column;
    }

    public int row;
    public int column;


    @Override
    public int getRow() {
        return row;
    }

    @Override
    public int getColumn() {
        return column;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Position position = (Position) o;
        return row == position.row && column == position.column;
    }

    @Override
    public int hashCode() {
        return Objects.hash(row, column);
    }

}
