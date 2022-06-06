class Employee {

    String name;
    int id;
    double salary;

    Employee(String name,int id,double salary){
        this.name =name;
        this.id =id;
        this.salary=salary;
    }

    void printEmpDetails(){
        System.out.println(this.name+" "+this.id+" "+this.salary);
    }
    
}
class EmployeeDemo {
    public static void main(String[] args) {
        Employee[] emp = new Employee[5];

        emp[0]= new Employee("Kiran",20,50000);
        emp[1]= new Employee("Kiran",20,50000);
        emp[2]= new Employee("Kiran",20,50000);
        emp[3]= new Employee("Kiran",20,50000);
        emp[4]= new Employee("Kiran",20,50000);

        for (Employee e : emp) {
            System.out.println(e);
        }

        for (Employee e : emp) {
            e.printEmpDetails();
        }

        int arr2d[][]={
            {10,20},
            {30,20},
            {20,10}
        };
        for (int i = 0; i < arr2d.length; i++) {
            for (int j = 0; j < arr2d[i].length; j++) {
                System.out.print( " "+arr2d[i][j]);
            }
            System.out.println();

        }
        int[][][] arr3d = {{{10,20},{20,20}},{{30,40},{40,50}},{{30,40},{40,50}}};

        for (int i = 0; i < arr3d.length; i++) {
            for (int j = 0; j < arr3d[i].length; j++) {
                for (int j2 = 0; j2 < arr3d[j2].length; j2++) {
                    System.out.println(arr3d[i][j][j2]+" ");
                }
                
            }
            
        }

        for (int[][] dim : arr3d) {
            for(int[] dim1:dim){
            for(int value:dim1){
                System.out.print(value);
            }
            System.out.println();
        }   
        System.out.println();
        }
        
    }
    
}
/*

C:\CDAC\Github\180-days-of-code\M2\DAY 20>java EmployeeDemo
Employee@36baf30c
Employee@7a81197d
Employee@5ca881b5
Employee@24d46ca6
Employee@4517d9a3
Kiran 20 50000.0
Kiran 20 50000.0
Kiran 20 50000.0
Kiran 20 50000.0
Kiran 20 50000.0
 10 20
 30 20
 20 10
10
20
20
20
30
40
40
50
30
40
40
50
1020
2020

3040
4050

3040
4050


C:\CDAC\Github\180-days-of-code\M2\DAY 20>

*/