package lista5.atividade6;

public class AppConcatenaArray {
    public static void main(String[] args) {
        int [] data1 = {1, 2};
        int [] data2 = {3, 4, 5};

        int ii = data1.length + data2.length;
        int [] data3 = new int [ii];

        int j=0;
        for (int i=0; i<ii; i++,j++) {
            if (i<data1.length)
                data3[i] = data1[j];
            else if (i>data1.length)
                data3[i] = data2[j];
            else {
                j=0;
                data3[i] = data2[j];
            }
        }

        for (int i=0; i<ii; i++) {
            System.out.print(data3[i] + " ");
        }
    }
}
