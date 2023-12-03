package Java.Laptop.data;

import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Product {
    private int id;
    private String manufacturerProduct;
    private String nameProduct;
    private String dateAdd;
    
    public Product(int id, String manufacturerProduct, String nameProduct) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm ");
        Date dateStamp = new Date();
        this.id = id;
        this.manufacturerProduct = manufacturerProduct;
        this.nameProduct = nameProduct;
        this.dateAdd = dateFormat.format(dateStamp);
    }

    public String getManufacturerProduct() {
        return manufacturerProduct;
    }

    public void setManufacturerProduct(String manufacturerProduct) {
        this.manufacturerProduct = manufacturerProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getDateAdd() {
        return dateAdd;
    }

    public void setDateAdd(String dateAdd) {
        this.dateAdd = dateAdd;
    }

    @Override
    public String toString() {
        return "Product [id= "+ id + ", manufacturerProduct=" + manufacturerProduct + ", nameProduct=" + nameProduct
                + ", dateAdd=" + dateAdd + "]";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((manufacturerProduct == null) ? 0 : manufacturerProduct.hashCode());
        result = prime * result + ((nameProduct == null) ? 0 : nameProduct.hashCode());
        result = prime * result + ((dateAdd == null) ? 0 : dateAdd.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Product other = (Product) obj;
        if (manufacturerProduct == null) {
            if (other.manufacturerProduct != null)
                return false;
        } else if (!manufacturerProduct.equals(other.manufacturerProduct))
            return false;
        if (nameProduct == null) {
            if (other.nameProduct != null)
                return false;
        } else if (!nameProduct.equals(other.nameProduct))
            return false;
        return true;
    }
    
}
