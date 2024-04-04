package org.example;

import java.util.ArrayList;
import java.util.Collections;

public class WorkintechList<T extends Comparable<T>> {
    private ArrayList<T> list;

    public WorkintechList() {
        this.list = new ArrayList<>();
    }

    public boolean add(T element) {
        if (!list.contains(element)) {
            return list.add(element);
        }
        return false;
    }

    public void sort() {
        Collections.sort(list);
    }

    public boolean remove(Object element) {
        if (list.remove(element)) {
            sort();
            return true;
        }
        return false;
    }

    public int size() {
        return list.size();
    }

    public T get(int index) {
        return list.get(index);
    }

    @Override
    public String toString() {
        return list.toString();
    }

    public ArrayList<T> toArrayList() {
        return new ArrayList<>(list);
    }
}
