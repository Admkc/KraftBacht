package repeat_Lesson;

public class Encapsulation_ {
//encapsulation : data hiding / private access modifier
    //use getter and setter methods
    //getter : read only --return the private data-no parameter
    //setter :write only --does not return --has parameter

    private String rank="quarter";
    private int score=10;

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

}
class main{
    public static void main(String[] args) {
        Encapsulation_ soldier=new Encapsulation_();
        boolean hit=false;
        int score= soldier.getScore();
        if (true){
            soldier.setScore(score+=10);
            soldier.setRank("upperrank");

        }
        System.out.println(soldier.getRank());
        System.out.println(soldier.getScore());

    }
}
