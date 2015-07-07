
public class Main {

    public static void main(String[] args) {

        //Liga
        Liga italy = new Liga("Italy");
        Liga spanyol = new Liga("Spanyol");

        //Divisi
        Divisi serieA = new Divisi("Serie A",italy);
        Divisi serieB = new Divisi("Serie B",italy);
        Divisi divisi1 = new Divisi("Divisi1",spanyol);
        Divisi divisi2 = new Divisi("Divisi2",spanyol);

        //Klub
        Klub inter = new Klub("Inter Milan",serieA,italy);
        Klub milan = new Klub("Ac Milan",serieA,italy);
        Klub asroma = new Klub("AS Roma",serieB,italy);
        Klub juventus = new Klub("Juventus",serieB,italy);
        Klub real = new Klub("Real Madrid",divisi1,spanyol);
        Klub barca = new Klub("Barcelona",divisi1,spanyol);
        Klub villa = new Klub("Villareal",divisi2,spanyol);
        Klub espanyol = new Klub("Espanyol",divisi2,spanyol);

        italy.setDaftarDivisi(serieA);
        italy.setDaftarDivisi(serieB);
        spanyol.setDaftarDivisi(divisi1);
        spanyol.setDaftarDivisi(divisi2);

        serieA.setDaftarKlub(inter);
        serieA.setDaftarKlub(milan);
        serieB.setDaftarKlub(asroma);
        serieB.setDaftarKlub(juventus);
        divisi1.setDaftarKlub(real);
        divisi1.setDaftarKlub(barca);
        divisi2.setDaftarKlub(villa);
        divisi2.setDaftarKlub(espanyol);

        //1. Get daftar divisi by nama liga

        System.out.println("Soal Nomer 1 :");
        System.out.println("Divisi Liga Italy : ");
        italy.getDaftarDivisi("Italy");
        System.out.println();

        //2. Get Daftar Klub by nama liga

        System.out.println("Soal Nomer 2 :");
        System.out.println("Klub Liga Italy : ");
        serieA.getDaftarKlubLiga("Italy");
        System.out.println("Liga Spanyol : ");
        divisi1.getDaftarKlubLiga("Spanyol");
        System.out.println();

        //3. Get Daftar Klub by nama Divisi

        System.out.println("Soal Nomer 3 :");
        System.out.println("Serie A : ");
        serieA.getDaftarKlubDivisi("Serie A");
        System.out.println("Serie B : ");
        serieB.getDaftarKlubDivisi("Serie B");
        System.out.println();

        //4. Get Klub ini berada di divisi mana by nama Klub

        System.out.println("Soal Nomer 4 :");
        inter.getDivisi("Inter Milan");
        real.getDivisi("Real Madrid");
        System.out.println();

        //5. Get Klub ini berada di liga apa by nama Klub

        System.out.println("Soal Nomer 5 :");
        real.getLiga("Real Madrid");
    }
}

