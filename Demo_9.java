public class Demo_9 {
    public static void main(String[] args) {
        // Arrays.
      /*   int[] rollnum = new int[5];
      //int []num = {45,24,45,23,45}
      //int[][]num = {
      //              {45,85,75}
                      {45,5}
                      {546,94,6}
                   }
      
         
        int x = 101;
        for(int i = 0;i <= rollnum.length;i++){
            rollnum[i] = x;
            System.out.println(rollnum[i]);
            x++;  


        }*/

        // Multi-dimensional  array.
        //2D -Array

        /*int[][] marks = new int[3][3];
        marks[0][0] = 60;
        marks[0][1] = 70;
        marks[0][2] = 90;

        marks[1][0] = 70;
        marks[1][1] = 80; 
        marks[1][2] = 50;
    
        marks[2][0] = 40;
        marks[2][1] = 60;
        marks[2][2] = 75;
        for(int i = 0;i < marks.length;i++){
            for(int j = 0;j< marks[i].length ;j++){
                System.out.print(marks[i][j] + " ");
            }
            System.out.println();
        }*/

        int[][] marks1 = new int[3][];

        marks1 [0] = new int[2];
        marks1 [1] = new int[3];
        marks1 [2] = new int[4];

        marks1[0][0] = 60;
        marks1[0][1] = 70;
    

        marks1[1][0] = 70;
        marks1[1][1] = 80; 
        marks1[1][2] = 50;
    
        marks1[2][0] = 40;
        marks1[2][1] = 60;
        marks1[2][2] = 75;
        marks1[2][3] = 92;
        
        for(int i = 0;i < marks1.length;i++){
            for(int j = 0;j< marks1[i].length ;j++){
                System.out.print(marks1[i][j] + " ");
            }
            System.out.println();
        }



    }
    
}
