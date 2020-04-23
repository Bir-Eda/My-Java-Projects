package sevencreating_classes;

public class ShapeClass {
    char symbol;
    int width;
    int heigth;

    public ShapeClass() {
        this.symbol = '*';
        this.width = 10;
        this.heigth = 10;
    }

    public ShapeClass(char symbol, int width, int heigth) {
        this.symbol = symbol;
        this.width = width;
        this.heigth = heigth;
    }

    public void pyramid() {
        for (int i = 0; i < this.heigth; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(this.symbol + " ");
            }
            System.out.println();
        }
    }
        public void rectangle(){
            for (int k = 0; k <this.heigth; k++) {
                for(int l=1; l<this.width; l++){
                System.out.print(this.symbol + " ");
            }
            System.out.println();
        }
    }
}
