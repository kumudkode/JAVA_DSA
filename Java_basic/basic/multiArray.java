package basic;
class multiArray {
    void multiArrays(){
        //2d-array
        // int ages[][] = new int[4][5];
        // int ages[][] = {{1,2,3},{4,5,6},{7,8,9}};
        
        // System.out.println(ages[0][0]); //1
        // System.out.println(ages[0][1]); //2
        // System.out.println(ages[0][2]+"\n"); //3

        // System.out.println(ages[1][0]); //4
        // System.out.println(ages[1][1]); //5
        // System.out.println(ages[1][2]+"\n"); //6

        // System.out.println(ages[2][0]); //7
        // System.out.println(ages[2][1]); //8
        // System.out.println(ages[2][2]); //9
        int agess[]= new int[5];
        agess[1] =12;
        agess[2] = 24;
        agess[3] = 36;
        agess[4] = 48;
        agess[5] = 60;
        for(int i=0;i<5;i++)
        {
            System.out.println(i);
        }

        //3D- array
        // int[][][] ages3 = new int[4][3][4];
        // ages3[0][0][1]=23;

    }
public static void main(String[] args){
    multiArray obj = new multiArray();
    obj.multiArrays();
}
}
