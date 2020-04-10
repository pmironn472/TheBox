//HomeWork from https://repl.it/@shadowx_e_/ClassRelations




public class TheBox {



    public static void main(String[] args) {

        Box.print();
        Box.isTheBoxBig();
        Box.isTheBoxOk();
        Box.boxSizePrint();
        Box.boxVolumePrint();

    }
}
///////////////////////
class Box{
    // class property
    static int value = 1001;
    static boolean broken = false;
    // HW1: add properties (width,height,length) // cm
    static int width = 153;
    static int height = 124;
    static int lenght = 124;
    static double volume = 100000;

    // class methods
    static void print(){
        System.out.println( "This is a BOX = " + value );
    }
    static void isTheBoxBig(){
        if( value > 1000 ){
            System.out.println( "This is a BIG BOX" );
        }else{
            System.out.println( "This is a SMALL BOX" );
        }
    }
    static void isTheBoxOk(){
        if( broken ){
            System.out.println( "The BOX is BROKEN!" );
        }else{
            System.out.println( "The BOX is OK!" );
        }
    }

    static void boxSizePrint(){
        System.out.println( "The box size is " + width +"cm "+"x "+ height +"cm " +"x "+ lenght + "cm "  );

    }
    static void boxVolumePrint(){
        volume = width * height * lenght;
        System.out.println( "The box size is " + volume +" cm3");

    }

    // HW2: add method -> prints() -> box size
    // 100cm x 50cm x 20cm
    // prints() -> volume
    // 100000cm3


}
