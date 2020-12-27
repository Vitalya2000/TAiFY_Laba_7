package com.metanit;

import org.jetbrains.annotations.Nullable;

public interface HashTable {
    void add(int x, String y);

    void delete(int x);

    @Nullable
    String search(int x);

    //@Nullable
    //Integer min();

    //@Nullable
    //Integer max();

    String print();
}
