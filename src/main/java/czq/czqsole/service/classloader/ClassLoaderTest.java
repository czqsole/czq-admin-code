package czq.czqsole.service.classloader;

/**
 * Author: czqsole
 * Date: 2018/8/31
 */
public class ClassLoaderTest {
    public static void main(String[] args) {


        ClassLoader classLoader = ClassLoaderTest.class.getClassLoader();
        while(classLoader != null) {
            System.out.println(classLoader.toString());
            classLoader = classLoader.getParent();
        }

        ClassLoader myClassLoader = new ClassLoader() {
            @Override
            public Class<?> loadClass(String name) throws ClassNotFoundException {

                Class c = findLoadedClass(name);
                byte[] b = new byte[100];
                return defineClass(name, b, 0 , b.length);
//                return super.loadClass(name);
            }
        };
    }
}
