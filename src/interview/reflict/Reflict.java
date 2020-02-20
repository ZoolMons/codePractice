package interview.reflict;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * @auther: wilson
 * @version: v1.0 创建时间: 2019-12-24:2019
 * Des:
 */
public class Reflict {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
      /*  Class clazz = Class.forName("interview.reflict.Student");
        Field[] fields =    clazz.getFields();
        Arrays.stream(fields).forEach(e->{
            e.setAccessible(true);
            System.out.println(e);
        });*/
        /********************************************/
        Class addClazz = methodClass.class;
        Object o = addClazz.newInstance();
        Method addMethord = addClazz.getMethod("add", Integer.class,Integer.class);
        Object result  = addMethord.invoke(o,2,5);
        System.out.println(result);
    }
}

class methodClass{
    public Integer add(Integer a, Integer b){
        return a+b;
    }
        }
