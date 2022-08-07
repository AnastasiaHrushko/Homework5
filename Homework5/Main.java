package Homework5;

public class Main {

    public static void main(String[] args) {
        String[][] matrix = new String[10][10];
        String[] diagonals = new String[20];
        createMatrix(matrix);
        createDiagonals(matrix, diagonals);
    }

    public static void createMatrix(String[][] matrix) {
        GenerateRandom generateRandom = new GenerateRandom();
        int element = 1;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (element % 3 == 0) {
                    matrix[i][j] = generateRandom.generateRandomNumber();
                } else {
                    matrix[i][j] = generateRandom.generateRandomString();
                }
                element++;
                System.out.println(matrix[i][j]);
            }

        }
        //System.out.println(matrix);
    }

    public static void createDiagonals(String[][] matrix, String[] diagonals) {
        for (int i = 0, j = 0; i < matrix.length; i++, j++) {
            diagonals[i] = matrix[i][j];
        }
        for (int i = 0, j = 9; i < matrix.length; i++, j--) {
            diagonals[i] = matrix[i][j];
        }
        int sovpadenie = 0;
        for (int i = 0; i < 10; i++) {
            if (diagonals[i].equals(diagonals[i + 10]) == true) {
                sovpadenie++;
            }
        }
        if (sovpadenie == 10) {
            System.out.println("главная и побочная диагонали матрицы одинаковые");
        } else {
            System.out.println("главная и побочная диагонали матрицы различны");
        }
    }

// не получилось из масссива диагоналей найти числа
    //    public static void thirdTask(String[] diagonals) {
//        String[]  str  = new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "0"};
//        StringBuilder sb = new StringBuilder();
//        double[] doubles = new double[20];
//        for (int i = 0; i < diagonals.length; i++) {
//            for (int j = 0; j < str.length; j++) {
//                if (diagonals[i].startsWith(String.valueOf(str[j]))){
//                    doubles[i] = Double.parseDouble(diagonals[i]);
//                } else {
//
//                }
//            }
//            System.out.println(doubles);
//        }
//    }
}

