// Sudoku Game in Java
import java.util.Scanner;

public class SodokuGame {
    public static void main(String[] args) {
        int[][] board = {
            {5, 3, 0, 0, 7, 0, 0, 0, 0},
            {6, 0, 0, 1, 9, 5, 0, 0, 0},
            {0, 9, 8, 0, 0, 0, 0, 6, 0},
            {8, 0, 0, 0, 6, 0, 0, 0, 3},
            {4, 0, 0, 8, 0, 3, 0, 0, 1},
            {7, 0, 0, 0, 2, 0, 0, 0, 6},
            {0, 6, 0, 0, 0, 0, 2, 8, 0},
            {0, 0, 0, 4, 1, 9, 0, 0, 5},
            {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("=== Bem-vindo ao Sudoku ===\n");

            while (true) {
                exibirTabuleiro(board);

                if (isCompleto(board)) {
                    System.out.println("Parabéns! Você completou o Sudoku!");
                    break;
                }

                System.out.println("\nDigite a linha e a coluna para inserir um número (1-9) ou '0 0' para sair:");
                if (!scanner.hasNextInt()) {
                    System.out.println("Entrada inválida. Por favor, insira números.");
                    scanner.next(); // Limpa a entrada inválida
                    continue;
                }
                int linha = scanner.nextInt() - 1;

                if (!scanner.hasNextInt()) {
                    System.out.println("Entrada inválida. Por favor, insira números.");
                    scanner.next(); // Limpa a entrada inválida
                    continue;
                }
                int coluna = scanner.nextInt() - 1;

                if (linha == -1 && coluna == -1) {
                    System.out.println("Obrigado por jogar! Até a próxima.");
                    break;
                }

                if (linha < 0 || linha > 8 || coluna < 0 || coluna > 8) {
                    System.out.println("Posição inválida. Tente novamente.");
                    continue;
                }

                if (board[linha][coluna] != 0) {
                    System.out.println("Essa posição já está preenchida. Tente novamente.");
                    continue;
                }

                System.out.println("Digite o número para essa posição (1-9):");
                if (!scanner.hasNextInt()) {
                    System.out.println("Entrada inválida. Por favor, insira um número entre 1 e 9.");
                    scanner.next(); // Limpa a entrada inválida
                    continue;
                }
                int numero = scanner.nextInt();

                if (numero < 1 || numero > 9) {
                    System.out.println("Número inválido. Tente novamente.");
                    continue;
                }

                if (isValido(board, linha, coluna, numero)) {
                    board[linha][coluna] = numero;
                } else {
                    System.out.println("Jogada inválida! O número já existe na linha, coluna ou bloco 3x3.");
                }
            }
        }
    }

    public static void exibirTabuleiro(int[][] board) {
        System.out.println("   1 2 3   4 5 6   7 8 9");
        for (int i = 0; i < 9; i++) {
            if (i % 3 == 0) {
                System.out.println("  +-------+-------+-------+");
            }
            System.out.print((i + 1) + " | ");
            for (int j = 0; j < 9; j++) {
                System.out.print((board[i][j] != 0 ? board[i][j] : ".") + " ");
                if ((j + 1) % 3 == 0) {
                    System.out.print("| ");
                }
            }
            System.out.println();
        }
        System.out.println("  +-------+-------+-------+");
    }

    public static boolean isValido(int[][] board, int linha, int coluna, int numero) {
        for (int i = 0; i < 9; i++) {
            if (board[linha][i] == numero || board[i][coluna] == numero) {
                return false;
            }
        }

        int blocoLinha = (linha / 3) * 3;
        int blocoColuna = (coluna / 3) * 3;
        for (int i = blocoLinha; i < blocoLinha + 3; i++) {
            for (int j = blocoColuna; j < blocoColuna + 3; j++) {
                if (board[i][j] == numero) {
                    return false;
                }
            }
        }

        return true;
    }

    public static boolean isCompleto(int[][] board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}