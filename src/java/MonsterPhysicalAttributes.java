import java.util.Random;

public class MonsterPhysicalAttributes {

    private String hairColour, bodyColour, eyeColour, armColour, legColour;
    private String faceType;
    private int armCount, legCount;
    private int height; // Height is in centimeters
    private int weight; // Weight is in kilograms

    public MonsterPhysicalAttributes(Random random) {
        hairColour = getColour(random);
        bodyColour = getColour(random);
        eyeColour = getColour(random);
        armColour = getColour(random);
        legColour = getColour(random);
        faceType = getFaceType(random);
        armCount = random.nextInt(10);
        legCount = random.nextInt(10);
        height = random.nextInt(400);
        weight = random.nextInt(4000);
    }

    private String getColour(Random random) {
        String[] colourList = new String[]{
                "red",
                "orange",
                "yellow",
                "green",
                "blue",
                "indigo",
                "violet"
        };
        return colourList[random.nextInt(colourList.length)];
    }

    private String getFaceType(Random random) {
        String[] faceTypeList = new String[]{
                "long",
                "short",
                "pointy",
                "scaly",
                "wide",
                "flat",
                "floppy"
        };
        return faceTypeList[random.nextInt(faceTypeList.length)];
    }

    public String getHairColour() {
        return hairColour;
    }

    public String getBodyColour() {
        return bodyColour;
    }

    public String getEyeColour() {
        return eyeColour;
    }

    public String getArmColour() {
        return armColour;
    }

    public String getLegColour() {
        return legColour;
    }

    public String getFaceType() {
        return faceType;
    }

    public int getArmCount() {
        return armCount;
    }

    public int getLegCount() {
        return legCount;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "MonsterPhysicalAttributes{" +
                "hairColour='" + hairColour + '\'' +
                ", bodyColour='" + bodyColour + '\'' +
                ", eyeColour='" + eyeColour + '\'' +
                ", armColour='" + armColour + '\'' +
                ", legColour='" + legColour + '\'' +
                ", faceType='" + faceType + '\'' +
                ", armCount=" + armCount +
                ", legCount=" + legCount +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }
}
