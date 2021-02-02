import attractions.Dodgems;
import attractions.Playground;
import attractions.RollerCoaster;
import behaviours.IReviewed;
import org.junit.Before;
import org.junit.Test;
import people.Visitor;
import stalls.CandyflossStall;
import stalls.IceCreamStall;
import stalls.ParkingSpot;
import stalls.TobaccoStall;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {

    ThemePark themePark;
    Dodgems dodgems;
    Playground playground;
    RollerCoaster rollerCoaster;
    CandyflossStall candyflossStall;
    IceCreamStall iceCreamStall;
    TobaccoStall tobaccoStall;
    Visitor visitor1;
    Visitor visitor2;

    @Before
    public void setUp(){
        themePark = new ThemePark();
        dodgems = new Dodgems("Bumper Cars", 5);
        playground = new Playground("Fun Zone", 7);
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        candyflossStall = new CandyflossStall("Candy Land", "Harry Belafonte", ParkingSpot.A1, 6);
        iceCreamStall = new IceCreamStall("Dream Cones", "Vanilla Ice", ParkingSpot.A4, 9);
        tobaccoStall = new TobaccoStall("Jacks Drum", "Jack Jarvis", ParkingSpot.B1, 2);
        visitor1 = new Visitor(10, 146, 5.43);
        visitor2 = new Visitor(15, 201, 14.63);
    }

    //    public void canReturnArrayOfAttractionsAndStalls(){
//        assertEquals(<>, themePark.getAllReviewed());
//    }
    @Test
    public void getSizeOfArray(){
        assertEquals(0, themePark.attractionAndStallCount());
    }

    @Test
    public void canAddAttractionAndStalls(){
        themePark.addAttractionOrStall(dodgems);
        themePark.addAttractionOrStall(playground);
        themePark.addAttractionOrStall(rollerCoaster);
        themePark.addAttractionOrStall(candyflossStall);
        themePark.addAttractionOrStall(iceCreamStall);
        themePark.addAttractionOrStall(tobaccoStall);
        assertEquals(6, themePark.attractionAndStallCount());
    }

    @Test
    public void canVisit(){
        themePark.visit(visitor1, playground);
        assertEquals(1, playground.getVisitCount());
        assertEquals(1, visitor1.visitedAttractionsCount());
    }

    @Test
    public void canReturnAllAttractions(){
        themePark.addAttractionOrStall(dodgems);
        themePark.addAttractionOrStall(playground);
        themePark.addAttractionOrStall(rollerCoaster);
        themePark.addAttractionOrStall(candyflossStall);
        themePark.addAttractionOrStall(iceCreamStall);
        themePark.addAttractionOrStall(tobaccoStall);
        themePark.getAttractions();
        assertEquals(3, themePark.getAttractions().size());

    }