public class Calculator {


}


//Kuna enne kolmandat käiku ei ole võimalik võita siis tasuks pärast kolmandat ringi kontrollida summasid. Kuna
//Kasutaja sisestab INTEGERI siis saab sellest tulenevalt vaadata liidetavate summasid pärast kuuendat käiku(2xcpu+2xmängija)
//samas tuleb kontrollida, kas see asukoht on võetud emma kumma (CPU / MÄNGIJA) poolt, et ei tekiks ülekirjutamist.
// Kokku vaja lihtsalt liita Array liikmed ja saadud summaga saab UNIT testi kaudu teada võitja!

//        1 2 3     X
//        4 5 6       X O
//        7 8 9       O X

//        1+2+3 = 6
//        3+6+9 = 18
//        1+4+7 = 12
//        1+5+9 = 15
//        3+5+7 = 15
//        4+5+6 = 15