import org.example.hello;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class HelloTest {

    @Test
    void correctString(){
        assertEquals("Hello World!", hello.returnString("Hello World!"));}

    @Test
    void wrongString(){
        assertNotEquals("Hello World!", hello.returnString("Hello Universe!"));

    }
}




