// Aggregation is the has-a relationship, we can connect 1 or more classes as in given example, which proves its a one
// way association.

// Below shows association between classes AggregationTutorial and Tutorial, Tutorial has a Aggregation tutorial.

package com.rajat.JavaAggregationAndAssociation;

class Tutorial{
    String batchId;
    String tutorialName;
    String languageName;

    Tutorial(String batchId, String tutorialName, String languageName){
        this.batchId = batchId;
        this.tutorialName = tutorialName;
        this.languageName = languageName;
    }
}

public class AggregationTutorial {
    int tutorialId;
    Tutorial tutorialDetails;

    AggregationTutorial(int tutorialId){
        this.tutorialId = tutorialId;
    }

    public static void main(String[] args) {
        AggregationTutorial aggregationTutorial = new AggregationTutorial(23);
        aggregationTutorial.tutorialDetails = new Tutorial("001","Aggregation", "Java");

        System.out.println("Tutorial ID : " + aggregationTutorial.tutorialId);
        System.out.println("Batch ID : " + aggregationTutorial.tutorialDetails.batchId);
        System.out.println("Tutoprial Name : " + aggregationTutorial.tutorialDetails.tutorialName);
        System.out.println("Language Name : " + aggregationTutorial.tutorialDetails.languageName);
    }

}
