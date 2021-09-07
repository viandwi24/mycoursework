package manajemenbarang;

/**
 *
 * @author viandwi24
 */
public class Barang {
    private String name;
    private Integer cost;
    
    public void setName(String value)
    {
        this.name = value;
    }
    
    public String getName()
    {
        return this.name;
    }
    
    public void setCost(Integer value)
    {
        this.cost = value;
    }
    
    public Integer getCost()
    {
        return this.cost;
    }
}
