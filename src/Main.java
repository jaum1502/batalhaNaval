import java.util.Scanner;

public class Main {
    public Main() {
        Scanner entrada = new Scanner(System.in);
        int[][] matriz1 = new int[8][8];
        int[][] matriz2 = new int[8][8];
        System.out.println("Digite o tipo de barco que voce deseja colocar: ");
        System.out.println("1.  Barco Pequeno (1 espaço)");
        System.out.println("2.  Barco Médio   (2 espaço)");
        System.out.println("3.  Barco Grande  (3 espaço)");
        int tipoBarco = tipoBarco(entrada);
        int linha = linha(entrada);
        int coluna = coluna(entrada);
        definindoCasas(entrada, matriz1);
        switch (tipoBarco) {
            case 1:
                for (int i = 0; i < 3; i++) {
                    barco1(matriz1, linha, coluna, tipoBarco);
                }
                break;

            case 2:
                for (int i = 0; i < 3; i++) {
                    barco2(matriz1, linha, coluna, tipoBarco);
                }
                break;

            case 3:
                for (int i = 0; i < 3; i++) {
                    barco3(matriz1, linha, coluna, tipoBarco);
                }
                break;

            default:
                break;
        }
        espacoBranco();
        impressaoMatriz1es(matriz1, matriz2);

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
    public void definindoCasas(Scanner entrada, int[][] matriz1) {

        for (int i = 0; i < matriz1.length; i++)

        {
            for (int j = 0; j < matriz1[i].length; j++) {
                matriz1[i][j] = 0;
            }
        }
    }

    // ----------------------------------------------------IMPRESSAO MATRIZ1ES----------------------------------------------------

    public void impressaoMatriz1es(int matriz1[][], int matriz2[][]) {
        for (int i = 0; i < matriz1.length; i++)

        {
            for (int j = 0; j < matriz1[i].length; j++) {

                System.out.print(matriz1[i][j] + " ");

            }
            System.out.print("              ");
            for (int j = 0; j < matriz2[i].length; j++) {

                System.out.print(matriz2[i][j] + " ");

            }
            System.out.println();
        }
    }

    public void barco1(int matriz1[][], int linha, int coluna, int tipoBarco) {
        if (tipoBarco == 1) {
            matriz1[linha][coluna] = 1;
        }
    }

    public void barco2(int matriz1[][], int linha, int coluna, int tipoBarco) {
        if (tipoBarco == 2) {
            matriz1[linha][coluna] = 1;
            matriz1[linha][coluna + 1] = 1;
        }
    }

    public void barco3(int matriz1[][], int linha, int coluna, int tipoBarco) {
        if (tipoBarco == 3) {
            matriz1[linha][coluna] = 1;
            matriz1[linha][coluna + 1] = 1;
            matriz1[linha][coluna + 2] = 1;
        }
    }

    public void espacoBranco(){
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
    }

    public static void main(String[] args) {
        new Main();
    }
}
