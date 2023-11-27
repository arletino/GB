package Java.Laptop.data;

public class Laptop extends Product implements Comparable<Object>{

    private String typeOS, color;
    private Integer capacityRam, capacityRom;
    
    public Laptop(String manufacturerProduct, String nameProduct, String typeOS, String color, Integer capacityRam, Integer capacityRom) {
        super(manufacturerProduct, nameProduct);
        this.typeOS = typeOS;
        this.color = color;
        this.capacityRam = capacityRam;
        this.capacityRom = capacityRom;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = ((super.hashCode() == 0) ? 1 : super.hashCode());
        result = prime * result + ((typeOS == null) ? 0 : typeOS.hashCode());
        result = prime * result + ((color == null) ? 0 : color.hashCode());
        result = prime * result + ((capacityRam == null) ? 0 : capacityRam.hashCode());
        result = prime * result + ((capacityRom == null) ? 0 : capacityRom.hashCode());
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
        Laptop other = (Laptop) obj;
        if (!super.equals((Product) other)){
            return false;
        }
        if (typeOS == null) {
            if (other.typeOS != null)
                return false;
        } else if (!typeOS.equals(other.typeOS))
            return false;
        if (color == null) {
            if (other.color != null)
                return false;
        } else if (!color.equals(other.color))
            return false;
        if (capacityRam == null) {
            if (other.capacityRam != null)
                return false;
        } else if (!capacityRam.equals(other.capacityRam))
            return false;
        if (capacityRom == null) {
            if (other.capacityRom != null)
                return false;
        } else if (!capacityRom.equals(other.capacityRom))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "manufacturerProduct=" + super.getManufacturerProduct() +
                ", nameProduct=" + super.getNameProduct() + ", typeOS=" + typeOS + 
                ", color=" + color + ", capacityRam=" + capacityRam + ", capacityRom=" + capacityRom + 
                ", dateAdd=" + super.getDateAdd();
    }

    public String getTypeOS() {
        return typeOS;
    }

    public void setTypeOS(String typeOS) {
        this.typeOS = typeOS;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getCapacityRam() {
        return capacityRam;
    }

    public void setCapacityRam(Integer capacityRam) {
        this.capacityRam = capacityRam;
    }

    public Integer getCapacityRom() {
        return capacityRom;
    }

    public void setCapacityRom(Integer capacityRom) {
        this.capacityRom = capacityRom;
    }

    @Override
    public int compareTo(Object arg0) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'compareTo'");
    }
    
}
