import java.util.Scanner;

public class Main {
    public Main() {
        Scanner entrada = new Scanner(System.in);
        int[][] matriz = new int[8][8];
        System.out.println("Digite o tipo de barco que voce deseja colocar: ");
        System.out.println("1.  Barco Pequeno (1 espaço)");
        System.out.println("2.  Barco Médio   (2 espaço)");
        System.out.println("3.  Barco Grande  (3 espaço)");
        int tipoBarco = tipoBarco(entrada);
        int linha = linha(entrada);
        int coluna = coluna(entrada);
        definindoCasas(entrada, matriz);
        switch (tipoBarco) {
            case 1:
                for (int i = 0; i < 3; i++) {
                    barco1(matriz, linha, coluna, tipoBarco);
                }
                break;

            case 2:
                for (int i = 0; i < 3; i++) {
                    barco2(matriz, linha, coluna, tipoBarco);
                }
                break;

            case 3:
                for (int i = 0; i < 3; i++) {
                    barco3(matriz, linha, coluna, tipoBarco);
                }
                break;

            default:
                break;
        }
        impressaoMatrizes(matriz);

    }
  // ----------------------------------------------------ENTRADAS NAVIOS----------------------------------------------------
    public int tipoBarco(Scanner entrada) {
        System.out.println("Tipo de barco: ");
        int tipoBarco = entrada.nextInt();

        return tipoBarco;
    }

    public int linha(Scanner entrada) {
        System.out.println("Linha: ");
        int linha = entrada.nextInt();
       
        return linha;
    }

    public int coluna(Scanner entrada) {
        System.out.println("Coluna");
        int coluna = entrada.nextInt();
        return coluna;
    }


    // ----------------------------------------------------DENIFINDO CASAS----------------------------------------------------
    public void definindoCasas(Scanner entrada, int[][] matriz) {

        for (int i = 0; i < matriz.length; i++)

        {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = 0;
            }
        }
    }

    // ----------------------------------------------------IMPRESSAO MATRIZES----------------------------------------------------
    public void impressaoMatrizes(int matriz[][]) {
        for (int i = 0; i < matriz.length; i++)

        {
            for (int j = 0; j < matriz[i].length; j++) {

                System.out.print(matriz[i][j] + " ");

            }
            System.out.println();
        }
    }

    public void barco1(int matriz[][], int linha, int coluna, int tipoBarco) {
        if (tipoBarco == 1) {
            matriz[linha][coluna] = 1;
        }
    }

    // -------------------
    public void barco2(int matriz[][], int linha, int coluna, int tipoBarco) {
        if (tipoBarco == 2) {
            matriz[linha][coluna] = 1;
            matriz[linha][coluna + 1] = 1;
        }
    }

    public void barco3(int matriz[][], int linha, int coluna, int tipoBarco) {
        if (tipoBarco == 3) {
            matriz[linha][coluna] = 1;
            matriz[linha][coluna + 1] = 1;
            matriz[linha][coluna + 2] = 1;
        }
    }

    public static void main(String[] args) {
        new Main();
    }
}
