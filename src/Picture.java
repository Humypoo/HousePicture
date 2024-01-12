public class Picture
{
    private Square wall;
    private Square wall2;
    private Square garageDoor;
    private Square window;
    private Square wOutline;
    private Square wOutline2;
    private Square wOutline3;
    private Square wOutline4;
    private Square wOutline5;
    private Square wOutline6;
    private Square window2;
    private Square w2Outline;
    private Square w2Outline2;
    private Square w2Outline3;
    private Square w2Outline4;
    private Square w2Outline5;
    private Square w2Outline6;
    private Square window3;
    private Square w3Outline;
    private Square w3Outline2;
    private Square w3Outline3;
    private Square w3Outline4;
    private Square w3Outline5;
    private Square w3Outline6;
    private Square beam;
    private Square door;
    private Circle doorknob;
    private Square beam2;
    private Square gWindow;
    private Square gWindow2;
    private Square gWindow3;
    private Square gWindow4;
    private Square gWindow5;
    private Square backround;
    private Square outline;
    private Triangle roof;
    private Triangle upstairs;
    private Triangle upstairs2;
    private Triangle wall3;
    private Square roof2;
    private Person man;
    private Triangle roof4;
    private Square roof3;
    private boolean drawn;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        wall = new Square(550, 400);
        wall2 = new Square(550, 400);
        wall3 = new Triangle();
        outline = new Square(570, 10);
        garageDoor = new Square(450, 400);
        beam = new Square(30,390);
        beam2 = new Square(30,390);
        roof = new Triangle();
        roof2 = new Square(825, 250);
        roof3 = new Square(570, 20);
        roof4 = new Triangle();
        upstairs = new Triangle();
        upstairs2 = new Triangle();
        window = new Square(100, 150);
        wOutline = new Square(5, 150);
        wOutline2 = new Square(100, 5);
        wOutline3 = new Square(100, 10);
        wOutline4 = new Square(100, 10);
        wOutline5 = new Square(40, 140);
        wOutline6 = new Square(40, 140);
        window2 = new Square(100, 125);
        w2Outline = new Square(5, 125);
        w2Outline2 = new Square(100, 5);
        w2Outline3 = new Square(100, 10);
        w2Outline4 = new Square(100, 10);
        w2Outline5 = new Square(25, 115);
        w2Outline6 = new Square(25, 115);
        window3 = new Square(200, 125);
        w3Outline = new Square(5, 125);
        w3Outline2 = new Square(200, 5);
        w3Outline3 = new Square(200, 10);
        w3Outline4 = new Square(200, 10);
        w3Outline5 = new Square(25, 115);
        w3Outline6 = new Square(25, 115);
        gWindow = new Square(50, 50);
        gWindow2 = new Square(50, 50);
        gWindow3 = new Square(50, 50);
        gWindow4 = new Square(50, 50);
        gWindow5 = new Square(50, 50);
        backround = new Square(4000, 4000);
        door = new Square(150, 4000);
        doorknob = new Circle();
        man = new Person();
        drawn = false;
    }

    public static void main(String[] args) {
        Picture picture = new Picture();
        picture.draw();
    }

    /**
     * Draw this picture.
     * square -310, -120
     *
     */
    public void draw()
    {
        if(!drawn) {
            backround.moveHorizontal(-310);
            backround.moveVertical(-120);
            backround.changeColor("sky");
            backround.makeVisible();

            roof.changeSize(250, 40);
            roof.moveHorizontal(1400); //1400
            roof.moveVertical(295);
            roof.changeColor("roofMain");
            roof.makeVisible();

            roof2.moveHorizontal(475);
            roof2.moveVertical(310);
            roof2.changeColor("roofMain");
            roof2.makeVisible();

            roof3.moveHorizontal(750);
            roof3.moveVertical(560);
            roof3.changeColor("roofMain");
            roof3.makeVisible();

            upstairs.changeSize(250, 470);
            upstairs.moveHorizontal(850); //1400
            upstairs.moveVertical(205);
            upstairs.changeColor("roofSub");
            upstairs.makeVisible();

            upstairs2.changeSize(235, 440);
            upstairs2.moveHorizontal(850); //1400
            upstairs2.moveVertical(220);
            upstairs2.changeColor("wall2");
            upstairs2.makeVisible();

            roof4.changeSize(340, 610);
            roof4.moveHorizontal(575); //1400
            roof4.moveVertical(220);
            roof4.changeColor("roofMain");
            roof4.makeVisible();

            wall.moveHorizontal(200);
            wall.moveVertical(560);
            wall.changeColor("wall");
            wall.makeVisible();

            wall2.moveHorizontal(750);
            wall2.moveVertical(580);
            wall2.changeColor("wall2");
            wall2.makeVisible();

            door.moveHorizontal(760);
            door.moveVertical(700);
            door.changeColor("wood");
            door.makeVisible();

            doorknob.changeSize(5);
            doorknob.moveHorizontal(960);
            doorknob.moveVertical(860);
            doorknob.changeColor("gold");
            doorknob.makeVisible();
            //
            beam.moveHorizontal(925);
            beam.moveVertical(580);
            beam.changeColor("wood2");
            beam.makeVisible();

            beam2.moveHorizontal(1270);
            beam2.moveVertical(580);
            beam2.changeColor("wood2");
            beam2.makeVisible();

            outline.moveHorizontal(750);
            outline.moveVertical(580);
            outline.changeColor("wood");
            outline.makeVisible();

            wall3.changeSize(300, 550);
            wall3.moveHorizontal(575); //1400
            wall3.moveVertical(240);
            wall3.changeColor("wall");
            wall3.makeVisible();

            window.moveHorizontal(425);
            window.moveVertical(375);
            window.changeColor("inside");
            window.makeVisible();

            wOutline.moveHorizontal(472);
            wOutline.moveVertical(375);
            wOutline.changeColor("roof");
            wOutline.makeVisible();

            wOutline5.moveHorizontal(385);
            wOutline5.moveVertical(380);
            wOutline5.changeColor("wood2");
            wOutline5.makeVisible();

            wOutline6.moveHorizontal(525);
            wOutline6.moveVertical(380);
            wOutline6.changeColor("wood2");
            wOutline6.makeVisible();

            wOutline2.moveHorizontal(425);
            wOutline2.moveVertical(450);
            wOutline2.changeColor("roof");
            wOutline2.makeVisible();

            wOutline3.moveHorizontal(425);
            wOutline3.moveVertical(370);
            wOutline3.changeColor("roof");
            wOutline3.makeVisible();

            wOutline4.moveHorizontal(425);
            wOutline4.moveVertical(520);
            wOutline4.changeColor("roof");
            wOutline4.makeVisible();

            window2.moveHorizontal(700);
            window2.moveVertical(320);
            window2.changeColor("inside");
            window2.makeVisible();

            w2Outline.moveHorizontal(749);
            w2Outline.moveVertical(320);
            w2Outline.changeColor("roof");
            w2Outline.makeVisible();

            w2Outline5.moveHorizontal(800);
            w2Outline5.moveVertical(325);
            w2Outline5.changeColor("wood2");
            w2Outline5.makeVisible();

            w2Outline6.moveHorizontal(675);
            w2Outline6.moveVertical(325);
            w2Outline6.changeColor("wood2");
            w2Outline6.makeVisible();

            w2Outline2.moveHorizontal(700);
            w2Outline2.moveVertical(380);
            w2Outline2.changeColor("roof");
            w2Outline2.makeVisible();

            w2Outline3.moveHorizontal(700);
            w2Outline3.moveVertical(315);
            w2Outline3.changeColor("roof");
            w2Outline3.makeVisible();

            w2Outline4.moveHorizontal(700);
            w2Outline4.moveVertical(440);
            w2Outline4.changeColor("roof");
            w2Outline4.makeVisible();

            window3.moveHorizontal(1010);
            window3.moveVertical(700);
            window3.changeColor("inside");
            window3.makeVisible();

            w3Outline.moveHorizontal(1110);
            w3Outline.moveVertical(700);
            w3Outline.changeColor("roof");
            w3Outline.makeVisible();

            w3Outline5.moveHorizontal(1210);
            w3Outline5.moveVertical(705);
            w3Outline5.changeColor("wood2");
            w3Outline5.makeVisible();

            w3Outline6.moveHorizontal(985);
            w3Outline6.moveVertical(705);
            w3Outline6.changeColor("wood2");
            w3Outline6.makeVisible();

            w3Outline2.moveHorizontal(1010);
            w3Outline2.moveVertical(765);
            w3Outline2.changeColor("roof");
            w3Outline2.makeVisible();

            w3Outline3.moveHorizontal(1010);
            w3Outline3.moveVertical(695);
            w3Outline3.changeColor("roof");
            w3Outline3.makeVisible();

            w3Outline4.moveHorizontal(1010);
            w3Outline4.moveVertical(820);
            w3Outline4.changeColor("roof");
            w3Outline4.makeVisible();

            garageDoor.moveHorizontal(250);
            garageDoor.moveVertical(650);
            garageDoor.changeColor("wood");
            garageDoor.makeVisible();

            gWindow.moveHorizontal(290);
            gWindow.moveVertical(670);
            gWindow.changeColor("inside");
            gWindow.makeVisible();

            gWindow2.moveHorizontal(370);
            gWindow2.moveVertical(670);
            gWindow2.changeColor("inside");
            gWindow2.makeVisible();

            gWindow3.moveHorizontal(450);
            gWindow3.moveVertical(670);
            gWindow3.changeColor("inside");
            gWindow3.makeVisible();

            gWindow4.moveHorizontal(530);
            gWindow4.moveVertical(670);
            gWindow4.changeColor("inside");
            gWindow4.makeVisible();

            gWindow5.moveHorizontal(610);
            gWindow5.moveVertical(670);
            gWindow5.changeColor("inside");
            gWindow5.makeVisible();

            man.changeSize(200, 100);
            man.moveHorizontal(1500);
            man.moveVertical(750);
            man.makeVisible();

        }
    }


}
