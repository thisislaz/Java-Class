public class TypeCasting{
    public static void main(String[] args){
        byte b = 127;
        int i = b;

        System.out.println(i);

    //EXPLICIT CASTING
         double d = 35.35;
         double dd = 35.99;

         //casting the double d into a int
         int iii = (int) d ; 
         //casting the doujble dd into a int
         int ii = (int) dd;
         System.out.println(iii);
         System.out.println(ii);

    //IMPLICIT CASTING
        int a = 35;
        float f = a ;
        System.out.println("The number is: " + f );     

        
    }
}