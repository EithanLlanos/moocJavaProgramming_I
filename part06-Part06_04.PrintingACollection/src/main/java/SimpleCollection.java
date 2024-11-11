
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    
    public String toString(){
        String txt = "The collection "+this.name;
        
        if(this.elements.isEmpty()) return txt+" is empty.";
        if(this.elements.size()==1) txt+=" has 1 element:";
        else txt+=" has "+elements.size()+" elements:";
        for (String e : elements) {
            txt+="\n"+e;
        }
        return txt;
    }
    
}
