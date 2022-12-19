package day_36_Class_Object_Constructor;

public class String_Args_Nedir {

    public static void main(String[] args) {
        //özel bir metot
        //args argümanlar anlamına gelir
        //bu argümanlar dışarıdan girilen verilerdir.

   //  if(!args[0].equals("123")){
  //       return;
  //   }

        for (int i = 0; i < args.length ; i++) {
            System.out.println(args[i]);
        }

        int[] arr=new int[5];
        arr[0]=10;
        arr[1]=52;

        int[] arr2={10,52,36,96,89};

    }
}
