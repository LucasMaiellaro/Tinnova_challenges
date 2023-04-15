import controller.VoterController;
import controller.VoterControllerInterface;
import model.Voter;
import java.util.List;

public class VotingApplication {

    private final VoterControllerInterface voterController;

    public VotingApplication(VoterControllerInterface voterController) {
        this.voterController = voterController;
    }

    public static void main(String[] args) {
        VoterControllerInterface voterController = new VoterController();
        List<Voter> listOfVoters = voterController.registerThousandVoters();

        System.out.println("O percentual de votos válidos é: " + voterController.countsPercentageOfValidVotes(listOfVoters) + "%");
        System.out.println("O percentual de votos brancos é: " + voterController.countsPercentageOfWhiteVotes(listOfVoters) + "%");
        System.out.println("O percentual de votos nulos é: " + voterController.countsPercentageOfNullVotes(listOfVoters) + "%");
    }

}