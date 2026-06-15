import java.util.Scanner;

public class TicTacToe {
    private Player player1;
    private Player player2;
    private Player currentPlayer;
    private Board board;

    public TicTacToe() {
        player1 = new Player('X');
        player2 = new Player('O');
        currentPlayer = player1;
        board = new Board();
    }

    public void start(){
        Scanner scanner = new Scanner(System.in);

        while (true) {
            board.clear();
            currentPlayer = player1;
            board.print();

            while (true) {
                System.out.println("Spieler " + currentPlayer.getMarker()
                        + ", gib deinen Zug ein - zuerst Zeile (0-2), dann Spalte (0-2), z.B. \"0 2\" für oben rechts:");

                int x = scanner.nextInt();
                int y = scanner.nextInt();

                if (x < 0 || x > 2 || y < 0 || y > 2) {
                    System.out.println("Ungültige Koordinaten. Bitte Werte zwischen 0 und 2 eingeben.");
                    continue;
                }

                if (!board.isCellEmpty(x, y)) {
                    System.out.println("Dieses Feld ist bereits belegt. Bitte wähle ein anderes.");
                    continue;
                }

                board.place(x, y, currentPlayer.getMarker());
                board.print();

                if (hasWinner()) {
                    System.out.println("Spieler " + currentPlayer.getMarker() + " hat gewonnen!");
                    break;
                }

                if (board.isFull()) {
                    System.out.println("Unentschieden!");
                    break;
                }

                switchCurrentPlayer();
            }

            System.out.println("Neues Spiel? (j/n)");
            String answer = scanner.next();
            if (!answer.equalsIgnoreCase("j")) {
                System.out.println("Spiel beendet. Auf Wiedersehen!");
                break;
            }
        }

        scanner.close();
    }

    private void switchCurrentPlayer(){
        if (currentPlayer == player1) {
            currentPlayer = player2;
        } else {
            currentPlayer = player1;
        }
    }

    private boolean hasWinner(){
        char m = currentPlayer.getMarker();

        for (int i = 0; i < 3; i++) {
            if (board.getCell(i, 0) == m && board.getCell(i, 1) == m && board.getCell(i, 2) == m) {
                return true;
            }
        }

        for (int j = 0; j < 3; j++) {
            if (board.getCell(0, j) == m && board.getCell(1, j) == m && board.getCell(2, j) == m) {
                return true;
            }
        }

        if (board.getCell(0, 0) == m && board.getCell(1, 1) == m && board.getCell(2, 2) == m) {
            return true;
        }
        if (board.getCell(0, 2) == m && board.getCell(1, 1) == m && board.getCell(2, 0) == m) {
            return true;
        }

        return false;
    }

}