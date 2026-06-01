import java.io.*;
class Person implements Serializable {
    public String name=null;
    public int age=0;
    public void setAge(int a) {
        age=a;
    }
    public String getName() {
        return name;
    }
}
public class ObjectOutputStreamExample {
    public void writeToFile() {
        try {
            ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("filename"));
            Person p=new Person();
            p.name="Ali";
            p.age=40;
            out.writeObject(p);
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch(IOException ex) {
            ex.printStackTrace();
        }
    }
}