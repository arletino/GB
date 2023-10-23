package Java.HW06.service;

import java.util.ArrayList;
import java.util.SortedSet;
import java.util.TreeSet;

import Java.HW06.laptop.Laptop;

public class Search {
    private ArrayList<Laptop> laptops;
    private String search;

    public Search(ArrayList<Laptop> laptops, String search) {
        this.laptops = laptops;
        this.search = search;
    }

    public SortedSet<Laptop> search() {
        SortedSet<Laptop> temp = new TreeSet<>();
        for (Laptop laptop : this.laptops) {
            if (laptop.toString().contains(search))
                temp.add(laptop);
        }
        return temp;
    }
}
