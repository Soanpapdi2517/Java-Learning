public class Array2D {
    public static void main(String[] args) {
        int[][] mynums = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] newnums = new int[3][2];
        newnums[0][0] = 1;
        newnums[0][1] = 2;
        newnums[1][0] = 3;
        newnums[1][1] = 4;
        newnums[2][0] = 5;
        newnums[2][1] = 6;
//        System.out.println(mynums.length);
//        System.out.println(newnums.length);
        int rows = 0;
        while (rows < mynums.length){
            int columns = 0;
            while(columns < mynums[rows].length){
                System.out.print(mynums[rows][columns]+ " ");
                columns++;
            }
            System.out.println();
            rows++;
        }
    }
}
