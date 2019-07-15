/**
 * @Author heyren
 * @Description //TODO
 * @Date 2019/7/15 22:39
 * @ClassName NewInstanceTest
 * @Version 1.0
 **/


import java.lang.reflect.Constructor;
class Students{
    private String name;
    private int age;
    public Students(){
        super();
    }
    public Students(String name,int age){
        super();
        this.name = name;
        this.age = age;
    }
    public String toString(){
        return "stu:"+name+","+age;
    }
}

public class NewInstanceTest {
    public static void main(String[] args) throws Exception{
        Class<Students> clazz = Students.class;
        Students obj = clazz.newInstance();
        System.out.println(obj);
        Constructor<Students> con = clazz.getConstructor(String.class,int.class);
        obj = con.newInstance("zhangsan",30);
        System.out.println(obj);
    }
}
