package latticeSlope;

public class Solution {
    public String solution(int ax, int ay, int bx, int by) {
        int cx = 0;
        int cy = 0;
        int diffx = Math.abs(ax - bx);
        int diffy = Math.abs(ay - by);
        if (diffx == 0) {
            cy = by;
            cx = ay > by ? minus(bx, 1) : plus(bx, 1);
        } else if (diffy == 0) {
            cx = bx;
            cy = ax > bx ? plus(by, 1) : minus(by, 1);
        } else {
            if (diffx % diffy == 0) {
                diffx =Math.abs(diffx / diffy);
                diffy = 1;
            }

            cx = ay > by ? minus(bx, diffy) : plus(bx, diffy);
            cy = ax > bx ? plus(by, diffx) : minus(by, diffx);

        }

        return cx + "," + cy;
    }

    private int plus(int bValue, int offSet) {
        return bValue + offSet;
    }

    private int minus(int bValue, int offSet) {
        return bValue - offSet;
    }
}

