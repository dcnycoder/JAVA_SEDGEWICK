/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 **************************************************************************

 *
 */

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

class FindConnection {

    public static void main(String[] args) {
        StdOut.println("The modules work!");
        int[] nodes = new int[Integer.parseInt(args[0])];
        for (int i = 0; i < nodes.length; i++) {
            nodes[i] = i;
        }
        StdOut.print(Arrays.toString(nodes));
        int num = StdIn.readInt();
        StdOut.print("num: " + num);
    }
}
