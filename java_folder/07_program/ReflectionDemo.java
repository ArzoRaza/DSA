import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

class SampleClass {
    public int number;
    private String text;

    public SampleClass(int number, String text) {
        this.number = number;
        this.text = text;
    }

    public void displayInfo() {
        System.out.println("Number: " + number + ", Text: " + text);
    }

    private void privateMethod() {
        System.out.println("This is a private method.");
    }
}

public class ReflectionDemo {
    public static void main(String[] args) {
        try {
            // Get Class object of SampleClass
            Class<?> sampleClass = SampleClass.class;

            // Get and print all declared fields of the class
            System.out.println("Fields:");
            Field[] fields = sampleClass.getDeclaredFields();
            for (Field field : fields) {
                System.out.println("Name: " + field.getName() + ", Type: " + field.getType() +
                        ", Modifier: " + Modifier.toString(field.getModifiers()));
            }

            // Get and print all declared methods of the class
            System.out.println("\nMethods:");
            Method[] methods = sampleClass.getDeclaredMethods();
            for (Method method : methods) {
                System.out.println("Name: " + method.getName() + ", Return Type: " + method.getReturnType() +
                        ", Modifier: " + Modifier.toString(method.getModifiers()));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
