class FinalVar{
    int p;
    int q;
}
class FinalVarDemo{

    public static void main(String[] args) {
        final int i =10; //Compile time constant
        int key=0;
        final int j;//Run time constant
        j=100;
        int a;

        switch (key) {
            case i:break;
            case 1:break;
            case 2:break;
 //         case j:break; // we can not use j as it not compile time constant
            default:
                break;
        }
//        i=30//we can not modity the value of final var

        /*We can modity the content in fv1 object but we can not chnage the path for fv1 in final ref var for object*/
        final FinalVar fv1 = new FinalVar();
         FinalVar fv2 = new FinalVar();
         FinalVar fv3 = new FinalVar();

//       fv1=fv2; //Not allowed as fv 1 is declared as final
         fv2 = fv1;
         fv2 =fv3;

         fv1.p =100;
         fv1.q =100;

         

    }
}

/*
Local variables are not initialised with the default value, but when we define the local var and if we do not use them we wont get any error
but we we use them after defining and not assiging any value it will give the error. 

In short local variables must be initialised BEFORE USE.

In above e.g. for a there wont be any error but if we do not give any value to key so it will give the error.


*/