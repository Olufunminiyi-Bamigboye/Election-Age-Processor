package validator;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ElectionAgeProcessorTest{

    private ElectionAgeProcessor electionAgeProcessor;
    @BeforeEach
    void setUp() {
        electionAgeProcessor = new ElectionAgeProcessor();
    }

    @Test
    void shouldReturnTrueIfStudentIsAgeEighteenAndAbove(){
        boolean age = electionAgeProcessor.isEligibleToVote(19);
        Assertions.assertTrue(age);
    }

    @Test
    void shouldReturnFalseIfStudentIsBelowAgeEighteen(){
        boolean age = electionAgeProcessor.isEligibleToVote(11);
        Assertions.assertFalse(age);
    }
}