package clyderide;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Driver {

    private String name;
    private int age;
    private int complaints;

    public double experienceScore() {
        double score = 1.0;

        if (age < 25) {
            score = score * 0.6;
        }

        if (age >= 75) {
            score = score * 0.8;
        }

        score = score - (complaints * 0.2);

        if (score < 0) {
            score = 0.0;
        }

        return score;
    }
}