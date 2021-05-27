import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class SILab2Test {

    private List<Time> createList(Integer... elems)
    {
        return new ArrayList<>(Arrays.asList(elems));
    }

    @Test
    public void everyBranch(){
        RuntimeException ex;

        //1
        assertEquals(0, SILab2.function(createList()));

        //2
        assertEquals(7200, SILab2.function(createList(1,30,45)));

        //3
        ex=assertThrows(RuntimeException.class, () -> SILab2.function(createList(26,26,2)));
        assertTrue(ex.getMessage().contains("The hours are greater than the maximum"));

        //4
        ex=assertThrows(RuntimeException.class, () -> SILab2.function(createList(-2,15,12)));
        assertTrue(ex.getMessage().contains("The hours are smaller than the minimum"));

        //5
        ex=assertThrows(RuntimeException.class, () -> SILab2.function(createList(18,62,0)));
        assertTrue(ex.getMessage().contains("The minutes are greater than the maximum"));

        //7
        ex=assertThrows(RuntimeException.class, () -> SILab2.function(createList(18,2,62)));
        assertTrue(ex.getMessage().contains("The seconds are not valid"));

        //8
        ex=assertThrows(RuntimeException.class, () -> SILab2.function(createList(12,30,-5)));
        assertTrue(ex.getMessage().contains("The seconds are not valid"));

        //10
        ex=assertThrows(RuntimeException.class, () -> SILab2.function(createList(24,5,5)));
        assertTrue(ex.getMessage().contains("The time is greater than the maximum"));

        //11
        ex=assertThrows(RuntimeException.class, () -> SILab2.function(createList(24,0,1)));
        assertTrue(ex.getMessage().contains("The time is greater than the maximum"));

        //12
        assertEquals(86400, SILab2.function(createList(24,0,0)));
    }

    @Test
    public void multipleCondition(){
        RuntimeException ex;

        //1
        assertEquals(0, SILab2.function(createList()));

        //2
        assertEquals(7200, SILab2.function(createList(1,30,45)));

        //3
        ex=assertThrows(RuntimeException.class, () -> SILab2.function(createList(26,26,2)));
        assertTrue(ex.getMessage().contains("The hours are greater than the maximum"));

        //4
        ex=assertThrows(RuntimeException.class, () -> SILab2.function(createList(-2,15,12)));
        assertTrue(ex.getMessage().contains("The hours are smaller than the minimum"));

        //5
        ex=assertThrows(RuntimeException.class, () -> SILab2.function(createList(18,62,0)));
        assertTrue(ex.getMessage().contains("The minutes are greater than the maximum"));

        //7
        ex=assertThrows(RuntimeException.class, () -> SILab2.function(createList(18,2,62)));
        assertTrue(ex.getMessage().contains("The seconds are not valid"));

        //8
        ex=assertThrows(RuntimeException.class, () -> SILab2.function(createList(12,30,-5)));
        assertTrue(ex.getMessage().contains("The seconds are not valid"));

        //10
        ex=assertThrows(RuntimeException.class, () -> SILab2.function(createList(24,5,5)));
        assertTrue(ex.getMessage().contains("The time is greater than the maximum"));

        //11
        ex=assertThrows(RuntimeException.class, () -> SILab2.function(createList(24,0,1)));
        assertTrue(ex.getMessage().contains("The time is greater than the maximum"));

        //12
        assertEquals(86400, SILab2.function(createList(24,0,0)));
    }
}