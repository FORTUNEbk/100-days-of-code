public class Day14 {

    public static void main(String[] args) {
        int[][] array = {
                { 23, 45, 78, 12 },
                { 56, 90, 34, 67 },
                { 89, 21, 43, 76 }
        };

        System.out.println("Original array:");
        printArray(array);

        int[] maxInRows = maxInRows(array);
        System.out.println("Maximum values in each row:");
        printArray(maxInRows);

        int[] maxInColumns = maxInColumns(array);
        System.out.println("Maximum values in each column:");
        printArray(maxInColumns);

        int[][] transposed = transpose(array);
        System.out.println("Transposed array:");
        printArray(transposed);
    }

    public static int[] maxInRows(int[][] array) {
        int[] maxValues = new int[array.length]; 
        for (int i = 0; i < array.length; i++) {
            int max = array[i][0]; 
            for (int j = 1; j < array[i].length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j]; 
                }
            }
            maxValues[i] = max;
        }
        return maxValues;
    }

    public static int[] maxInColumns(int[][] array) {
        int numRows = array.length;
        int numCols = array[0].length;
        int[] maxValues = new int[numCols];
        for (int j = 0; j < numCols; j++) {
            int max = array[0][j];
            for (int i = 1; i < numRows; i++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
            maxValues[j] = max;
        }
        return maxValues;
    }

    public static int[][] transpose(int[][] array) {
        int numRows = array.length;
        int numCols = array[0].length;
        int[][] transposed = new int[numCols][numRows];
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                transposed[j][i] = array[i][j];
            }
        }
        return transposed;
    }

    public static void printArray(int[][] array) {
        for (int[] row : array) {
            for (int elem : row) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }
    }

    public static void printArray(int[] array) {
        for (int elem : array) {
            System.out.print(elem + " ");
        }
        System.out.println();
    }
}
