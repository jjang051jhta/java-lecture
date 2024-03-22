public class Rectangle {
    private int x,y,width,height;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public Rectangle(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
    public int square() {
        return width*height;
    }
    public void show() {
        System.out.printf("좌표(%d,%dy)이고 넓이가 %d, 높이가 %d 인 사각형 \n"
                ,x,y,width,height);
    }
    public boolean contatins(Rectangle rect) {
        if(rect.x > x && rect.y > y
           && rect.x+rect.width < x + width
           && rect.y+rect.height < y + height
        ) {
            return true;
        }
        return false;
    }
}
