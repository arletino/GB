package Java.HW06.laptop;

import java.util.ArrayList;

public class Laptop implements Comparable<Laptop> {
    private String name, os, color;
    private Integer ram, ssd;

    public Laptop(String name, Integer ram, Integer ssd, String os, String color) {
        this.name = name;
        this.os = os;
        this.ram = ram;
        this.ssd = ssd;
        this.color = color;
    }

    public Laptop(String[] laptop) {
        this.name = laptop[0];
        this.os = laptop[3];
        this.ram = Integer.parseInt(laptop[1]);
        this.ssd = Integer.parseInt(laptop[2]);
        this.color = laptop[4];
    }

    public String getName() {
        return name;
    }

    public String getOs() {
        return os;
    }

    public String getColor() {
        return color;
    }

    public Integer getRam() {
        return ram;
    }

    public Integer getSsd() {
        return ssd;
    }

    public void changeValue(String field, String param) {
        if (field.equals("name")) {
            this.name = param;
        } else if (field.equals("os")) {
            this.os = param;
        } else if (field.equals("color")) {
            this.color = param;
        } else {
            System.out.println("Wrong field");
        }
    }

    public void changeValue(String field, Integer param) {
        if (field.equals("ram")) {
            this.ram = param;
        } else if (field.equals("ssd")) {
            this.ssd = param;
        } else {
            System.out.println("Wrong field");
        }
    }

    public ArrayList<String> getList() {
        ArrayList<String> laptop = new ArrayList<>();
        laptop.add(name);
        laptop.add(String.valueOf(ram));
        laptop.add(String.valueOf(ssd));
        laptop.add(os);
        laptop.add(color);
        return laptop;
    }

    @Override
    public boolean equals(Object laptop) {
        if (this == laptop) {
            return true;
        }
        if (laptop == null || laptop.getClass() != this.getClass()) {
            return false;
        }
        Laptop temp = (Laptop) laptop;
        return name == temp.getName()
                && (ram == temp.getRam() || (ram != null && ram.equals(temp.getRam())))
                && (ssd == temp.getSsd() || (ssd != null && ssd.equals(temp.getSsd())))
                && (os == temp.getOs() || (os != null && os.equals(temp.getOs())))
                && (color == temp.getColor() || (color != null && color.equals(temp.getColor())));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        final Laptop laptop = this;
        result = prime * result + ((laptop.getName() == null) ? 0 : laptop.getName().hashCode());
        result = prime * result + laptop.getRam();
        result = prime * result + laptop.getSsd();
        result = prime * result + ((laptop.getOs() == null) ? 0 : laptop.getOs().hashCode());
        result = prime * result + ((laptop.getColor() == null) ? 0 : laptop.getColor().hashCode());
        return result;
    }

    @Override
    public String toString() {
        return this.getList().toString();
    }

    @Override
    public int compareTo(Laptop arg0) {
        Laptop b = this;
        Integer bName = (arg0.getName() == null) ? 0 : b.getName().compareTo(arg0.getName());
        // print(b.getName(), arg0.getName(), bName);
        Integer bRam = (arg0.getRam() == null) ? 0 : b.getRam().compareTo(arg0.getRam());
        // print(b.getRam().toString(), arg0.getRam().toString(), bRam);
        Integer bSsd = (arg0.getSsd() == null) ? 0 : b.getSsd().compareTo(arg0.getSsd());
        ;
        // print(b.getSsd().toString(), arg0.getSsd().toString(), bSsd);
        Integer bColor = (arg0.getColor() == null) ? 0 : b.getColor().compareTo(arg0.getColor());
        // print(b.getColor(), arg0.getColor(), bColor);
        Integer bOs = (arg0.getOs() == null) ? 0 : b.getOs().compareTo(arg0.getOs());
        // print(b.getOs(), arg0.getOs(), bOs);
        if (bName != 0) {
            return bName;
        } else if (bRam != 0) {
            return bRam;
        } else if (bSsd != 0) {
            return bSsd;
        } else if (bColor != 0) {
            return bColor;
        }
        return bOs;
    }

    public void print(String a, String b, Integer c) {
        System.out.print(a + "+" + b + "=" + c.toString());
        System.out.println();
    }

}