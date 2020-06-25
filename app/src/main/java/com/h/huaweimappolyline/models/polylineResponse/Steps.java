package com.h.huaweimappolyline.models.polylineResponse;

import java.util.List;

public class Steps {
    private String duration;

    private String orientation;

    private String durationText;

    private String distance;

//    private StartLocation startLocation;

    private String instruction;

    private String action;

    private String distanceText;

//    private EndLocation endLocation;

    private List<Polyline> polyline;

    private String roadName;

    public String getDuration ()
    {
        return duration;
    }

    public void setDuration (String duration)
    {
        this.duration = duration;
    }

    public String getOrientation ()
    {
        return orientation;
    }

    public void setOrientation (String orientation)
    {
        this.orientation = orientation;
    }

    public String getDurationText ()
    {
        return durationText;
    }

    public void setDurationText (String durationText)
    {
        this.durationText = durationText;
    }

    public String getDistance ()
    {
        return distance;
    }

    public void setDistance (String distance)
    {
        this.distance = distance;
    }

//    public StartLocation getStartLocation ()
//    {
//        return startLocation;
//    }
//
//    public void setStartLocation (StartLocation startLocation)
//    {
//        this.startLocation = startLocation;
//    }

    public String getInstruction ()
    {
        return instruction;
    }

    public void setInstruction (String instruction)
    {
        this.instruction = instruction;
    }

    public String getAction ()
    {
        return action;
    }

    public void setAction (String action)
    {
        this.action = action;
    }

    public String getDistanceText ()
    {
        return distanceText;
    }

    public void setDistanceText (String distanceText)
    {
        this.distanceText = distanceText;
    }

//    public EndLocation getEndLocation ()
//    {
//        return endLocation;
//    }
//
//    public void setEndLocation (EndLocation endLocation)
//    {
//        this.endLocation = endLocation;
//    }

    public List<Polyline> getPolyline ()
    {
        return polyline;
    }

    public void setPolyline (List<Polyline> polyline)
    {
        this.polyline = polyline;
    }

    public String getRoadName ()
    {
        return roadName;
    }

    public void setRoadName (String roadName)
    {
        this.roadName = roadName;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [duration = "+duration+", orientation = "+orientation+", durationText = "+durationText+", distance = "+distance+", startLocation = "+", instruction = "+instruction+", action = "+action+", distanceText = "+distanceText+", endLocation = "+", polyline = "+polyline+", roadName = "+roadName+"]";
    }
}
