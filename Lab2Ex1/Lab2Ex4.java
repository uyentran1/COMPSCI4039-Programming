public class Lab2Ex4 {
    public static void main(String[] args) {
        int numberOfPies = 20;
        int numberOfPeople = 7;

        int piesPerPerson = numberOfPies / numberOfPeople;
        int remainingPies = numberOfPies % numberOfPeople;

        System.out.println("There are " + piesPerPerson + " pies each, and " + remainingPies + " leftover.");
    }
}