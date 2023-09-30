package chess;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Objects;

public class King extends Piece{

    public King(ChessGame.TeamColor color){
        color = color;
    }

    private ChessGame.TeamColor color;

    private ChessPiece.PieceType type  = PieceType.KING;
    @Override
    public ChessGame.TeamColor getTeamColor() {
        return color;
    }

    @Override
    public PieceType getPieceType() {
        return type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        King king = (King) o;
        return color == king.color && type == king.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, type);
    }

    @Override
    public Collection<ChessMove> pieceMoves(ChessBoard board, ChessPosition myPosition) {
        Collection<ChessMove> posMoves = new HashSet<>();
            //check diagonal bottom left
        if(myPosition.getRow()-1 >=1 && myPosition.getRow()-1 <= 8 && myPosition.getColumn()-1 >=1 && myPosition.getColumn()-1 <=8){
            Position checkPos = new Position(myPosition.getRow()-1,myPosition.getColumn()-1);
            if(board.getPiece(checkPos) == null){
                ChessMove toAdd = new Move(myPosition,checkPos,null);
                posMoves.add(toAdd);
            }
            else if(board.getPiece(checkPos).getTeamColor() != color){
                ChessMove toAdd = new Move(myPosition,checkPos,null);
                posMoves.add(toAdd);
            }
        }
        //check diagonal bottom right
        if(myPosition.getRow()-1 >=1 && myPosition.getRow()-1 <= 8 && myPosition.getColumn()+1 >=1 && myPosition.getColumn()+1 <=8){
            Position checkPos = new Position(myPosition.getRow()-1,myPosition.getColumn()+1);
            if(board.getPiece(checkPos) == null){
                ChessMove toAdd = new Move(myPosition,checkPos,null);
                posMoves.add(toAdd);
            }
            else if(board.getPiece(checkPos).getTeamColor() != color){
                ChessMove toAdd = new Move(myPosition,checkPos,null);
                posMoves.add(toAdd);
            }
        }
        //check diagonal top left
        if(myPosition.getRow()+1 >=1 && myPosition.getRow()+1 <= 8 && myPosition.getColumn()-1 >=1 && myPosition.getColumn()-1 <=8){
            Position checkPos = new Position(myPosition.getRow()+1,myPosition.getColumn()-1);
            if(board.getPiece(checkPos) == null){
                ChessMove toAdd = new Move(myPosition,checkPos,null);
                posMoves.add(toAdd);
            }
            else if(board.getPiece(checkPos).getTeamColor() != color){
                ChessMove toAdd = new Move(myPosition,checkPos,null);
                posMoves.add(toAdd);
            }
        }
        //check diagonal top right
        if(myPosition.getRow()+1 >=1 && myPosition.getRow()+1 <= 8 && myPosition.getColumn()+1 >=1 && myPosition.getColumn()+1 <=8){
            Position checkPos = new Position(myPosition.getRow()+1,myPosition.getColumn()+1);
            if(board.getPiece(checkPos) == null){
                ChessMove toAdd = new Move(myPosition,checkPos,null);
                posMoves.add(toAdd);
            }
            else if(board.getPiece(checkPos).getTeamColor() != color){
                ChessMove toAdd = new Move(myPosition,checkPos,null);
                posMoves.add(toAdd);
            }
        }
        //check to the right
        if( myPosition.getColumn()+1 >=1 && myPosition.getColumn()+1 <=8){
            Position checkPos = new Position(myPosition.getRow(),myPosition.getColumn()+1);
            if(board.getPiece(checkPos) == null){
                ChessMove toAdd = new Move(myPosition,checkPos,null);
                posMoves.add(toAdd);
            }
            else if(board.getPiece(checkPos).getTeamColor() != color){
                ChessMove toAdd = new Move(myPosition,checkPos,null);
                posMoves.add(toAdd);
            }
        }
        //check to the left
        if( myPosition.getColumn()-1 >=1 && myPosition.getColumn()-1 <=8){
            Position checkPos = new Position(myPosition.getRow(),myPosition.getColumn()-1);
            if(board.getPiece(checkPos) == null){
                ChessMove toAdd = new Move(myPosition,checkPos,null);
                posMoves.add(toAdd);
            }
            else if(board.getPiece(checkPos).getTeamColor() != color){
                ChessMove toAdd = new Move(myPosition,checkPos,null);
                posMoves.add(toAdd);
            }
        }
        //check above
        if(myPosition.getRow()+1 >=1 && myPosition.getRow()+1 <= 8){
            Position checkPos = new Position(myPosition.getRow()+1,myPosition.getColumn());
            if(board.getPiece(checkPos) == null){
                ChessMove toAdd = new Move(myPosition,checkPos,null);
                posMoves.add(toAdd);
            }
            else if(board.getPiece(checkPos).getTeamColor() != color){
                ChessMove toAdd = new Move(myPosition,checkPos,null);
                posMoves.add(toAdd);
            }
        }
        //check below
        if(myPosition.getRow()-1 >=1 && myPosition.getRow()-1 <= 8){
            Position checkPos = new Position(myPosition.getRow()-1,myPosition.getColumn());
            if(board.getPiece(checkPos) == null){
                ChessMove toAdd = new Move(myPosition,checkPos,null);
                posMoves.add(toAdd);
            }
            else if(board.getPiece(checkPos).getTeamColor() != color){
                ChessMove toAdd = new Move(myPosition,checkPos,null);
                posMoves.add(toAdd);
            }
        }
        return posMoves;
    }
}