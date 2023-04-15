package controller;

import model.Voter;
import java.util.List;

public interface VoterControllerInterface {

    List<Voter> registerThousandVoters();
    double countsPercentageOfValidVotes(List<Voter> listOfVoters);
    double countsPercentageOfWhiteVotes(List<Voter> listOfVoters);
    double countsPercentageOfNullVotes(List<Voter> listOfVoters);

}