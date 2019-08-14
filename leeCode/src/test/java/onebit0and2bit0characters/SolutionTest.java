package onebit0and2bit0characters;

import com.sun.org.apache.regexp.internal.RE;
import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    Solution solution = new Solution();

    @Test
    public void testIsOneBitCharacter() throws Exception {
        boolean result1 = solution.isOneBitCharacter(new int[] {0});
        boolean result2 = solution.isOneBitCharacter(new int[] {1,1,1,0});
        boolean result3 = solution.isOneBitCharacter(new int[] {1,0,1,0,0});

        Assert.assertEquals(true, result1);
        Assert.assertEquals(false, result2);
        Assert.assertEquals(true, result3);
    }

    @Test
    public void testIsOneBitCharacter2() throws Exception {
        boolean result1 = solution.isOneBitCharacter2(new int[] {0});
        boolean result2 = solution.isOneBitCharacter2(new int[] {1,1,1,0});
        boolean result3= solution.isOneBitCharacter2(new int[] {1,0,1,0,0});
        Assert.assertEquals(true, result1);
        Assert.assertEquals(false, result2);
        Assert.assertEquals(true, result3);
    }
}

