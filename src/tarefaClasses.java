
/**
 * Objeto bolsa
 * @author Gabriel
 */
public class tarefaClasses {

    private Integer itemMax;
    private Integer weightMax;
    private String owner;
    private Integer itemUsed;
    private Integer weightUsed;

    public tarefaClasses(Integer itemMax, Integer weightMax, String owner, Integer itemUsed, Integer weightUsed) {
        this.itemMax = itemMax;
        this.weightMax = weightMax;
        this.owner = owner;
        this.itemUsed = itemUsed;
        this.weightUsed = weightUsed;
    }

    public Integer getItemMax(){
        return itemMax;
    }
    
    public Integer getWeightMax(){
        return weightMax;
    }

    public String getOwner(){
        return owner;
    }

    public Integer getItemUsed(){
        return itemUsed;
    }

    public Integer getWeightUsed(){
        return weightUsed;
    }
    
    public void setItemMax(Integer newItemMax){
        this.itemMax = newItemMax;
    }

    public void setWeightMax(Integer newWeightMax){
        this.weightMax = newWeightMax;
    }
    
    public void setOwner(String newOwner){
        this.owner = newOwner;
    }
    
    public void setItemUsed(Integer newItemUsed){
        this.itemUsed = newItemUsed;
    }
    
    public void setWeightUsed(Integer newWeightUsed){
        this.weightUsed = newWeightUsed;
    }
    
}
