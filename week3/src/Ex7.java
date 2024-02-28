public class Ex7 {
    public static void main(String[] args) {
        String sentence = "I am a student at RMIT!";

        System.out.println("The length of the string is: " + sentence.length());
        System.out.println("The fourth character is " + sentence.charAt(3));
        System.out.println("does the sentence end with \"RMIT!\"" + sentence.endsWith("RMIT!"));
        System.out.println("does the sentence start with \"I\"" + sentence.startsWith("I"));

        String lowerCase = sentence.toLowerCase();
        String upperCase = sentence.toUpperCase();

        System.out.println("upper and lower case comparison: " + lowerCase.equals(upperCase));
        System.out.println("upper and lower case comparison: " + lowerCase.equalsIgnoreCase(upperCase));


        String sentenceToCompare = "I am a student";
        System.out.println(sentenceToCompare);
        System.out.println("Are the 2 sentences equal? " + sentence.equals(sentenceToCompare));

        String anotherSentence = sentenceToCompare.concat(" at RMIT!");
        System.out.println(anotherSentence);
        System.out.println("Are the 2 sentences equal? " + sentence.equals(anotherSentence));


    }
}
