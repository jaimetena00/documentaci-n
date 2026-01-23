public class Y { 

  

    public static void main(String[] args) { 

  

        int[] d = {4, 7, 2, 9, 2, 5}; 

        int e = 0; 

        int f = d[0]; 

  

        for (int i = 1; i < d.length; i++) { 

            if (d[i] > f) { 

                f = d[i]; 

            } 

        } 

  

        for (int i = 0; i < d.length; i++) { 

            if (d[i] == f) { 

                e++; 

            } 

        } 

  

        System.out.println(f + ":" + e); 

    } 

} 