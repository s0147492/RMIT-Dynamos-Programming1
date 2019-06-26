import java.util.Random;

public class MonsterPersonalAttributes {

    private String monName, monSpecies;

    public MonsterPersonalAttributes(Random random) {
        monName = getMonsterName(random);
        monSpecies = getMonsterSpecies(random);
    }

    // Randomly roll a monster name
    private String getMonsterName(Random random) {

        String[] nameArray = {
                "Austin",
                "Benson",
                "Christopher",
                "Dominic",
                "Eli",
                "Ferris",
                "Grady",
                "Henry",
                "Isaiah",
                "Josiah",
                "Kingston",
                "Landon",
                "Magnus",
                "Nico",
                "Orion",
                "Princeton",
                "Quinn",
                "Rafe",
                "Sawyer",
                "Thomas",
                "Urbain",
                "Vance",
                "Weston",
                "Xavier",
                "York",
                "Zeke"};

        return nameArray[random.nextInt(nameArray.length)];
    }

    private String getMonsterSpecies(Random random) {
        String[] speciesList = new String[]{"Adlet",
                "Asterius",
                "Blafard",
                "Boggart",
                "Centaur",
                "Cynocephaly",
                "Ent",
                "Fairy",
                "Faun",
                "Garuda",
                "Goblin",
                "Gorgon",
                "Harpy",
                "Jengu",
                "Jinn",
                "Lamia",
                "Lich",
                "Manticore",
                "Mermaid",
                "Minotaur",
                "Mothman",
                "Nāga",
                "Ogre",
                "Orc",
                "Pan",
                "Sandman",
                "Satyr",
                "Siren",
                "Sphinx",
                "Tikbalang",
                "Troll",
                "Triton",
                "Yacuruna"};
        return speciesList[random.nextInt(speciesList.length)];
    }

    public String getMonName() {
        return monName;
    }

    public void setMonName(String monName) {
        this.monName = monName;
    }

    public String getMonSpecies() {
        return monSpecies;
    }

    @Override
    public String toString() {
        return "MonsterPersonalAttributes{" +
                "monName='" + monName + '\'' +
                ", monSpecies='" + monSpecies + '\'' +
                '}';
    }
}
