package com.stackthread.unknown;

public class Test{
public static void main(String... args) {
        Tyre t = new RadialTyre();
        int a = 10;
        t.front(a);
 
}
}
class Tyre {
    public void front() throws IllegalMonitorStateException{
        System.out.println("Tire");
    }
 
    public void front(int a) {
        System.out.println("Radial Tire with long");
    }
}
 
 
 
class RadialTyre extends Tyre {
	@Override
    public void front() throws RuntimeException {
        System.out.println("Radial Tire");
    }
    public void front(int a) throws RuntimeException {
        System.out.println("Radial Tire with int");
    }
}
