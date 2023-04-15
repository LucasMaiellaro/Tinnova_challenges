package controller;

import model.Voter;
import java.util.ArrayList;
import java.util.List;

public class VoterController implements VoterControllerInterface {

    public List<Voter> registerThousandVoters() {
        List<Voter> listOfVoters = new ArrayList<>();

        for (int i = 0; i < 1000; i++) {
            if (i < 800) {
                listOfVoters.add(new Voter(i, 1));
            } else if (i < 950 ) {
                listOfVoters.add(new Voter(i, 2));
            } else {
                listOfVoters.add(new Voter(i, 3));
            }
        }

        System.out.println("Lista de eleitores criada: " + listOfVoters);
        return listOfVoters;
    }

    public double countsPercentageOfValidVotes(List<Voter> listOfVoters) {
        int voteCounter = 0;

        for (int i = 0; i < listOfVoters.size(); i++) {
            if (listOfVoters.get(i).getVote() == 1) {
                voteCounter++;
            }
        }

        double result = ((double) voteCounter / listOfVoters.size()) * 100;

        System.out.println("Votos válidos: " + voteCounter);
        return result;
    }

    public double countsPercentageOfWhiteVotes(List<Voter> listOfVoters) {
        int voteCounter = 0;

        for (int i = 0; i < listOfVoters.size(); i++) {
            if (listOfVoters.get(i).getVote() == 2) {
                voteCounter++;
            }
        }

        double result = ((double) voteCounter / listOfVoters.size()) * 100;

        System.out.println("Votos brancos: " + voteCounter);
        return result;
    }

    public double countsPercentageOfNullVotes(List<Voter> listOfVoters) {
        int voteCounter = 0;

        for (int i = 0; i < listOfVoters.size(); i++) {
            if (listOfVoters.get(i).getVote() == 3) {
                voteCounter++;
            }
        }

        double result = ((double) voteCounter / listOfVoters.size()) * 100;

        System.out.println("Votos Nulos: " + voteCounter);
        return result;
    }

}