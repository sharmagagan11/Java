public class Pattern_prooblem2 {

    public class Pattern_problem2 {
        public static void pattern_problem(int n){
    
            /*
              output 
             * * * * * *
               * * * * 1
               * * * 123
               * * 12345
               * 1234567
             */
           
           // int nsp      // nsp = number of space
            int nst1 = n;
            int nst2 = -1  ;    // nst = number of star
            int row =1;
    
            while(row<=n){
                int val =1;
                int cst = 1;
                while(cst<=nst1){                         //12345
                    System.out.print("*");
                    cst++;
                }
                cst = 1;
                while(cst<=nst2){
                    System.out.print(val+++" ");
                    cst++;
                }
                System.out.println();
                nst1--;
                nst2+=2;
                row++;
            }
    
        }
        public static void main(String args[]) {
    
    
            int n = 5;
            pattern_problem(n);
            
        }
        
    }
    
    
}
