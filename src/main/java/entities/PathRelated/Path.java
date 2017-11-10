package entities.PathRelated;

import entities.MapEdge;
import entities.MapNode;
import java.util.ArrayList;

public class Path {
    private ArrayList<MapNode> nodes;
    private ArrayList<MapEdge> connectors;
    private MapNode startNode;
    private MapNode endNode;

    public boolean addNode(MapNode node)
    {
        if (nodes.contains(node)) {
            nodes.add(node);
            return true;
        }
        return false;
    }
    public boolean addEdge(MapEdge edge)
    {
        if (connectors.contains(edge)) {
            connectors.add(edge);
            return true;
        }
        return false ;
    }

    public ArrayList<MapEdge> getConnectors() {
        return connectors;
    }
    public ArrayList<MapNode> getNodes() {
        return nodes;
    }
}