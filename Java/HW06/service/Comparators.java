package Java.HW06.service;

import java.util.Comparator;

import Java.HW06.laptop.Laptop;

public class Comparators {
    public Comparators(){

    }
    
    public class Name implements Comparator<Laptop> {
        @Override
        public int compare(Laptop a, Laptop b) {
            int bName = a.getName().compareTo(b.getName());
            int bRam =  b.getRam().compareTo(a.getRam());
            int bSsd = b.getSsd().compareTo(a.getSsd());;
            int bColor = b.getColor().compareTo(a.getColor());;
            int bOs = b.getOs().compareTo(a.getOs());;
            if (bName != 0) { return bName;}
            else if (bRam != 0) { return bRam;}
            else if (bSsd != 0) { return bSsd;}
            else if (bColor != 0) { return bColor;}
            else if (bOs != 0) { return bOs;}
            return 0;
        }
        
    }

    public class Ram implements Comparator<Laptop> {
        @Override
        public int compare(Laptop a, Laptop b) {
            int bName = a.getName().compareTo(b.getName());
            int bRam =  b.getRam().compareTo(a.getRam());
            int bSsd = b.getSsd().compareTo(a.getSsd());;
            int bColor = b.getColor().compareTo(a.getColor());;
            int bOs = b.getOs().compareTo(a.getOs());;
            if (bRam != 0) { return bRam;}
            else if (bName != 0) { return bName;}
            else if (bSsd != 0) { return bSsd;}
            else if (bColor != 0) { return bColor;}
            else if (bOs != 0) { return bOs;}
            return 0;
        }
    }
    public class Ssd implements Comparator<Laptop> {
        
        @Override
        public int compare(Laptop a, Laptop b) {
            int bName = a.getName().compareTo(b.getName());
            int bRam =  b.getRam().compareTo(a.getRam());
            int bSsd = b.getSsd().compareTo(a.getSsd());;
            int bColor = b.getColor().compareTo(a.getColor());;
            int bOs = b.getOs().compareTo(a.getOs());;
            if (bSsd != 0) { return bSsd;}
            else if (bName != 0) { return bName;}
            else if (bRam != 0) { return bRam;}
            else if (bColor != 0) { return bColor;}
            else if (bOs != 0) { return bOs;}
            return 0;
        }
    }
    public class Os implements Comparator<Laptop> {
        public int compare(Laptop a, Laptop b) {
            int bName = a.getName().compareTo(b.getName());
            int bRam =  b.getRam().compareTo(a.getRam());
            int bSsd = b.getSsd().compareTo(a.getSsd());;
            int bColor = b.getColor().compareTo(a.getColor());;
            int bOs = b.getOs().compareTo(a.getOs());;
            if (bOs != 0) { return bOs;}
            else if (bName != 0) { return bName;}
            else if (bRam != 0) { return bRam;}
            else if (bSsd != 0) { return bSsd;}
            else if (bColor != 0) { return bColor;}
            return 0;
        }
    }
    public class Color implements Comparator<Laptop> {
        
        @Override
        public int compare(Laptop a, Laptop b) {
            int bName = a.getName().compareTo(b.getName());
            int bRam =  b.getRam().compareTo(a.getRam());
            int bSsd = b.getSsd().compareTo(a.getSsd());;
            int bColor = b.getColor().compareTo(a.getColor());;
            int bOs = b.getOs().compareTo(a.getOs());;
            if (bColor != 0) { return bColor;}
            else if (bName != 0) { return bName;}
            else if (bRam != 0) { return bRam;}
            else if (bSsd != 0) { return bSsd;}
            else if (bOs != 0) { return bOs;}
            return 0;
        }
    }

}
