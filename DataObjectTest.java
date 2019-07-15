import java.lang.reflect.Field;

/**
 * @Author heyren
 * @Description //TODO
 * @Date 2019/7/15 23:09
 * @ClassName DataObjectTest
 * @Version 1.0
 **/

class DataObject{
    private String name;
    private String desc;
    private int age;
    private String other;
    public DataObject(String name,String desc,int age,String other){
        super();
        this.name = name;
        this.desc = desc;
        this.age = age;
        this.other = other;
    }
    public String toString(){
        StringBuffer sb = new StringBuffer();
        Field[] fields = this.getClass().getDeclaredFields();
        for (Field f :fields){
            sb.append(f.getName());
            sb.append("=");
            try {
                sb.append(f.get(this));
            }catch (IllegalArgumentException e){
                e.printStackTrace();
            }catch (IllegalAccessException e){
                e.printStackTrace();
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
public class DataObjectTest {
    public static void main(String[] args){
        Object obj  = new DataObject("zhangsan","desc test",10,"other test");
        System.out.println(obj);
    }
}
