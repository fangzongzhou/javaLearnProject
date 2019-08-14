package onebit0and2bit0characters;

class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        int i = 0;
        while (i < bits.length - 1) {
            i += bits[i] + 1;
        }
        return i == bits.length - 1;
    }



    public boolean isOneBitCharacter2(int[] bits) {
        int i = bits.length - 2;
        while (i >= 0 && bits[i] > 0) {
            i--;
        }
        return (bits.length - i) % 2 == 0;
    }


}

