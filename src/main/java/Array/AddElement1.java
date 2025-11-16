package Array;

public class AddElement1 {

    public static void main(String[] args)
    {
        int[] a= {1,2,3};
        int num=4;

       int[] updated= addElement(a, num);
       for(int i=0;i<updated.length;i++)
        {
            System.out.print(updated[i]+" ");
        }


    }

    public static int[]  addElement(int[] a, int num)
    {
        int[] newArray= new int[a.length+1];
        for(int i=0;i<a.length;i++)
        {
            newArray[i]=a[i];
        }
        newArray[newArray.length-1]=num;


        return newArray;


    }
}
