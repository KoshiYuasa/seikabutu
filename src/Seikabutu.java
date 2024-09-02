import java.util.Scanner;
public class Seikabutu {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int playerI, playerJ, size = 3;

        //ターンの切り替えをここで行う
        boolean player = true;

        //盤面を作る
        char[][] board = new char[size][size];


        for (int i = 0; i < board.length; i++)
            for (int j = 0; j < board[i].length; j++)
                board[i][j] = ' ';

        while (true) {
            // Draw
            for (int i = 0; i < board.length; i++) { // y direction
                for (int j = 0; j < board[i].length; j++) { // x direction
                    if (j < size - 1) System.out.print(board[i][j] + "|");
                    else System.out.print(board[i][j]);
                }
                System.out.println();
                if (i < size - 1) System.out.println("-----");
                else System.out.println();
            }



            //プレイヤーに設置を促す文を表示する
            System.out.println("プレイヤー"+(player ? 1 : 2) + "は座標を入力してください");
            playerI = scanner.nextInt();
            playerJ = scanner.nextInt();
            board[playerI][playerJ] = (player ? 'X' : 'O');
            player = !player;
        }
    }
}