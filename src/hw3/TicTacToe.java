package hw3;
import java.util.Scanner;
public class TicTacToe {
    private char[] board;
    private char currentPlayer;

    public TicTacToe() {
        board = new char[9];
        currentPlayer = 'X';
        initializeBoard();
    }

    private void initializeBoard() {
        for (int i = 0; i < 9; i++) {
            board[i] = '-';
        }
    }

    public void playGame() {
        boolean gameOver = false;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Добро пожаловать в игру Крестики-нолики!");

        while (!gameOver) {
            System.out.println("Текущее состояние доски:");
            printBoard();

            System.out.println("Игрок " + currentPlayer + ", введите номер ячейки (от 1 до 9):");
            int cell = scanner.nextInt();

            if (isValidMove(cell)) {
                makeMove(cell);
                if (checkForWin()) {
                    System.out.println("Игрок " + currentPlayer + " победил! Поздравляем!");
                    gameOver = true;
                } else if (isBoardFull()) {
                    System.out.println("Ничья! Игра окончена.");
                    gameOver = true;
                } else {
                    currentPlayer = (currentPlayer == 'X') ? 'Y' : 'X';
                }
            } else {
                System.out.println("Некорректный ход. Попробуйте снова.");
            }
        }
        scanner.close();
    }

    private boolean isValidMove(int cell) {
        return (cell >= 1 && cell <= 9 && board[cell - 1] == '-');
    }

    private void makeMove(int cell) {
        board[cell - 1] = currentPlayer;
    }

    private boolean checkForWin() {
        return (checkRows() || checkColumns() || checkDiagonals());
    }

    private boolean checkRows() {
        for (int i = 0; i < 9; i += 3) {
            if (board[i] == currentPlayer && board[i + 1] == currentPlayer && board[i + 2] == currentPlayer) {
                return true;
            }
        }
        return false;
    }

    private boolean checkColumns() {
        for (int i = 0; i < 3; i++) {
            if (board[i] == currentPlayer && board[i + 3] == currentPlayer && board[i + 6] == currentPlayer) {
                return true;
            }
        }
        return false;
    }

    private boolean checkDiagonals() {
        if ((board[0] == currentPlayer && board[4] == currentPlayer && board[8] == currentPlayer) ||
                (board[2] == currentPlayer && board[4] == currentPlayer && board[6] == currentPlayer)) {
            return true;
        }
        return false;
    }

    private boolean isBoardFull() {
        for (int i = 0; i < 9; i++) {
            if (board[i] == '-') {
                return false;
            }
        }
        return true;
    }

    private void printBoard() {
        for (int i = 0; i < 9; i += 3) {
            System.out.println(board[i] + " | " + board[i + 1] + " | " + board[i + 2]);
        }
    }

    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        game.playGame();
    }
}
