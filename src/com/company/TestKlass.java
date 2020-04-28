package com.company;

public class TestKlass {

    public static void main(String[] args) {
        Aine a1 = new Aine("Objektorienteeritud programmeerimine", "RT - 016", 5);
        System.out.println(a1.getName());
        System.out.println(a1);
        a1.setEap(6);
        System.out.println(a1.getEap());
        System.out.println(a1.nrOfClasses());


        Aine a2 = new Aine();
        Aine a3 = new Aine("Automaattestimine", "RT - 017", 8);
        Aine a4 = new Aine("Suhtlemispsühholoogia", "RT - 018", 2);

        Aine[] ained = {a1, a2, a3, a4};
        System.out.println("Õppekava ained:");
        for (Aine aine : ained) {
            System.out.println(aine);
        }

        Oppekava eek1 = new Oppekava("eek1", ained);
        System.out.println(eek1);
        System.out.println(eek1.getOppekavaKood());
        System.out.println(eek1.getAined());

        // Kui sa seda loed, Inna, siis ma muutsin "getAined" getteri niimodi, et ta tagastaks toString value.
        // Kas see on õigesti tehtud või võib see pigem probleeme tekitada?
    }
}
