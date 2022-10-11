public class BabyParrot {
    private final String species;
    private final int age;
    private String name;

    private final double weight;

    public BabyParrot(String species, int age, double weight) {
        this.species = species;
        this.age = age;
        this.name = "Unnamed"; // use a default value of the 'empty string'
        this.weight = weight;
    }

    public void setName(String newName) {
        name = newName;
    }

    // note this method RETURNS a String
    public String parrotInfo() {
        String str = String.format("Species: %s\n", species);
        str += String.format("Name: %s\n", name);
        str += String.format("Age: %s\n", age);
        str += String.format("Weight: %s lb\n", weight);
        return str;
    }
}
