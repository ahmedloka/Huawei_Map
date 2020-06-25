package com.h.huaweimappolyline.models.polylineResponse;

import java.util.List;

public class Paths {
    private String duration;

    private String durationText;

    private String durationInTrafficText;

    private String durationInTraffic;

    private String distance;

//    private StartLocation startLocation;

    private String startAddress;

    private String distanceText;

    private List<Steps> steps;

//    private EndLocation endLocation;

    private String endAddress;

    public String getDuration ()
    {
        return duration;
    }

    public void setDuration (String duration)
    {
        this.duration = duration;
    }

    public String getDurationText ()
    {
        return durationText;
    }

    public void setDurationText (String durationText)
    {
        this.durationText = durationText;
    }

    public String getDurationInTrafficText ()
    {
        return durationInTrafficText;
    }

    public void setDurationInTrafficText (String durationInTrafficText)
    {
        this.durationInTrafficText = durationInTrafficText;
    }

    public String getDurationInTraffic ()
    {
        return durationInTraffic;
    }

    public void setDurationInTraffic (String durationInTraffic)
    {
        this.durationInTraffic = durationInTraffic;
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

    public String getStartAddress ()
    {
        return startAddress;
    }

    public void setStartAddress (String startAddress)
    {
        this.startAddress = startAddress;
    }

    public String getDistanceText ()
    {
        return distanceText;
    }

    public void setDistanceText (String distanceText)
    {
        this.distanceText = distanceText;
    }

    public List<Steps> getSteps ()
    {
        return steps;
    }

    public void setSteps (List<Steps> steps)
    {
        this.steps = steps;
    }
//
//    public EndLocation getEndLocation ()
//    {
//        return endLocation;
//    }
//
//    public void setEndLocation (EndLocation endLocation)
//    {
//        this.endLocation = endLocation;
//    }

    public String getEndAddress ()
    {
        return endAddress;
    }

    public void setEndAddress (String endAddress)
    {
        this.endAddress = endAddress;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [duration = "+duration+", durationText = "+durationText+", durationInTrafficText = "+durationInTrafficText+", durationInTraffic = "+durationInTraffic+", distance = "+distance+", startLocation = "+", startAddress = "+startAddress+", distanceText = "+distanceText+", steps = "+", endLocation = "+", endAddress = "+endAddress+"]";
    }
}
