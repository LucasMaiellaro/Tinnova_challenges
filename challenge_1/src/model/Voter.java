package model;

public class Voter {

    private int id;
    private int vote;

    public Voter(int id, int vote) {
        this.id = id;
        this.vote = vote;
    }

    @Override
    public String toString() {
        return "Voter{" +
                "id=" + id +
                ", vote=" + vote +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getVote() {
        return vote;
    }

    public void setVote(int vote) {
        this.vote = vote;
    }

}