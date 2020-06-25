package com.h.huaweimappolyline.models.polylineResponse;

import java.util.List;

public class Routes {
    private List<Paths> paths;

    public List<Paths> getPaths ()
    {
        return paths;
    }

    public void setPaths (List<Paths> paths)
    {
        this.paths = paths;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [paths = "+paths+"]";
    }
}
