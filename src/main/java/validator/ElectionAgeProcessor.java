package validator;

public class ElectionAgeProcessor {
    boolean age;

    /*
    - determine whether a student is eligible to vote
    - Student is eligible to vote when age is 18 or above
    - Student is ineligible to vote when age is below 18
    - if eligible return TRUE or FALSE

     */
    public boolean isEligibleToVote(int age) {
        //boolean result = false;
        if(age >= 18) {
            return true;
        }
        return false;
    }
}