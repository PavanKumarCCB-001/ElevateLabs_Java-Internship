import java.util.Scanner; 
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

class Perform {
    int id , marks;
    String name;

    Perform(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;   }
    
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Marks: " + marks; } }

class Crud{
    public static void main(String[] args){
        
        List<Perform> Lobj = new ArrayList<>();     // User Defined Object

        Scanner ob = new Scanner(System.in);
        System.out.println("\n ---     Student Record Management System     ---");
        int ch;
        
        do{
            System.out.println("\n1. Add Details\n2. View Details\n3. Update Details\n4. Delete \n5. Exit");
            System.out.print("Enter your choice: ");
            ch = ob.nextInt();
            boolean exists;

            switch (ch) {
                case 1:
                    System.out.print("Enter Id: ");
                    int id = ob.nextInt();
                    
                    exists = false;
                    for(Perform p : Lobj) {
                        if(p.id == id) {
                            exists = true;
                            break; } }
                    if(!exists) {
                    System.out.print("Enter Name: ");
                    String name = ob.next();
                    System.out.print("Enter Marks: ");
                    int marks = ob.nextInt();

                    Lobj.add(new Perform(id,name,marks));
                    System.out.println("Details Added Successfully!");}
                    else
                        System.out.println("Student Already Exists");
                    break;

                case 2:
                    for(Perform p : Lobj)   System.out.println(p);
                break;
                
                case 3:
                    exists = false;

                    if(!Lobj.isEmpty()){
                    System.out.print("Enter Student Id: ");
                    int gid = ob.nextInt();

                    for(Perform p : Lobj) {
                        if(p.id == gid) {
                            System.out.print("Enter New Name:");
                            p.name = ob.next();
                            System.out.print("Enter New Marks:");
                            p.marks = ob.nextInt();     // Updating the Existing Details

                            exists = true; } } 
                
                    if(exists)
                        System.out.println("Details Updated Successfully!");
                    else 
                        System.out.println("Student Does not Exist"); }
                    else
                        System.out.println("No Records Found");
                    break;

                case 4:
                    boolean isDeleted = false;

                    if(!Lobj.isEmpty()){
                    System.out.print("Enter Student Id: ");
                    int did = ob.nextInt();
                    
                    Iterator<Perform> it = Lobj.iterator();

                        while (it.hasNext()) {
                            Perform p = it.next();

                            if (p.id == did) {
                                it.remove();
                                isDeleted = true;   } }
                             
                
                    if(isDeleted)
                        System.out.println("Deleted !!");
                    else 
                        System.out.println("Student Does not Exist"); }
                    else
                        System.out.println("No Records Found");
                    break;

                case 5: break;
                                    
                default:
                    System.out.println("Invalid Choice");
                    break;
            }
        }while(ch != 5);
    ob.close();     } }