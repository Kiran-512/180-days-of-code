
import java.util.ArrayList;


class P{}
class C extends P{}

class GenericDemo {
    
    public static void main(String[] args) {
        
        P[] arr1 =new P[10];
        C[] arr2 =new C[10];

        arr1=arr2;//We can assign child array to the parent array
        System.out.println("==========");

        ArrayList<P> list1 = new ArrayList<>();
        ArrayList<C> list2 = new ArrayList<>();
        ArrayList<C> list3 = new ArrayList<>();

		//But We can not assign child class Arraylist to the parent class Arraylist	
        // list1=list2;//error: incompatible types: ArrayList<C> cannot be converted to ArrayList<P> as We can not assign child class list to the parent class list

        list2=list3;//this is possible as both the array list belongs to the same type


        ArrayList<? extends P> list4 = list2;// this is possible but list4 is ready Only collection and we can not add remove modity list2 with list4 (we can modity the list2)
		
		//list4.add(new P())		not allowed as list 4 is read ONLY

        /*
        <? extends P>=> We can assign the list of P OR any child of P to the list created with this syntax  
        */

        ArrayList<Object> listt = new ArrayList<>();

        ArrayList<? super P> list6 = list1;// can assign list of P or its parent
        ArrayList<? super C> list7 = list1;// HERE WE can assign the list of C or its parent
        ArrayList<? super C> list8 = listt;
        list8.add(new C());
        list8.add(new C());
        list8.add(new C());
        // list8.add(new Object());//Not allowed// error: incompatible types: Object cannot be converted to CAP#1
        
/*
        <? super C> 
		here we can assign collection of C or of its parent to the collection of the C 
		We can add in the list (here list 7 and 8)
		we can only add the objects of C and the Objects of child of C only in the newly created collection and not of ANY  of its parent
		
*/

		
        ArrayList<? super Object> listtt = new ArrayList<Object>();//valid and here to listtt collection we can assign collection of Object type ONLY
		
		ArrayList<? extends Object> llist = new ArrayList<anyClass>();// here to the llist colletion of Oject type we can assign collection of any type which is child class of Object type and llistt is realy ONLY
		
		//anyClass - as every class is directly or indireclty child of an object class

		//similar to above  only just SYNTAX IS DIFFERENT
		ArrayList<?> newlist = list;// We can assign collection of any type to this <?> but its read ONLY we can not add
  }

}
