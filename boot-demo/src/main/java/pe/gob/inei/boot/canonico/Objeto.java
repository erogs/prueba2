package pe.gob.inei.boot.canonico;

/**
 * Created by Erick Gonzales on 6/11/2016
 */
public class Objeto {

    private int id;
    private String name;

    public Objeto(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
