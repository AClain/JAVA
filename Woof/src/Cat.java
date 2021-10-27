public class Cat extends Animal {
    public Cat (String name) {
        super(name);
    }

    public void meow() {
        int min = 1;
        int max = 10;
        double random = Math.floor(Math.random()*(max-min+1)+min);

        StringBuilder output = new StringBuilder("me");

        for (; random > 0 ; random--) {
            output.append("e");
        }

        output.append("ow");

        System.out.println(this.getName() + " says: " + output.toString().trim() + "!");
    }
}
