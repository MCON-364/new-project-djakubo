package mcon364.las.touro.edu;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    @Test
    void testGetUserName(){
        assertFalse(Main.getUserName("USERNAME").isEmpty());
        assertEquals(System.getenv("USERNAME") , Main.getUserName("USERNAME").get());
    }

}
