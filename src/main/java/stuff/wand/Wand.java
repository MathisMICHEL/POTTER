package stuff.wand;

public class Wand {
    public String name;
    public float size;
    public Core core;

    public Wand(String name,float size,Core core){
        this.name = name;
        this.size = size;
        this.core=core;
    }
    public String getName(){
        return name;}

    public float getSize(){
        return size;}

    public String getCore(){
        return core.getName();}

}
