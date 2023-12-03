package Java.Laptop.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import Java.Laptop.data.Laptop;



public class FilterLaptops {
    private Map<Integer, String> filterParam = new HashMap<>();
    private List<Laptop> filterList;
    private List<Laptop> basicList;

    public FilterLaptops(Set<Laptop> setLaptop){
        filterParam.put(0, "");
        filterParam.put(1, "");
        filterParam.put(2, "");
        filterParam.put(3, "");
        filterParam.put(4, "");
        filterParam.put(5, "");
        basicList = new ArrayList<>(setLaptop);
    }
    public Set<Laptop> getfilterLaptop(){
        filtering();
        return new HashSet<Laptop>(filterList);
    }
    public void setFilterParams(List<String> params){
        for (int i = 0; i < params.size(); i++) {
            filterParam.put(i, params.get(i));
        }
    }
    public String getFilterParams(){
        return filterParam.toString();
    }

    public void filtering(){
        filterList = new ArrayList<>();
        for (Laptop laptop : basicList) {
            List<String> param = laptop.getLaptopParam();
            for (String string : param) {
                System.out.print(string+ " ");
            }
            boolean flag = true;
            for (int i = 0; i < filterParam.size(); i++) {
                String temp = filterParam.get(i); 
                if (!temp.equals("")){
                    try{
                        System.out.println(param.get(i+1));
                        if (Integer.parseInt(temp) != Integer.parseInt(param.get(i+1))){
                            flag = false;
                        }

                    }catch (NumberFormatException e){
                        System.out.println(param.get(i+1));
                        if (!param.get(i+1).contains(temp)){
                            flag = false;
                        }
                    } 
                }
            }
            if(flag){
                filterList.add(laptop);
            }
        }
    }


    
}
