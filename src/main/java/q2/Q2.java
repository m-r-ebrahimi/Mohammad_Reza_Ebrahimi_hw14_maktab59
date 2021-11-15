package q2;

import java.util.function.Function;

public class Q2 {
    public static void main(String[] args) {
        //Check checkString=(s)->s.charAt(0)==s.charAt(s.length()-1)?true:false;
        String text1 = "Lorem ipsum dolor sit amet consectetur, adipisicing elit. Dignissimos consectetur placeat itaque, sed modi laudantium doloremque repellendus ratione quos amet eum incidunt ab aspernatur tenetur reprehenderit corporis natus aut hic sit eligendi labore iusto! Harum quod quae, saepe architecto fuga distinctio, quam molestiae, alias minus nisi porro ullam culpa Lorem";
        String text2 = "Lorem ipsum dolor sit amet consectetur, adipisicing elit. Dignissimos consectetur placeat itaque, sed modi laudantium doloremque repellendus ratione quos amet eum incidunt ab aspernatur tenetur reprehenderit corporis natus aut hic sit eligendi labore iusto! Harum quod quae, saepe architecto fuga distinctio, quam molestiae, alias minus nisi porro ullam culpa";
        Check checkText = () -> s -> {
            String[] words = s.split(" ");
            return words[0].equals(words[words.length - 1]);
        };
        System.out.println(checkText.check().apply(text1));
        System.out.println(checkText.check().apply(text2));

    }
}
