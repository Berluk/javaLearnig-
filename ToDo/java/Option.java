public enum Option{
    ADD(0, "Add new Task"), TAKE(1, "Make another task"), EXIT(2, "Exit"), TAKEandREMOOVE(3, "Take and remove");

    int option;
    String desc;

    public int getOption() {
        return option;
    }

    public String getDesc() {
        return desc;
    }

    Option(int option, String desc) {
        this.option = option;
        this.desc = desc;
    }
    static Option readOption(int option){
        return Option.values()[option];
    }

    @Override
    public String toString() {
        return option + " - " + desc;
    }
}
