/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecttodo;

/**
 *
 * @author Nirmal Harsha
 */
import EmplBean.BeanClass;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ProjectToDo {

    static Collection col =null;
    static Collection col1=null;
    static Map< String, List<BeanClass>> map1 = new HashMap<>();
//    static List<BeanClass> ListForFinance = new ArrayList<>();
    static   String str2=null;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for (; true;) {
            int User_input = Menu();
            Options(User_input);
        }
    }

    private static void Options(int Input) {
//        depending on the input given chosing the output
        switch (Input) {
            case 1:
                try{
                List_of_Employee();
                }
                 catch(EmployeeNotFoundException e)
                {
                    System.out.println(e);
                }
                break;
            case 2:
                Add_Employee();
                break;
            case 3:
                try{
                Update_Employee();}
                catch(EmployeeNotFoundException e)
                {
                    System.out.println(e);
                }
                break;
            case 4:
                try{
                Delete_Employee();
                }
                catch(EmployeeNotFoundException e)
                {
                    System.out.println(e);
                }
                break;
            case 5:
                Exit();
                break;
            default:
                break;
        }

    }

    private static int Menu() {
        System.out.println("choose one of the option");
        System.out.println(
                "        1.List Of Employees\n"
                + "	2.Add Employee\n"
                + "	3.Update Employee\n"
                + "	4.Delete Employee\n"
                + "	5.Quit from Menu\n");

        Scanner Sc = new Scanner(System.in);
        int User_input = Sc.nextInt();
        return User_input;
    }

    private static void Add_Employee()  {
        int key = 0;
        double Salary;
        String EmpName, EmpDep;
//        ID of the enployee
        System.out.println("Enter the Id of the employee");
        Scanner input = new Scanner(System.in);
        System.out.println("Emply id should be a number");
        key = input.nextInt(); 
        if(!map1.containsKey(String.valueOf(key)))
        {
//       Employee name
        System.out.println("Enter " + key + " the Employee name");
        EmpName = input.next();
//        Employee Department
        System.out.println("Enter " + EmpName + "'s Department");
        EmpDep = input.next();
//        Employee Salary
        System.out.println("Enter " + EmpName + " Salary");
        Salary = input.nextDouble();
        BeanClass employee1 = new BeanClass(key, EmpName, EmpDep, Salary);
        List<BeanClass> ListForFinance = new ArrayList<>();
        ListForFinance.add(employee1);
        map1.putIfAbsent(String.valueOf(key), ListForFinance);
        }
        else
        {
            System.out.println("This key already exist");
        }
        col=map1.keySet();
        col1=map1.values();
    }
//      private static void List_of_Employee1() {
//          
//          List_of_Employee(map1.keySet(),map1.values());
//          
//      }
    private static void List_of_Employee() throws EmployeeNotFoundException {
//                   col=col2;
//                   col1=col3;
        if(col ==null && col1==null)
        {
            System.out.println("List is Empty");
            
        }
        else{    
        Iterator itr = col.iterator();
            Iterator itr1 = col1.iterator();
            if (itr.hasNext()) {
                System.out.println("Empid" + "\t" + "EmpName" + "\t\t" + "EmpDept" + "\t\t\t" + "salary");
               for (;itr1.hasNext();) {
//                    String str = String.valueOf(itr.next());
//                    System.out.print(str+"\t");
                    
                    String str1=String.valueOf(itr1.next());
                    for (String retval: str1.split(","))
                    {
                       
                        if(str2==null)
                        {
                            System.out.println(retval);
                        }
                        else if(!str2.equals(retval))
                        {
                            
                            System.out.println(retval);
                        }
                    
                    }
                   
                   itr.next();
                }
//                System.out.println(col.size());
        } 
        else {
            System.out.println("There are no Employees");
        }
             System.out.println("total number of employees  "+col.size());
        }
    }

    private static void Delete_Employee() throws EmployeeNotFoundException
    {
       
       
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the employee id that you want to remove");
        int key = input.nextInt();
//         System.out.println(map1.containsValue(map1.get(String.valueOf(key))));
        map1.remove(String.valueOf(key));
         col=map1.keySet();
     col1=map1.values();
       
       
//            Iterator itr1 = col1.iterator();
////            if (itr.hasNext()) {
//               if (itr1.hasNext()) {
//                    String str1=String.valueOf(itr1.next());
//                    for (String retval: str1.split(","))
//                    {
//                        if(map1.get(String.valueOf(key)).equals(retval))
//                        {
//                            System.out.println(map1.get(String.valueOf(key)));
//                          str2.concat(String.valueOf(map1.get(String.valueOf(key))));
//                        }
//                    
////                    }
//                    
      
//    }}
    
//                System.out.println(str2);
//    col1.add(str2);
//}
    }

    private static void Update_Employee()throws EmployeeNotFoundException {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the employee id that you want to update");
        int key = input.nextInt();
      
//               map1.remove(String.valueOf(key));
        if(map1.containsKey(String.valueOf(key)))
        {
            map1.remove(String.valueOf(key));
        System.out.println("enter the information of the employee");
        System.out.println("ENter his name");
        String EmpName = input.next();
        System.out.println("Enter his salary");
        Double EmpSal = input.nextDouble();
        System.out.println("Enter his department");
        String EmpDept = input.next();
        BeanClass employee1 = new BeanClass(key, EmpName, EmpDept, EmpSal);
        List<BeanClass> ListForFinance = new ArrayList<>();
        ListForFinance.add(employee1);
        map1.put(String.valueOf(key), ListForFinance);
        }
        else
        {
            System.out.println("This key dose not exit");
        }
//          col=map1.keySet();
//        col1=map1.values();
//        List_of_Employee(map1.keySet());
//        List_of_Employee(map1.values());
    }

    private static void Exit() {
        System.exit(0);
    }

}
