package com.jarmosz.Dziekanat20.applicants.person;

import com.jarmosz.Dziekanat20.applicants.ApplicantType;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Builder
@ToString
@Getter
@Setter
public class Dean implements Person {


    @Builder.Default
    private double priority;
    private ApplicantType type;
    private int waitingRounds;


    //Zwalnianie pracownika
    @Override
    public void reactOnWaiting() { }

    @Override
    public String tellSomethingAbout() {
        return toString();
    }

    @Override
    public ApplicantType sayType() {
        return this.type;
    }

    @Override
    public double howIAmImportantHere() {
        return this.priority;
    }

    @Override
    public void waitOneMoreRound() {
        waitingRounds+=1;
    }
}
