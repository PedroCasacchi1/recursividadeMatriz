public class matrizRecursiva {

    public static int[][] criarMatriz(int linhas, int colunas) {
        int[][] matriz = new int[linhas][colunas];
        int valor = 1;
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                matriz[i][j] = valor++;
            }
        }
        return matriz;
    }

    //recursividade
    public static void mostrarMatriz(int[][] matriz, int linha, int coluna) {
        if (linha >= matriz.length) { // Condição base: se a linha for maior ou igual ao número de linhas, termina a recursão
            return;
        }
        if (coluna < matriz[linha].length) { // verifica se a coluna é valida e exibe o elemento
            System.out.print(matriz[linha][coluna] + " ");
            mostrarMatriz(matriz, linha, coluna + 1); // recursividade pra próxima coluna
        } else { // se chegar no final da linha, pula pra proxima linha
            System.out.println();
            mostrarMatriz(matriz, linha + 1, 0); // recursividade pra próxima linha e primeira coluna
        }
    }

    public static void main(String[] args) {
        int linhas = 3;
        int colunas = 3;
        int[][] matriz = criarMatriz(linhas, colunas);
        System.out.println("Matriz criada:");
        mostrarMatriz(matriz, 0, 0);
    }
}
