package task7_2;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<?> clazz = UnaryOp.class;
        Constructor<?> constructor = clazz.getEnclosingConstructor();
        Object instance = constructor.newInstance();


        Method[] methods = clazz.getMethods();
        for(Method method:methods){
            if(method.getName().startsWith("set")){
                method.invoke(instance,11);
                break;
            }
        }

    }
}
