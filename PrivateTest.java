import java.lang.reflect.Field;

/**
 * @Author heyren
 * @Description //TODO
 * @Date 2019/7/15 22:51
 * @ClassName PrivateTest
 * @Version 1.0
 **/
class PrivateTestClass{
    private String field1;
    public PrivateTestClass(String field1){
        super();
        this.field1 = field1;
    }
}
public class PrivateTest {
    public static void main(String[] args) throws Exception{
        PrivateTestClass obj = new PrivateTestClass("hello");
        Class clazz = obj.getClass();
        Field f = clazz.getDeclaredField("field1");
        f.setAccessible(true);
        System.out.println(f.get(obj));
    }
}
