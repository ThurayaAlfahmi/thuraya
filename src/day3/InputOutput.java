package day3;

import javax.imageio.IIOException;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class InputOutput {
  public static void main(String[] args) throws IOException {
//
////        System.out.println("Hello and welcome!");
////        System.err.println(",,;l,;");
//
//
//        // scanner class
//        Scanner scanner = new Scanner(System.in);
//
//        String name;
//
//        do {
//            System.out.println("Please write ur name: ");
//            name = scanner.nextLine();
//        } while (name.length() < 3);
//        System.out.println("your name is : "+ name);
////
////        System.out.println("please enter your age: ");
////        int age = scanner.nextInt();
////        System.out.println("Your age is: "+ age);
//
//        do{
//            scanner= new Scanner(System.in);
//            System.out.println("please enter your age: ");
//
//        }while (!scanner.hasNextInt());
//        int age = scanner.nextInt();
//        System.out.println("Your age is: "+ age);
//
//        scanner.close();


      // file handling
      String filePath= "src/day3/file.txt";
      File file = new File(filePath);

      if(file.createNewFile())
          System.out.println("File has been created");
      else System.out.println("File already exited");

      FileWriter fileWriter = new FileWriter(filePath, true);
      fileWriter.write("This is a line \n ");
      fileWriter.write("somthing there  \n");

      fileWriter.close();

Scanner fileScanner = new Scanner(file);
String str = "";
while (fileScanner.hasNextLine()){
    str +=fileScanner.nextLine() + "\n";
}
fileScanner.close();
System.out.println(str);


  }
    }

