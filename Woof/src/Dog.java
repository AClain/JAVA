public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    public void woof () {
        int min = 1;
        int max = 10;
        double random = Math.floor(Math.random()*(max-min+1)+min);

        StringBuilder output = new StringBuilder();

        for (; random > 0 ; random--) {
            output.append(" woof");
        }

        System.out.println(this.getName() + " says: " + output.toString().trim() + "!");
    }
}
