package task1_4.model;

import java.util.Random;

public class MatrixModel {
    private int dimensions;
    private int [][] matrix;



    public int getDimensions() {
        return dimensions;
    }

    public void setDimensions(int dimensions) {
        this.dimensions = dimensions;
    }

    public int[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(int[][] matrix) {
        this.matrix = matrix;
    }

    public void createRandomMatrix(){
        matrix=new int[dimensions][dimensions];
        for (int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix[i].length;j++){
                matrix[i][j]=new Random().nextInt(10);
            }
        }
    }
    public String printMatrix(){
        StringBuilder sb=new StringBuilder();
        for (int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix[i].length;j++){
               sb.append(matrix[i][j]+" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public void rotateMatrix(){
        for (int i = 0; i < matrix.length; i++)
            for (int j = i; j < matrix[0].length; j++) {
                int temp = matrix[j][i];
                matrix[j][i] = matrix[i][j];
                matrix[i][j] = temp;
            }
    }

}
