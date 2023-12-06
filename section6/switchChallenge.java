public class switchChallenge {
    public static void main(String[] args) {
        char letter = 'a';
        switch (letter){
            case 'a':
                System.out.println("A is Able");
                break ;
            case 'b':
                System.out.println("B is Bake");
                break;
            case 'c':
                System.out.println("C is Charlie");
                break;
            case 'd':
                System.out.println("D is Dog");
                break;
            case 'e':
                System.out.println("E is Easy");
                break;
            default:
                System.out.println("char " + letter + " is not found");
                break;

        }
    }
}
