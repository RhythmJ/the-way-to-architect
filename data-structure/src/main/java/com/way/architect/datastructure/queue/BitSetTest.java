package com.way.architect.datastructure.queue;

import java.util.BitSet;

/**
 * @author majunjie
 * @date 2018/7/9 14:27
 */
public class BitSetTest {


    public static void main(String[] args) {

        BitSet aBitSet = new BitSet();
        aBitSet.set(1);
        aBitSet.set(2);
        aBitSet.set(3);
        aBitSet.set(5);
        aBitSet.set(7);
        aBitSet.set(9);

        BitSet bBitSet = new BitSet();
        bBitSet.set(2);
        bBitSet.set(4);
        bBitSet.set(6);
        bBitSet.set(8);

//        aBitSet.or(bBitSet);

        aBitSet.and(bBitSet);


        System.out.println(aBitSet.toString());
    }

}
