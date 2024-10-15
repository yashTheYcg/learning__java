import java.util.*;

// This is the whole example of Adjacency List -> arrays of Arraylist
// and example of undirectional unweighted graph

public class Classroom1{
    
    // Edge class for Graphs
    static class Edge{

        int src; //source
        int destination; //destination

        public Edge (int s, int d){
            this.src = s;
            this.destination = d;
        }
    }
    
    // function for creating the graphs
    public static void createGraph(ArrayList<Edge> graph[]){
        // this is for creating empty arraylist ,
        // because before this, it is in null state
        // for converting it to empty state we have
        // to do this 
        for(int i=0;i<graph.length;i++){
            graph[i] = new ArrayList<Edge>();
        }

        // now we are creating our graph

        graph[0].add(new Edge(0, 2));
        
        graph[1].add(new Edge(1, 2));
        graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 1));
        graph[2].add(new Edge(2, 3));
        
        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 2));
        
    }


    // Main class    
    public static void main(String [] args){

        // Lets say our vertices will be V=4;
        int V = 4;

        ArrayList<Edge> graph[] = new ArrayList[V];
        
        // Creating our Graph
        createGraph(graph);


        // printing the neighbour of the 2 vertex
        for(int i=0;i<graph[2].size();i++){
            Edge e = graph[2].get(i);
            System.out.println(e.destination);
        }

    }
}