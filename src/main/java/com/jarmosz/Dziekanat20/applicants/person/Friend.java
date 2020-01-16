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
public class Friend implements Person {


    @Builder.Default
    private double priority;
    private double complainTime;
    private ApplicantType type;


    @Override
    public void reactOnWaiting() {
        this.complainTime += 15;
    }

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
}
