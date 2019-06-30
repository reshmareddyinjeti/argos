package Array;

public class Array6 {
    
    public static void main(String[]args) {
        int i[] = new int[6];
        i[0] = 23;
        i[1] = 6;
        i[2] = 47;
        i[3] = 35;
        i[4] = 2;
        i[5] = 14;
        System.out.println(i.length);
        for (int j=0;j<i.length;j++)
            System.out.println(i[j]);
        System.out.println( "Addition of 6 values :  "+i[0]+i[1]+i[2]+i[3]+i[4]+i[5]);
     System.out.println( "Average of 6 values :  " +i[0]+i[1]+i[2]+i[3]+i[4]+i[5]/6);
    }
}



