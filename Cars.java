public class Cars {
        private static String brand = "";
        private static String name ="";
        private static String colour = "";
    public Cars(String brand,String name,String colour)
    {
        this.brand=brand;
        this.name=name;
        this.colour=colour;
    }
    public void display()
    {
        System.out.println("Brand:"+brand,"Name:"+name,"Colour:"+colour);

    }

        public static void main(String args[]) {
                Cars obj1=new Cars("Maruti","Alto","Red");
                obj1.display();
                Cars obj2=new Cars("Honda","Accord","Black");
                obj2.display();

        }

}


