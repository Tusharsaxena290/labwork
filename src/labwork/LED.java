package labwork;

public class LED {
    private String colourname;
    private boolean working;

    public String getColourname() {
        return colourname;
    }

    public boolean isWorking() {
        return working;
    }
    public void setColourname(String colourname){
        this.colourname=colourname;
    }

    public void setWorking(boolean working) {
        this.working = working;
    }
    public LED(String colourname, boolean working){
        this.colourname=colourname;
        this.working=working;
    }

}


