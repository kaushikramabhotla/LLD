public class Pay {
    private Mode mode;

    public Pay(Mode mode) {
        this.mode = mode;
    }

    public String display() {
        this.mode.mode();
        return null;
    }
    public void setMode(Mode mode){
        this.mode = mode;
    }

}
