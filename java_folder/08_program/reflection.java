import java.lang.reflect.Field;
import java.lang.reflect.Method;

class SampleClass {
    private int id;
    private String name;

    public SampleClass() {
        this.id = 1;
        this.name = "Default";
    }

    public SampleClass(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private void privateMethod() {
        System.out.println("This is a private method");
    }
}

public class reflection {
    public static void main(String[] args) {
        try {
            // Get the class object associated with SampleClass
            Class<?> clazz = SampleClass.class;

            // Get the methods of the class
            System.out.println("Methods:");
            Method[] methods = clazz.getDeclaredMethods();
            for (Method method : methods) {
                System.out.println(method.getName() + " : " + method.getReturnType());
            }

            // Get the fields of the class
            System.out.println("\nFields:");
            Field[] fields = clazz.getDeclaredFields();
            for (Field field : fields) {
                System.out.println(field.getName() + " : " + field.getType());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
