package enumcompos;

import entities.Comment;
import entities.Post;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Exercicio120 {

    public void exercicio120() throws ParseException {

        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date dataViagem = sdf1.parse("21/06/2018 13:05:44");
        Post post = new Post(dataViagem, "Viajando para Nova Zelandia", "Estou viajando para um excelente país", 12);
        Comment comentario1 = new Comment("Faça uma boa viagem");
        Comment comentario2 = new Comment("Wow!!! Q TOP!!!");
        post.addCommentario(comentario1);
        post.addCommentario(comentario2);


        System.out.println(post);
    }
}
