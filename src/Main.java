public class Main {
    public static void main(String[] args) {
        Rectangle rec1 = new Rectangle();
        System.out.println("chieu dai : "+ rec1.getLength());
        System.out.println("chieu rong: "+ rec1.getWidth());
        System.out.println("chu vi is: "+ rec1.getChuVi());
        System.out.println("dien tich is: "+ rec1.getDienTich());

        System.out.println();

        Rectangle rec2 = new Rectangle(4,3);
        System.out.println("chieu dai : "+ rec2.getLength());
        System.out.println("chieu rong: "+ rec2.getWidth());
        System.out.println("chu vi is: "+ rec2.getChuVi());
        System.out.println("dien tich is: "+ rec2.getDienTich());

        rec2.speak();
    }
}

class Rectangle{
    private int length;
    private int width;

    public Rectangle(){
        length = 1;
        width = 1;
    }

    Rectangle(int length, int width){ // không ghi public thì sẽ là modifier mặc định (check zalo and dis)
        this.length = length;
        this.width = width;
    }

    void speak(){
        System.out.println(this.length +" hi");
    }

    int getChuVi(){
        return (width + length) * 2;
    }

    int getDienTich(){
        return width * length;
    }

    // (Nếu cần) Getter, to get in the private
    public int getLength() {
        return length;
    }
    public int getWidth() {
        return width;
    }

}