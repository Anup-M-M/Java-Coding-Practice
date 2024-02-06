package org.example.serializable;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

class Deserialize{
    public static void main(String args[]){
        try{
            // enable read mode
            FileInputStream fin=new FileInputStream("file.txt");
            //Creating stream to read the object
            ObjectInputStream in=new ObjectInputStream(fin);
            Student s=(Student)in.readObject();
            //printing the data of the serialized object
            System.out.println(s.id+" "+s.name);
            //closing the stream
            in.close();
        }catch(Exception ex){
            System.out.println(ex);
        }
    }
}
