package com.h.huaweimappolyline.models.polylineBody;

public class PolylineBody {

    private Origin origin;

    private Destination destination;

    public Origin getOrigin ()
    {
        return origin;
    }

    public void setOrigin (Origin origin)
    {
        this.origin = origin;
    }

    public Destination getDestination ()
    {
        return destination;
    }

    public void setDestination (Destination destination)
    {
        this.destination = destination;
    }

    @Override
    public String toString() {
        return "ClassPojo [origin = " + origin + ", de";
    }
}
