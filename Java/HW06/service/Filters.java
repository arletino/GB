package Java.HW06.service;

import java.util.LinkedHashMap;

import Java.HW06.laptop.Laptop;

public class Filters {
    private String field;
    private String downBorder, upperBorder;

    public Filters(LinkedHashMap<String, String> params) {
        this.field = params.get("field");
        this.downBorder = params.get("lower");
        this.upperBorder = params.get("higher");

    }
    public String downBorderGet(){
        return this.downBorder; 
    }
    public String upperBorderGet(){
        return this.upperBorder; 
    }

    public Boolean FieldSub(Laptop laptop){
        String field = this.field; 
        String lower = this.downBorder;
        String higher = this.upperBorder;;
        if (field.equals("name")) {
            return (laptop.getName().compareTo(lower) >= 0 && laptop.getName().compareTo(higher) < 0);
        } else if (field.equals("color")) {
            return (laptop.getColor().compareTo(lower) >= 0 && laptop.getColor().compareTo(higher) < 0);
        } else if (field.equals("os")) {
            return (laptop.getOs().compareTo(lower) >= 0 && laptop.getOs().compareTo(higher) < 0);
        } else if (field.equals("ram")) {
            Integer above = Integer.parseInt(this.downBorder);
            Integer below = Integer.parseInt(this.upperBorder);
            return (laptop.getRam() >= above && laptop.getRam() < below);
        } else if (field.equals("ssd")) {
            Integer above = Integer.parseInt(this.downBorder);
            Integer below = Integer.parseInt(this.upperBorder);
            return (laptop.getSsd() >= above && laptop.getSsd() < below);
        }
        return false;
    }

    public Boolean FieldL(Laptop laptop) {
        String field = this.field; 
        String lower = this.downBorder;
        String higher = this.upperBorder;
        if (field == "name") {
            return (laptop.getName().compareTo(lower) >= 0);
        } else if (field == "color") {
            return (laptop.getColor().compareTo(lower) >= 0);
        } else if (field == "os") {
            return (laptop.getOs().compareTo(lower) >= 0);
        } else if (field == "ram") {
            Integer above = Integer.parseInt(this.downBorder);
            Integer below = Integer.parseInt(this.upperBorder);
            return (laptop.getRam() >= above);
        } else if (field == "ssd") {
            Integer above = Integer.parseInt(this.downBorder);
            Integer below = Integer.parseInt(this.upperBorder);
            return (laptop.getSsd() >= above);
        }
        return false;
    }

    public Boolean FieldH(Laptop laptop) {
        String field = this.field; 
        String lower = this.downBorder;
        String higher = this.upperBorder;
        if (field == "name") {
            return (laptop.getName().compareTo(higher) < 0);
        } else if (field == "color") {
            return (laptop.getColor().compareTo(higher) < 0);
        } else if (field == "os") {
            return (laptop.getOs().compareTo(higher) < 0);
        } else if (field == "ram") {
            Integer above = Integer.parseInt(this.downBorder);
            Integer below = Integer.parseInt(this.upperBorder);
            return (laptop.getRam() < below);
        } else if (field == "ssd") {
            Integer above = Integer.parseInt(this.downBorder);
            Integer below = Integer.parseInt(this.upperBorder);
            return (laptop.getSsd() < below);
        }
        return false;
    }

}
