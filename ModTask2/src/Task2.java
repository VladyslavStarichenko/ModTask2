import java.util.*;
import java.lang.*;

public class Task2 {
    public static void main(String[] args) {
        String[][] chessBoard= {{"A8", "B8", "C8", "D8", "E8", "F8", "G8", "H8"},
                {"A7", "B7", "C7", "D7", "E7", "F7", "G7", "H7"},
                {"A6", "B6", "C6", "D6", "E6", "F6", "G6", "H6"},
                {"A5", "B5", "C5", "D5", "E5", "F5", "G5", "H5"},
                {"A4", "B4", "C4", "D4", "E4", "F4", "G4", "H4"},
                {"A3", "B3", "C3", "D3", "E3", "F3", "G3", "H3"},
                {"A2", "B2", "C2", "D2", "E2", "F2", "G2", "H2"},
                {"A1", "B1", "C1", "D1", "E1", "F1", "G1", "H1"}

        };
        int coord[] = new int[4];
        printArray(chessBoard);
        System.out.println("This is a chessboard, enter the initial coordinates of the knight and where to move position");
        Scanner scanner = new Scanner(System.in);
        String position =  scanner.nextLine();
        String positionTo =  scanner.nextLine();
        getCoords(positionTo,chessBoard, position, coord);
        int x = coord[0];
        int y = coord[1];
        int x1 = coord[2];
        int y1 = coord[3];

        if (x1 - 1 == x || x1 + 1 == x && y1 - 2 == y || y1 + 2 == y){
            System.out.println("Yes");
        }
        else if(x1 - 2 == x || x1 + 2 == x && y1 - 1 == y || y1 + 1 == y){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
        
    }

    public static void printArray(String[][] array) {
        for (String[] i : array) {
            for (String j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static int[] getCoords(String positionTo, String [][] board, String currentPosition, int [] arr){


        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {

                if(board[i][j].equals(currentPosition) ){
                    arr[0] = i;
                    arr[1] = j;
                }
                if(board[i][j].equals(positionTo)){
                    arr[2] = i;
                    arr[3] = j;
                }


            }



        }
        return arr;
    }



}
