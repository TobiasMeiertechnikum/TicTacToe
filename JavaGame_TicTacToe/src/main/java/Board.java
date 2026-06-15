public class Board{
    private char[][] cells;

    public Board(){
        cells = new char[3][3];
        clear();
    }

    public boolean isCellEmpty(int x, int y){ //gibt true zurück, wenn das Feld leer ist
        return cells[x][y] == ' ';
    }

    public char getCell(int x, int y){ //gibt den Inhalt eines Feldes zurück
        return cells[x][y];
    }

    public void place(int x, int y, char marker){ //setzt den Marker in das entsprechende Feld
        cells[x][y] = marker;
    }

    public boolean isFull(){ //gibt true zurück, wenn das gesamte Feld voll ist

        for(int i = 0; i < cells.length; i++){
            for(int j = 0; j < cells[0].length; j++){
                if(cells[i][j] == ' '){
                    return false;
                }
            }
        }
        return true;
    }

    public void clear(){ //leert die Einträge des Arrays
        for(int i = 0; i < cells.length; i++){
            for(int j = 0; j < cells[0].length; j++){
                cells[i][j] = ' ';
            }
        }
    }

    public void print(){ //Aussehen des Boards
        System.out.print("    "); //Platz für Zeilen-Label
        for(int j = 0; j < cells[0].length; j++){
            System.out.print(" " + j + "  "); //Spalten-Beschriftung
        }
        System.out.print("\n   ");
        for(int f = 0; f < 13; f++){
            System.out.print("-");
        }

        System.out.print("\n");
        for(int i = 0; i < cells.length; i++){
            System.out.print(" " + i + " | "); //Zeilen-Beschriftung + Strich am Anfang

            for(int j = 0; j < cells[0].length; j++){
                System.out.print(cells[i][j]); //printed das Zeichen
                System.out.print(" | "); //Strich zwischen den Zeichen
            }

            System.out.print("\n   "); //Strich am Ende und neue Zeile
            for(int f = 0; f < 13; f++){ //Trennlinien zwischen den Spalten
                System.out.print("-");
            }
            System.out.print("\n");
        }
    }
}