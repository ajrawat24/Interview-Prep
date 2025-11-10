package MostImportantProgram;

public class PrintDuplicateWithCount {

    public static void main(String[] str) {
        String inputString = "hello world".replace(" ", "");
        int[] freq = new int[256];
        char[] arr = inputString.toCharArray();

        for (char ch :arr) {

           // here the chracter ascii value will be there l= 108 ,
            freq[ch]= freq[ch]+1;
            //System.out.println(freq[ch]);
        }

        for(int i=0; i<freq.length-1;i++)
        {
            System.out.println(i);
            if(freq[i]>1) {
                System.out.println(i);
                System.out.println((char)i + " = " + freq[i]);

              /*  (char)108 → 'l'

                (char)111 → 'o'*/
            }
        }
    }
}