package elevenabstractpackage;

    public class Tiling extends Quete {
        private String material;
        Tiling(){
            super();
        }

        public Tiling(String customerName, int totalSquareFeet, double price, String material) {
            super(customerName, totalSquareFeet, price);
            this.material = material;

        }
        public String getMaterial() {
            return material;
        }

        public void setMaterial(String material) {
            this.material = material;
        }
       // double calculateTotalPrice(){
           // return super.price*super.totalSquareFeet;

            double calculateTotalMaterialPrice(){
                if(this.material.equalsIgnoreCase("Wood")){
                    return this.getTotalSquareFeet()*2.4;
                }
                else if(this.material.equalsIgnoreCase("tile")) {
                    return this.getTotalSquareFeet() * 1.99;
                }else{
                    System.out.println("Wrong material");
                    return 0.0;
                }
            }


            double calculateTotalPrice(){
                 this.setPrice(calculateTotalMaterialPrice()+4*this.getTotalSquareFeet());
                 return this.getPrice();
            }

        void printQuete() {
            System.out.println(""+
                    "Customer Name: \t"+this.getCustomerName()+
                    "Total sqrFeet : \t"+this.getTotalSquareFeet()+
                    "Material Price : \t"+this.calculateTotalMaterialPrice()+
                    "Total Price : \t"+this.getPrice());

            }

        @Override
        public String toString() {
            return "Tiling{" +
                    "material='" + material + '\'' +
                    '}';
        }
    }
