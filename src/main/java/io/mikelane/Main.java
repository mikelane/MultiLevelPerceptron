package io.mikelane;
import org.jblas.*;

public class Main {

    public static void main(String[] args) {
        DoubleMatrix A = new DoubleMatrix(new double[][] {
                {1.0, 2.0, 3.0},
                {4.0, 5.0, 6.0},
                {7.0, 8.0, 9.0}
        });

        DoubleMatrix x = new DoubleMatrix(new double[][] {
                {1.0, 2.0, 3.0},
                {1.0, 2.0, 3.0},
                {1.0, 2.0, 3.0}
        });

        DoubleMatrix y;

        y = A.mmul(x);

        y.print();
    }
}
