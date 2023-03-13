//Let's see an example to print the classloader name  
public class Main
{
    static int m=100;//static variable
    public static void main(String[] args)
    {
        // Let's print the classloader name of current class.   
        //Application/System classloader will load this class
        System.out.println(m);
        Class c=Main.class;
        System.out.println(c.getClassLoader());
        //If we print the classloader name of String, it will print null because it is an  
        //in-built class which is found in rt.jar, so it is loaded by Bootstrap classloader  
        System.out.println(String.class.getClassLoader());
    }
}    
