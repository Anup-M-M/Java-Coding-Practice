package org.example.serializable;

import java.io.*;
//serialization converting object into byte stream.

public class Persist {
    public static void main(String[] args) {

        try {
            Student s1= new Student(110861, "anup");
            //FileOutputStream is an output stream used for writing primitive values or data into a file.
            FileOutputStream fout= new FileOutputStream("file.txt");
            //ObjectOutputStream writes primitive data types of Java objects to an OutputStream.
            //Creating stream and writing the object
            ObjectOutputStream out = new ObjectOutputStream(fout);
            out.writeObject(s1);
            out.flush();
            //closing the stream
            out.close();
            System.out.println("success");
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
