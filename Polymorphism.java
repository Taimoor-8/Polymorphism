public class Polymorphism {

    public static void main(String[] args) {
        animal eel = new eel(34 , 100 , "mammal" ,
                "white" , "water" ,"yes" , "yes");

        animal eagle = new eagle(40 , 150 , "bird" ,
                "red" , "yes" , "yes");

        animal crocodile = new crocodile(50 , 200 , "reptile" ,
                "red" , "dry" , "yes" , "hard shell");

        System.out.println(eel);
//        to access subclass fields and attributes
        eel e = (eel) eel;
        System.out.println(e.getDischarge());

        System.out.println(eagle);

        System.out.println(crocodile);
    }
}
