import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputStreamExample {
    public void readFromFile() {
        try {
            ObjectInputStream in = new ObjectInputStream (new FileInputStream("filename"));
            while(true) {
                Person personRoad= (Person)in.readObject();
                System.out.println(personRoad.name);
                System.out.println(personRoad.age);
            }
        } catch (EOFException ex) {
            System.out.println("End of file reached");
        } catch (ClassNotFoundException ex){
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}