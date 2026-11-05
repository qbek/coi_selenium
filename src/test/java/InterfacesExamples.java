import org.junit.jupiter.api.Test;

public class InterfacesExamples {


    private interface Komunikacja {
        void wsiadam();
    }


    private class Tramwaj implements Komunikacja {

        public void wsiadamTramwaj() {
            System.out.println("Podjezdzam, otwieram, dryn dryn, zamykam, odjezdzam");
        }

        @Override
        public void wsiadam() {
            System.out.println("Podjezdzam, otwieram, dryn dryn, zamykam, odjezdzam");
        }
    }

    private class Autobus implements Komunikacja {

        public void wsiadamAutobus() {
            System.out.println("Podjezdzam, ssssss, otwieram, zamykam, sssss, odjezdzam");
        }


        @Override
        public void wsiadam() {
            System.out.println("Podjezdzam, ssssss, otwieram, zamykam, sssss, odjezdzam");
        }
    }


    @Test
    public void resonableExample() {
        Komunikacja pojazd = new Autobus();
//        Tramwaj tram = new Tramwaj();
//
        pojazd.wsiadam();
//        tram.wsiadamTramwaj();



    }

}
