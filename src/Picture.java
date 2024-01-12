public class Picture
{
    private Square wall;
    private Square wall2;
    private Square garageDoor;
    private Square gWindow;
    private Square gWindow2;
    private Square gWindow3;
    private Square gWindow4;
    private Square gWindow5;
    private Square backround;
    private boolean drawn;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        wall = new Square(550, 400);
        wall2 = new Square(550, 400);
        garageDoor = new Square(450, 400);
        gWindow = new Square(50, 50);
        gWindow2 = new Square(50, 50);
        gWindow3 = new Square(50, 50);
        gWindow4 = new Square(50, 50);
        gWindow5 = new Square(50, 50);
        backround = new Square(4000, 4000);
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

            wall.moveHorizontal(200);
            wall.moveVertical(560);
            wall.changeColor("wall");
            wall.makeVisible();

            wall2.moveHorizontal(750);
            wall2.moveVertical(590);
            wall2.changeColor("wall2");
            wall2.makeVisible();

            garageDoor.moveHorizontal(250);
            garageDoor.moveVertical(650);
            garageDoor.changeColor("garage");
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

        }
    }


}
