package org.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MapTest {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.add(9);
        list.add(7);
        list.add(6);
        list.add(5);

        System.out.println(list.get(0) + list.get(list.size()-1));
    }

}
