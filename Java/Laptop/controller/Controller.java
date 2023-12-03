package Java.Laptop.controller;

import java.util.List;

import Java.Laptop.service.FilterLaptops;
import Java.Laptop.service.IOFile;
import Java.Laptop.service.ServiceLaptop;
import Java.Laptop.view.View;

public class Controller {
    private IOFile ioFile = new IOFile();
    private ServiceLaptop serviceLaptop = new ServiceLaptop();
    private View view = new View();
    private FilterLaptops filterLaptops;


    public void createLaptop(String manufacturerProduct, String nameProduct, String typeOS, String color, String capacityRam, String capacityRom){
        serviceLaptop.create(manufacturerProduct, nameProduct, typeOS, color, capacityRam, capacityRom);
        
    }

    public void createOnConsole(){
        String laptop = view.getOnConsole();
        serviceLaptop.createFromString(laptop);
    }
    
    public void getSetLaptops(){
        serviceLaptop.getSetLaptop();
    }
    public void printOnConsole(){
        view.printOnConsole(serviceLaptop.getSetLaptop());
    }

    public void deleteLaptop(){
        int id = view.getIdConsole();
            serviceLaptop.deleteLaptop(id);
    }

    public void crateFilter(){
        filterLaptops= new FilterLaptops(serviceLaptop.getSetLaptop());
        List<String> filterParams = view.getFilterParamsOnConsole();
        filterLaptops.setFilterParams(filterParams);
        view.printOnConsole(filterLaptops.getfilterLaptop());
    }

}
