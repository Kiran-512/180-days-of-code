class OuterClass{


    class InnerClass1{
        class InnnerInnerClass{
            class InnnerInnnerInnerClass{
            
            }
        }

    }
    class InnerClass2 extends InnerClass1{


    }

}


public class InnerClassDemo1 {

    public static void main(String[] args) {
        
        OuterClass.InnerClass1 i = new OuterClass().new InnerClass2();// since this is static block here 'OuterClass.' is must before inner class but inside the instrance method of the same class its not compulsory

        OuterClass oc = new OuterClass();
        OuterClass.InnerClass1.InnnerInnerClass.InnnerInnnerInnerClass i1 = oc.new InnerClass1().new InnnerInnerClass().new InnnerInnnerInnerClass();// object of innerinnerinner clas ot access the instance memebrs of that class


    }
}
