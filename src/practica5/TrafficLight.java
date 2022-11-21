package practica5;

public class TrafficLight {
    TrafficState state;

    public TrafficLight() {
        this.state = new RedTrafficState(this);
    }
    public void changeState(TrafficState state) {
        this.state = state;
    }
    public void doAction() throws InterruptedException {
        this.state.doAction();
    }
}
