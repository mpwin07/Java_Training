import java.util.*;
public class Codec {

    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        return longUrl;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return shortUrl;
    }

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        Codec codec = new Codec();

        String url = sc.nextLine();;

        String shortUrl = codec.encode(url);
        System.out.println("Encoded URL: " + shortUrl);

        String originalUrl = codec.decode(shortUrl);
        System.out.println("Decoded URL: " + originalUrl);
    }
}
