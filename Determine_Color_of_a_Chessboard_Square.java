class Solution {
    public boolean squareIsWhite(String coordinates) {

        switch (coordinates) {
            case "a1", "c1", "e1", "g1", "b2", "d2", "f2", "h2", "a3", "c3", "e3", "g3", "b4", "d4", "f4", "h4", "a5", "c5", "e5", "g5", "b6", "d6", "f6", "h6", "a7", "c7", "e7", "g7", "b8", "d8", "f8", "h8":
                return false;
            default:
                return true;

        }
    }

}

public class Determine_Color_of_a_Chessboard_Square {

    public static void main(String[] args) {

    }
}