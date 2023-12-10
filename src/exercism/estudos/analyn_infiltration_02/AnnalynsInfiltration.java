package exercism.estudos.analyn_infiltration_02;

/*
 * Instruções
Neste exercício, você implementará a lógica da missão para um novo jogo de RPG que um amigo está desenvolvendo.
A personagem principal do jogo é Annalyn, uma garota corajosa com um cachorro de estimação feroz e leal. Infelizmente, 
 ocorre um desastre, pois sua melhor amiga foi sequestrada enquanto procurava frutas na floresta. Annalyn tentará encontrar e libertar 
 sua melhor amiga, opcionalmente levando seu cachorro com ela nesta missão.

Depois de algum tempo seguindo a trilha de sua melhor amiga, ela encontra o acampamento onde sua melhor amiga está presa.
Acontece que existem dois sequestradores: um cavaleiro poderoso e um arqueiro astuto.

Tendo encontrado os sequestradores, Annalyn considera quais das seguintes ações ela pode realizar:

Ataque rápido: um ataque rápido pode ser feito se o cavaleiro estiver dormindo, pois leva tempo para ele colocar a armadura,
então ficará vulnerável.

Espião: o grupo pode ser espionado se pelo menos um deles estiver acordado. Caso contrário, espionar é uma perda de tempo.

Sinalizar prisioneiro: o prisioneiro pode ser sinalizado por meio de sons de pássaros se o prisioneiro estiver acordado e o arqueiro estiver dormindo, pois os arqueiros são treinados em sinalização de pássaros, para que possam interceptar a mensagem.
Prisioneiro livre: Annalyn pode tentar entrar furtivamente no acampamento para libertar o prisioneiro. Isso é algo arriscado de se fazer e só pode ter sucesso de duas maneiras:
Se Annalyn tiver seu cachorro de estimação, ela poderá resgatar o prisioneiro se o arqueiro estiver dormindo. O cavaleiro está com medo do cachorro e o arqueiro não terá tempo de se preparar antes que Annalyn e o prisioneiro possam escapar.
Se Annalyn não tem seu cachorro, ela e o prisioneiro devem ser muito sorrateiros! Annalyn pode libertar o prisioneiro se o prisioneiro estiver acordado e o cavaleiro e o arqueiro estiverem dormindo, mas se o prisioneiro estiver dormindo, eles não poderão ser resgatados: o prisioneiro ficaria surpreso com a aparição repentina de Annalyn e acordaria o cavaleiro e o arqueiro.
Você tem quatro tarefas: implementar a lógica para determinar se as ações acima estão disponíveis com base no estado dos três personagens encontrados na floresta e se o cachorro de estimação de Annalyn está presente ou não.
*/

public class AnnalynsInfiltration {

    // ataque rapido se o cavaleiro estiver dormindo
    public static boolean canFastFastAttack(boolean knigthIsWake) {

        if (knigthIsWake == false) {
            return true;
        }
        return false;
    }

    // verifica se o grupo pode ser espionado
    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake,
            boolean prisonerIsAwake) {

        // se um deles estiver acordadoz
        if (knightIsAwake == true || archerIsAwake == true || prisonerIsAwake == true) {
            return true;
        }
        return false;
    }

    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
        if (archerIsAwake == false && prisonerIsAwake == true) {

            return true;
        }

        return false;
    }

    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake,
            boolean prisonerIsAwake, boolean petDogIsPresent) {

        if (petDogIsPresent == true && archerIsAwake == false &&
                knightIsAwake == true && prisonerIsAwake == true) {
            return true;

        }
        if (petDogIsPresent == false && prisonerIsAwake == true && knightIsAwake == false
                && archerIsAwake == false) {
            return true;
        }
        if (prisonerIsAwake == false) {
            return false;
        }

        return false;

    }

}
