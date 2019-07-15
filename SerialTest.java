import java.io.*;

/**
 * @Author heyren
 * @Description //TODO
 * @Date 2019/7/11 22:53
 * @ClassName SerialTest
 * @Version 1.0
 **/

class Student implements Serializable{
    private static final long serialVersionUID = 1l;
    private String name;
    private int age;
    public String getName(){
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
public class SerialTest {
    public static void main(String[] args) throws IOException,ClassNotFoundException{
        Student stu = new Student();
        stu.setAge(20);
        stu.setName("zhangsan");
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("e:/test/obj.dat"));
        oos.writeObject(stu);
        oos.close();
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("e:/test/obj.dat"));
        Object obj = ois.readObject();
        Student stuBak = (Student) obj;
        System.out.println("stu name is "+ stuBak.getName());
        System.out.println("stu age is " +stuBak.getAge());
    }
}
