package Practicee;

class Plane{
     void fly(){
        System.out.println("Plane is Flying");
    }
}

class CargoPlane extends Plane{
     void fly() {
        System.out.println("CargoPlane is flying");
    }
    void Carry(){
        System.out.println("CargoPalne is Carrying");
    }

}

class PassengerPlane extends Plane{
     void fly(){
        System.out.println("Passenger plane is flying");
    }
    void Carry(){
        System.out.println("PassengerPlane is Carrying");
    }

}

class FighterPlane extends Plane{
    void fly(){
        System.out.println("Passenger plane is flying");
    }
    void Carry(){
        System.out.println("FigheterPalne is Carrying");
    }

}

public class PolyMerphism {
    public static void main(String[] args) {
       CargoPlane cp = new CargoPlane();
       PassengerPlane pp = new PassengerPlane();
       FighterPlane fp = new FighterPlane();
       Plane ref;
       ref = cp;
       ref.fly();
       ((CargoPlane) ref).Carry();

       ref = pp;
       ref.fly();
        ((PassengerPlane) ref).Carry();

       ref=fp;
       ref.fly();
       ((FighterPlane) ref).Carry();
    }
}
