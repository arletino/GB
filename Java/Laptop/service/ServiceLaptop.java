package Java.Laptop.service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import Java.Laptop.data.Laptop;

public class ServiceLaptop {
    private List<Laptop> listLaptop = new ArrayList<>();

    public void create(String manufacturerProduct, String nameProduct, String typeOS, String color, String capacityRam, String capacityRom) {
        String params = manufacturerProduct + " " + nameProduct + " " + typeOS 
        + " " + color + " " + capacityRam + " " + capacityRom;
        if (checkParams(params)){
            int id = listLaptop.size();
            Laptop laptop = new Laptop(id, manufacturerProduct, nameProduct, typeOS, color, 
                                        Integer.parseInt(capacityRam), Integer.parseInt(capacityRom));
            if(!listLaptop.contains(laptop)){
                listLaptop.add(laptop);
            }
            System.out.println("Laptop add");
        } else {
            System.out.println("Input null or wrong data, laptop not created");
        }
        
    }
    
    public void createFromString(String laptop){
        String[] params = laptop.split(" ");
        create(params[0], params[1], params[2], params[3], params[4], params[4]);  
    }

    static boolean checkParams(String laptop){
        String[] params = laptop.split(" ");
        int numParams = 6;
        if (params.length != numParams){
            return false;
        }
        for (String string : params) {
            if(string == null){
                return false;
            }
        }
        try{
            Integer.parseInt(params[5]);
            Integer.parseInt(params[4]);
            return true;
        }catch (NumberFormatException e){
            return false;
        }
    }
    
    public Set<Laptop> getSetLaptop(){
        return new HashSet<>(listLaptop);  
    }


    public void deleteLaptop(int id){
        if (-1 != id && id < listLaptop.size()){
            listLaptop.remove(id);
            restartId();
        } else{
            System.out.println("Wrong input data");
        }
    }
    public void restartId(){
        for (int i = 0; i < listLaptop.size(); i++) {
            listLaptop.get(i).setId(i);
        }
    }

    
}
