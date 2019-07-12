import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] array;
        int n;
        System.out.println("Nhap kich co ma tran:");
        n = sc.nextInt();
        array = new double[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("nhap phan tu o hang " + i + " cot " + j);
                array[i][j] = sc.nextDouble();
            }
        }
        double sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    sum += array[i][j];
                }
            }
        }
        System.out.println("Tong cac phan tu tren duong cheo chinh cua ma tran:" + sum);
    }

}
