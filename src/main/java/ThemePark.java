import attractions.Attraction;
import attractions.Dodgems;
import behaviours.IReviewed;
import org.w3c.dom.Attr;
import people.Visitor;

import java.util.ArrayList;
import java.util.HashMap;

public class ThemePark {

    private ArrayList<IReviewed> attractionsAndStalls;

    public ThemePark(){
        this.attractionsAndStalls = new ArrayList<IReviewed>();
    }

    public ArrayList<IReviewed> getAllReviewed(){
        return this.attractionsAndStalls;
    }

    public int attractionAndStallCount(){
        return this.attractionsAndStalls.size();
    }

    public void addAttractionOrStall(IReviewed attractionOrStall){
        this.attractionsAndStalls.add(attractionOrStall);
    }

    public void visit(Visitor visitor, Attraction attraction){
        attraction.incrementVisitCount();
        visitor.addAttraction(attraction);
    }

    public HashMap<String, Integer> getAllReviewsAsHashMap(){
        HashMap allReviews = new HashMap<String, Integer>();
        for(IReviewed iReviewed : this.attractionsAndStalls){
            allReviews.put(String.format(iReviewed.getName()), Integer.valueOf(iReviewed.getRating()));

        }
        return allReviews;
    }

    public ArrayList<Attraction> getAttractions(){
        ArrayList allAttractions = new ArrayList(Attraction);
        for(IReviewed iReviewed : this.attractionsAndStalls){
            allAttractions.add(iReviewed);
        }
        return allAttractions;
    }


    public ArrayList<IReviewed> getAllowedFor(Visitor visitor){
        ArrayList canVisit = new ArrayList(IReviewed);
        for(IReviewed iReviewed : this.attractionsAndStalls){
            if(iReviewed.getClass() == Attraction){

            }
        }

    }
}