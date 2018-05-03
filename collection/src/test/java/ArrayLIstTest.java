import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ArrayLIstTest {

    ArrayLIst arrayLIst = new ArrayLIst();
    ArrayList arrayList = new ArrayList();

    @Before
    public void init() {
        for (int i = 0; i < 30; i++) {
            arrayLIst.add(i);
            arrayList.add(i);
        }
    }

    @Test
    public void add() {
        for(int i=0;i<30;i++) {

        }


        Assert.assertEquals(30, arrayLIst.size());
    }

    @Test
    public void size() {

    }
}