package ip.collection8;

import lombok.Data;

import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;

enum BlogPostType {
    NEWS,
    REVIEW,
    GUIDE
}

class Tuple {
    BlogPostType type;
    String author;
}

@Data
class BlogPost {
    String title;
    String author;
    BlogPostType type;
    int likes;
}

public class StreamTests {
    static ArrayList<BlogPost> posts = new ArrayList<>();

    public static void main(String[] args) {
        initilize();
        //Group by single type of blog post
        System.out.println("All blog posts in Map<BlogPostType, List<Blog>>");
        System.out.println(posts.stream().collect(Collectors.groupingBy((bp) -> {
            return bp.type;
        })));

        System.out.println("All blog posts count by the type Map<BlogPostType, Integer>");
        System.out.println(posts.stream().collect(Collectors.groupingBy((bp) -> {
            return bp.type;
        }, Collectors.counting())));

        System.out.println(posts.stream().collect(Collectors.groupingBy((bp) -> {
            return bp.type;
        }, Collectors.averagingInt((bp) -> {
            return bp.likes;
        }))));


    }


    public static void initilize() {
        BlogPost blogPost = new BlogPost();
        blogPost.author = "George";
        blogPost.likes = 100;
        blogPost.title = "Something";
        blogPost.type = BlogPostType.REVIEW;
        posts.add(blogPost);

        blogPost = new BlogPost();
        blogPost.author = "George";
        blogPost.likes = 100;
        blogPost.title = "Something";
        blogPost.type = BlogPostType.NEWS;
        posts.add(blogPost);

        blogPost = new BlogPost();
        blogPost.author = "George";
        blogPost.likes = 100;
        blogPost.title = "Something";
        blogPost.type = BlogPostType.GUIDE;
        posts.add(blogPost);

        blogPost = new BlogPost();
        blogPost.author = "George";
        blogPost.likes = 10;
        blogPost.title = "Something";
        blogPost.type = BlogPostType.REVIEW;
        posts.add(blogPost);

    }
}
