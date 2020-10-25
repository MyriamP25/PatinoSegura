
 class SerieFibonacci
 {
     public static void main(String args[])
     {
         int var1=0;
         int var2=1;
         int var3;
         System.out.println(var1);
         System.out.println(var2);

         do
         { 
            var3=var1+var2; 
            System.out.println(var3);
           
            var1=var2;
            var2=var3;
            
         }
        while (var2 <= 15);
         
     }
 }