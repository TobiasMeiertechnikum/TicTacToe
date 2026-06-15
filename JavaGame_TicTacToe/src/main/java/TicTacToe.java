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
        System.out.println("Spiel beendet. Auf Wiedersehen!");
        scanner.close();
        return;
    }

    private void switchCurrentPlayer(){
        if (currentPlayer == player1) {
            currentPlayer = player2;
        } else {
            currentPlayer = player1;
        }
    }
    private boolean hasWinner(){
        return true;
    }

}
