package head_first;

import java.io.*;

class Singleton implements Serializable {
    private static Singleton singleton;

    public static Singleton getInstance() {
        if (singleton == null)
            singleton = new Singleton();
        return singleton;
    }

    protected Object readResolve() {
        return singleton;
    }

}

public class SingletonReadResolve {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Singleton instance = Singleton.getInstance();

        ObjectOutput out = new ObjectOutputStream(new FileOutputStream("file.txt"));
        out.writeObject(instance);
        out.close();

        ObjectInput in = new ObjectInputStream(new FileInputStream("file.txt"));

        Singleton instance2 = (Singleton) in.readObject();
        in.close();

        System.out.println(instance.hashCode());
        System.out.println(instance2.hashCode());


    }

}
