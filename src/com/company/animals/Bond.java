package com.company.animals;

public class Bond {
    public void eat() {
        toString("give food!");
    }

    public void food()  {
        toString("take it");
    }

    public void nofood()  {
        toString("stop it!");
    }

    public void play(boolean b) {
        if (b == true) {
            toString("Destroy this world!");
        } else {
            toString("really, dude?");
        }
    }
    private void toString(String info) {
        System.out.println(info);
    }
}
