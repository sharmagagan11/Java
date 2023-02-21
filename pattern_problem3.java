public class pattern_problem3{
        public static void pattern_problem_3(int n){
    
            /*
              output 
            *123456
            **12345
            ***1234
            ****123
            *****12
            ******1
            *******            
             */
           
           // int nsp      // nsp = number of space
            int nst = 1;
            int nst2 =n-1;   // nst = number of star
            int row =1;
    
            while(row<=n){
                int val =1;
                int cst = 1;
                while(cst<=nst){                         
                    System.out.print("*");
                    cst++;
                }
                cst = 1;
                while(cst<=nst2){
                    System.out.print(val++);
                    cst++;
                }
                System.out.println();
                nst++;
                nst2--;
                row++;
            }
    
        }
        public static void main(String args[]) {
    
    
            int n = 7;
            pattern_problem_3(n);
            
        }
        
    }

