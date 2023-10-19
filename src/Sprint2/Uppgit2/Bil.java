package Sprint2.Uppgit2;

public class Bil {



    private double actualMiles;
    private double milesLastYear;
    private double gasUsedSinceLastYear;

    public Bil (double milesLastYear, double actualMiles, double gasUsedSinceLastYear){
        this.actualMiles = actualMiles;
        this.milesLastYear = milesLastYear;
        this.gasUsedSinceLastYear = gasUsedSinceLastYear;
    }

    public double getFörbrukning (){
        return gasUsedSinceLastYear  / (actualMiles - milesLastYear);
    }

    public double getMilesSinceLastYear(){
        return actualMiles - milesLastYear;
    }

    public String utskrift(){
        String utskrift = ("Antal körda mil: " + (actualMiles - milesLastYear) + "\nAntal liter bensin: " + gasUsedSinceLastYear + "\nFörbrukning per mil: " + (gasUsedSinceLastYear / (actualMiles - milesLastYear)));
        return utskrift;
    }




}
