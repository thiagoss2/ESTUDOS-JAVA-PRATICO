package exercism.estudos.analyn_infiltration_02;

public class TestAnalynInfiltration {
    public static void main(String[] args) {

        boolean knightIsAwake = false;
        boolean archerIsAwake = true;
        boolean prisonerIsAwake = false;
        boolean petDogIsPresent = true;

        // vamos verificar se o grupo pode ser espionado

        boolean isVerificado = AnnalynsInfiltration.canSpy(knightIsAwake, archerIsAwake, prisonerIsAwake);

        boolean prisoneiroLivre = AnnalynsInfiltration.canFreePrisoner(knightIsAwake, archerIsAwake,
                prisonerIsAwake, petDogIsPresent);

        System.out.println(prisoneiroLivre);

    }

}
