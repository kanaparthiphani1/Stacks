import java.util.Arrays;

public class Client {
    public static void main(String[] args) {
//        StackUsingArray sa = new StackUsingArray();
//        sa.push(1);
//        sa.push(2);
//        sa.push(3);
//        System.out.println(sa.pop());
//        System.out.println(sa.pop());
//        System.out.println(sa.pop());

//        StackUsingLL sl = new StackUsingLL();
//        sl.push(1);
//        sl.push(2);
//        sl.push(3);
//        sl.push(4);
//        sl.pop();
//        sl.printStack();

//        BalancedParenthesis bp = new BalancedParenthesis("()[{}()]");
//        System.out.println(bp.valid());

//        MinStack ms = new MinStack();
//        ms.push(-2);
//        ms.push(0);
//        ms.push(-3);
//        System.out.println(ms.getMin());
//        System.out.println(ms.pop());
//        System.out.println(ms.getMin());


//        NextSmallerElement ns = new NextSmallerElement(new int[]{3,6,2,1,4,5,2});
//        System.out.println(Arrays.toString(ns.nextSmall()));

//        PreviousGreaterElement pg  = new PreviousGreaterElement(new int[]{0,1,0,2,1,0,1,3,2,1,2,1});
//        System.out.println(Arrays.toString(new int[]{0,1,0,2,1,0,1,3,2,1,2,1}));
//
//        System.out.println(Arrays.toString(pg.prevGreater()));

//        RainWaterTrapping rt = new RainWaterTrapping(new int[]{0,1,0,2,1,0,1,3,2,1,2,1});
//        System.out.println(rt.total());
//
//        LargestRectInHist lr = new LargestRectInHist(new int[]{4,2,0,3,2,4,3,4});
//        System.out.println(lr.findMaxArea());

//        Celebrity cb =  new Celebrity(new int[][]{{0,1},{1,0}});
//        System.out.println(cb.findCeleb());

        MaxRectangles mr = new MaxRectangles(new int[][]{{0,1,1,0},{1,1,1,1},{1,1,1,1},{1,1,0,0}});
        System.out.println(mr.findMaxRectArea());
    }
}
