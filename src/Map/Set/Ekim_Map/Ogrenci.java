package Map.Set.Ekim_Map;

public class Ogrenci {

    private String name;
    private String surName;
    private int averageNo;


    public Ogrenci(){

    }

    public Ogrenci(String name, String surName, int averageNo) {
        this.name = name;
        this.surName = surName;
        this.averageNo = averageNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public int getAverageNo() {
        return averageNo;
    }

    public void setAverageNo(int averageNo) {
        this.averageNo = averageNo;
    }
}
