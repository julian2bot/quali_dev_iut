import java.util.ArrayList;

public class Box{
    ArrayList<String> contents = new ArrayList<String>();
    
    public void add(String truc) {
        this.contents.add(truc);
    }
    public int nbObjet() {
        return this.contents.size();
    }
    public void retire(String objetARetirer)
        throws ThingNotFound 
        {
            if (this.contents.contains(objetARetirer)){
                this.contents.remove(objetARetirer);    
            } else {
                throw new ThingNotFound();
            }
    }
    
}
class Thing{
    String name;
    public Thing(String name){
    this.name = name;
    }
}
