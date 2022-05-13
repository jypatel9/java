public class first{
    
    public static void main(String args[])
    {
        int A[]={23,24,25,26,27,22,21,12,13,14,15};
        int b[]=new int[10];
        int c[];
        c=new int[10];
        A[3]=29;
        for (int i : A) {
            System.out.print(i + " ");
        }
        System.out.println("");

        for(int i=0;i<A.length;i++)
        {
            System.out.println(A[i]++);
            System.out.println(A.length);
        }
    }

}
