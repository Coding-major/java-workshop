class Engine {
    void start(){}
    void revolve(){}
    void stop(){}
} 

class Wheel {
    void inflate(){}
}

class Window {
    void rollup(){}
    void rolldown(){}
}

class Door {
    Window theWindow = new Window();
    void open(){};
    void close(){};
}

public class composition {
    class Car {
        Engine newEngine = new Engine();
        Wheel[] newWheel = new Wheel[4];
        Door newDoor1 = new Door();
        Door newDoor2 = new Door();

        void setWheell() {
            for (int i=0; i<4; i++) {
            newWheel[i] = new Wheel();
            }
        }
        
    }

    public static void main() {
        Car newCar = new Car();
        newCar.newDoor1.theWindow.rolldown();
    }
    
}
