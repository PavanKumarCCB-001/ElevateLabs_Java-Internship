package Task4;

import java.io.*;   // FileReader, FileWriter, IOException
import java.util.Scanner;

class Notes {
public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
    Scanner ob = new Scanner(System.in);
    System.out.println("\n---     Notes App   ---");
    int ch;
    
    do {
        System.out.println("\nWhat do you want to do?");
        System.out.println("1. Read Data from file      2. Write Data to file   3. Delete File   4. Exit");
        System.out.print("Choice: ");
        ch = obj.nextInt();
        
        switch (ch) {
            case 1:
                System.out.print("Enter the file name to read data from: ");
                try ( FileReader fr = new FileReader(obj.next()) ) {   // Try with Resources closes object automatically
                    for(int d = fr.read(); d != -1; d = fr.read())
                        System.out.print((char)d);
                    } catch(IOException e) {
                        System.out.println("File Not Found!!"); }
                break;
            
            case 2:
                System.out.print("Enter the file name to write data to: ");
                try ( FileWriter fw = new FileWriter(obj.next(),true) ) {   
                    System.out.println("Enter the data to write: ");
                    String data = ob.nextLine();
                    fw.append(data+"\n");   // Append data to file in New Line
                    } catch(IOException e) {
                        System.out.println("IO Exception"); }
                    break;
            
            case 3:
                System.out.print("Enter the File Name to Delete: ");
                try{
                    File f = new File(obj.next());
                    f.delete();
                    System.out.println(" Deleted Successfully");
                    } catch(Exception e) {
                    System.out.println("File Not Found!!"); }
                break;
            
            case 4: break;
            default:
                System.out.println("Invalid Choice");
                break;
        } 
    } while(ch != 4);
    obj.close(); 
    ob.close(); } }