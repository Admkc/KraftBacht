package eylul_07_Encapsulation;

public class Kitap {

    private String name;
    private String edit;
    private int page=152;

    private boolean isTop;



    public boolean getIsTop(){
        return isTop;
    }

    public void setIsTop(boolean isTop){
        this.isTop=isTop;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEdit() {
        return edit;
    }

    public void setEdit(String edit) {
        this.edit = edit;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }
}
class test{
    public static void main(String[] args) {
        Kitap mykitab=new Kitap();
        mykitab.setName("adem");
        System.out.println(mykitab.getName());
        System.out.println(mykitab.getPage());


    }
}
