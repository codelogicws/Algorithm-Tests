package ws.codelogic.algorithms.SymbolTable;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class SymbolTableTest {

    private SymbolTable<String> symbolTable;

    @Before
    public void setUp() {
        String[] emptyArray = new String[10];
        symbolTable = new SymbolTable<String>(emptyArray);
        symbolTable.add(1, "foo");
        symbolTable.add(2, "bar");
        symbolTable.add(3, "big");
        symbolTable.add(4, "boy");
    }

    @Test
    public void getElementThatWasStored() {
        String returned = symbolTable.get(4);
        assertEquals("boy", returned);
    }
}
