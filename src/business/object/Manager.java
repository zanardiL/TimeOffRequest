package business.object;

import enums.Shift;

public class Manager {
    private String name;
    private String id;
    private Shift shift;

    public Manager(
            String name,
                   String id,
                   Shift shift
    ) {
        this.name = name;
        this.id = id;
        this.shift = shift;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Shift getShift() {
        return shift;
    }

    public void setShift(Shift shift) {
        this.shift = shift;
    }
}
