package JAVA-notes.Enums;


public enum Level {
    // we define constants here
    HIGH(3),
    MEDIUM(2),
    LOW(1);

    private int lvlNum;

    private Level(int num){
        this.lvlNum = num;
    }

    public int getlvl(){
        return this.lvlNum;
    }

    public void setLvl(int num){
        this.lvlNum = num;
    }
}
    

