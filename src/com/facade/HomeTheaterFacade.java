package com.facade;

public class HomeTheaterFacade {
    private TheaterLight theaterLight;
    private Popcorn popcorn;
    private Streo streo;
    private Screen screen;
    private Projector projector;
    private DVDPlayer dvdPlayer;

    public HomeTheaterFacade() {
        this.theaterLight = TheaterLight.getInstance();
        this.popcorn = Popcorn.getInstance();
        this.streo = Streo.getInstance();
        this.screen = Screen.getInstance();
        this.projector = Projector.getInstance();
        this.dvdPlayer = DVDPlayer.getInstance();
    }
    public void ready(){
        popcorn.on();
        popcorn.play();
        screen.down();
        projector.on();
        streo.on();
        theaterLight.dim();
    }
    public void play(){
        dvdPlayer.play();
    }
    public void pause(){
        dvdPlayer.pause();
    }
    public void end(){
        popcorn.off();
        theaterLight.bright();
        screen.up();
        projector.off();
        streo.off();
        dvdPlayer.off();
    }
}
