package src.lab4_1;

import java.util.ArrayList;

public class HelpDesk {
    ArrayList<Route> routes = new ArrayList<Route>();

    public void addRoute(String time, String destination, int cost){
        routes.add(new Route(time, destination, cost));
    }

    public class Route {
        String time;
        String destination;
        int cost;

        public Route(String time, String destination, int cost){
            this.time = time;
            this.destination = destination;
            this.cost = cost;
        }

        public void setCost(int cost) {
            this.cost = cost;
        }

        public void setDestination(String destination) {
            this.destination = destination;
        }

        public void setTime(String time) {
            this.time = time;
        }

        @Override
        public String toString() {
            return "Route{" +
                    "time='" + time + '\'' +
                    ", destination='" + destination + '\'' +
                    ", cost=" + cost +
                    '}';
        }
    }
}
