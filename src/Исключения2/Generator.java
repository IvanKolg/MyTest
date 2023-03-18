package Исключения2;

public class Generator {
    public String helloMessage (String name) throws FirstException, SecondException {
        if ("FIRST".equals(name)) {
            throw new FirstException("FirstException occured");
        }
        if ("SECOND".equals(name)) {
            throw new SecondException("SecondException occured");
        }
        return "Hello, " + name;
    }
}
