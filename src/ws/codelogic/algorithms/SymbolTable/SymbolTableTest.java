package ws.codelogic.algorithms.SymbolTable;

import org.junit.Before;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class SymbolTableTest {

    private SymbolTable<String> symbolTable;

    @Before
    public void setUp() {
        String[] emptyArray = new String[5];
        symbolTable = new SymbolTable<String>(emptyArray);
        symbolTable.put(1, "foo");
        symbolTable.put(2, "bar");
        symbolTable.put(3, "big");
        symbolTable.put(4, "boy");
    }

    @Test
    public void getElementThatWasStored() {
        String returned = symbolTable.get(4);
        assertEquals("boy", returned);
    }

    @Test
    public void doesContainsReturnTrueIfElementExists() {
        assertTrue(symbolTable.contains(2));
    }

    @Test(expected = SymbolTableExceptions.OverFlow.class)
    public void putThrowsExceptionIfFull() {
        symbolTable.put(5, "last element");
        symbolTable.put(6, "should over flow");
    }
}
