package YT.day2;

public class stringMethod {

    public static void main(String[] args) {
        
        String name = "Avadh Bhesaniya";        

        System.out.println(name);
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.length());
        System.out.println(name.charAt(2));

        System.out.println(name.replace(" ", "_"));

        System.out.println(name.replace("Avadh", "Meet"));

        // detect space 

        String text = "hello dear,  nice to   meet you";
        System.out.println(text.indexOf("   "));
        System.out.println(text.indexOf("  "));

    }
    
}

