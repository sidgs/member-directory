public class Main {

    public static void main(String[] args) {

        // 1) System.out.println("hello karthikeya");

       /* 2) int a=5;
        int b=7;
        int c=a+b;
        System.out.println(c);*/

      /* 3) int myVar;
        myVar=998;
        System.out.println(myVar);

        int anotherMyVar;
        anotherMyVar=768876;
        System.out.println(anotherMyVar);

        myVar=anotherMyVar;
        System.out.println(myVar);

        anotherMyVar=786675;
        System.out.println(anotherMyVar);

        System.out.println(myVar); */

        /*4) int a=24;
        int b=7;
        int c=8;
        int d=4;
        int result1=a+b-c;
        int result2=(a/c)*b;
        System.out.println(result1);
        System.out.println(result2); */

       /*5)  byte val1=7;
        short val2=7;
        long val3=5;
        float val4=1.0f;
        double val5=4.0d;

        byte result1= (byte)val3;
        double result2= val4+val5;
        System.out.println(result2); */

       /*6) int a=45;
        int b=30;
        int result1= a<b?a:b;
        System.out.println(result1); */

      /*7) int val1=90;
        int val2=90;
        if(val1<val2)
            System.out.println("val1 is bigger");
            else if (val1>val2)
                System.out.println("val2 is bigger");
        else System.out.println("both are equal"); */


        /* 8) int v1=10, v2=14, diff;
        if (v1>v2) {
            diff = v1 - v2;
            System.out.println("v1 is bigger");
            System.out.println(diff);
        }

        else if (v1<v2){
            diff = v2-v1;
            System.out.println("v2 is bigger");
            System.out.println(diff);
        }
       */

          /* 8) float students = 0.0f;
           float rooms = 4.0f;
           if (students > 0.0f) {
               if (rooms > 0)
                   System.out.println(students / rooms);
           }

            else System.out.println("No Students");


        System.out.println();
        System.out.println("**end program"); */

         /* 9) int a=20,b=140,c=5;
        if(a>b & b>c)
            System.out.println("a is greater");

        else if (b>c | c>a)
            System.out.println("b is greater"); */

        /* 10)  boolean done= false;
                 if (!done)
                     System.out.println("keep going"); */

        /* 11) int students=150, rooms=0;
        if(rooms>0 && students/rooms>30) {
            System.out.println("Crowded");
        }

        System.out.println();
        System.out.println("** end program"); */

      /* 12) int kVal=5;
        int factorial= 1;
         while(kVal>1){
             factorial *=kVal;
             kVal-=1;
             System.out.println(factorial);
         }
         */

     /* 13) int kVal=5;
        do {
            System.out.print(kVal);
            System.out.print("* 2 =");
            kVal *=2;
            System.out.println(kVal);
        }
        while (kVal<100);
        */

   /* for( int kVal=5; kVal<100 ; kVal*=2){
        System.out.println(kVal);
        }*/

  /* int[] myVal= {10,20,30};
   int sum=0;
   for(int i=0;i<myVal.length;i++);
        sum += myVal[0];
        System.out.println(sum); */

  /*int iVal=10;
        switch (iVal%2) {
            case 0:
                System.out.print(iVal);
                System.out.println("is even");
                break;

            case 1:
                System.out.print(iVal);
                System.out.println("is odd");
           break;
            default:
                System.out.println("oops it broke");
            break;
        } */

  Person shylaja= new Person();
        shylaja.height=5.0f;
        shylaja.sex='f';
        shylaja.age=25;

        System.out.println(shylaja.age);


































    }
}
