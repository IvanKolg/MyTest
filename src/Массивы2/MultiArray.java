package Массивы2;

public class MultiArray {
    public static void main(String[] args) {
        int SIZE=3;
        char[][] graph = new char[SIZE][SIZE];
        //pervie skobki
        for (int i=0;i<SIZE;i++) {
            for (int j=0;j<SIZE;j++){
                if ( i==0 || i==SIZE-1 || j==0 || j==SIZE-1 ){
                    graph[i][j]='#';
                } else {
                    graph[i][j]=' ';
                }

            }
        }

        //vivodim massiv na ekran
        for (int i=0;i<SIZE;i++) {
            for (int j=0;j<SIZE;j++){
                System.out.println(graph[i][j]);
            }
            System.out.println();
        }

        System.out.format("%3d", 1|25);

    }


}
